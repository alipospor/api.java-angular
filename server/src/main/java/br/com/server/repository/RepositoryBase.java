package br.com.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.query.Param;

import br.com.server.model.EntityBaseRoot;

@NoRepositoryBean
public interface RepositoryBase<TEntity extends EntityBaseRoot>extends JpaRepository<TEntity, Long>, JpaSpecificationExecutor<TEntity> {

	@Query(value = "SELECT {database_user} FROM :tabela s WHERE s.id=(:id)")
	Object getId(@Param("id") Integer id,@Param("tabela") String Table);
}
