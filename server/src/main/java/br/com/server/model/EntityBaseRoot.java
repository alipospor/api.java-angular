package br.com.server.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;

@MappedSuperclass
public abstract class EntityBaseRoot implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private Long id;

	@Version
	private Long version;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getVersion() {
		return version;
	}

	public void setVersion(Long version) {
		this.version = version;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		EntityBaseRoot that = (EntityBaseRoot) o;
		return Objects.equals(id, that.id) && Objects.equals(version, that.version);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, version);
	}

	@Override
	public String toString() {
		return "BaseEntity{" + "id=" + id + ", version=" + version + '}';
	}
}
