package br.com.server.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import javax.persistence.MappedSuperclass;
import javax.persistence.PreUpdate;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@MappedSuperclass
public abstract class EntityBase extends EntityBaseRoot implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String createdBy;

	private String updatedBy;

	@Temporal(TemporalType.TIMESTAMP)
	private Date createdAt;

	@Temporal(TemporalType.TIMESTAMP)
	private Date updatedAt;

	/**
	 * Sets and getters
	 */
	@PreUpdate
	public void setChangeDate() {
		this.updatedAt = new Date();
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		if (!super.equals(o))
			return false;
		EntityBase that = (EntityBase) o;
		return Objects.equals(createdBy, that.createdBy) && Objects.equals(updatedBy, that.updatedBy)
				&& Objects.equals(createdAt, that.createdAt) && Objects.equals(updatedAt, that.updatedAt);
	}

	@Override
	public int hashCode() {
		return Objects.hash(super.hashCode(), createdBy, updatedBy, createdAt, updatedAt);
	}

	@Override
	public String toString() {
		return "BaseEntityAudit{" + "createdBy='" + createdBy + '\'' + ", updatedBy='" + updatedBy + '\''
				+ ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + "} " + super.toString();
	}
}
