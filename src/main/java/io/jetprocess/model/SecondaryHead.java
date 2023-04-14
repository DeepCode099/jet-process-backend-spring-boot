package io.jetprocess.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="md_secondaryhead")
public class SecondaryHead {

	@Id
	@Column(name ="secondaryheadid")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name ="secondaryheadvalue")
	private String name;
	@Column(name ="primaryheadid")
	private long primaryHeadId;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPrimaryHeadId() {
		return primaryHeadId;
	}
	public void setPrimaryHeadId(long primaryHeadId) {
		this.primaryHeadId = primaryHeadId;
	}
	public SecondaryHead(long id, String name, long primaryHeadId) {
		super();
		this.id = id;
		this.name = name;
		this.primaryHeadId = primaryHeadId;
	}
	public SecondaryHead() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
