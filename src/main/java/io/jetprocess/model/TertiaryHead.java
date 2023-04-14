package io.jetprocess.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="md_tertiaryhead")
public class TertiaryHead {

	@Id
	@Column(name ="tertiaryheadid")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column(name ="tertiaryheadvalue")
	private String name;
	@Column(name ="secondaryheadid")
	private long secondaryHeadId;
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
	public long getSecondaryHeadId() {
		return secondaryHeadId;
	}
	public void setSecondaryHeadId(long secondaryHeadId) {
		this.secondaryHeadId = secondaryHeadId;
	}
	public TertiaryHead(long id, String name, long secondaryHeadId) {
		super();
		this.id = id;
		this.name = name;
		this.secondaryHeadId = secondaryHeadId;
	}
	public TertiaryHead() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
