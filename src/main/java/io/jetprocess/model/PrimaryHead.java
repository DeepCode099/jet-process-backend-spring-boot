package io.jetprocess.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="md_primaryhead")
public class PrimaryHead {

	@Id
	@Column(name ="primaryheadid")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column(name ="primaryheadvalue")
	private String name;
	@Column(name ="basicheadid")
	private long basicHeadId;
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
	public long getBasicHeadId() {
		return basicHeadId;
	}
	public void setBasicHeadId(long basicHeadId) {
		this.basicHeadId = basicHeadId;
	}
	public PrimaryHead(long id, String name, long basicHeadId) {
		super();
		this.id = id;
		this.name = name;
		this.basicHeadId = basicHeadId;
	}
	public PrimaryHead() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
