package com.keval.springTour.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "designation", uniqueConstraints = { @UniqueConstraint(columnNames = { "id" }) })
public class Designation {
	
	@Id
	@Column 
	private Long id;
	
	@Column(name = "desg", nullable = false)
	private String desg;

	public Designation() {
	}

	public Designation(String desg) {
		super();
		this.desg = desg;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDesg() {
		return desg;
	}

	public void setDesg(String desg) {
		this.desg = desg;
	}

	
}
