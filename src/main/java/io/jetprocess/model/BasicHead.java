package io.jetprocess.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="md_basichead")
public class BasicHead {

	@Id
	@Column(name="basicheadid")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column(name ="basicheadvalue")
	private String name;
	@Column(name ="basicheadcode")
	private String code;
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
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public BasicHead(long id, String name, String code) {
		super();
		this.id = id;
		this.name = name;
		this.code = code;
	}
	public BasicHead() {
		super();
		// TODO Auto-generated constructor stub
	}

	


}
