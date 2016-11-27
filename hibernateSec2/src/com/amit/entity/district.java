package com.amit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="district")
public class district {

	
	 @Id
	 @Column(name="ID")
	 @GeneratedValue
	 private Integer id;
	 
	 @Column(name="Scode")
	 private String scode;
	 
	 @Column(name="Dname")
	 private String dname;
	 
	 @Column(name="Divcode")
	 private String divcode;
	 
	 @Column(name="Dcode")
	 private String dcode;
	 
	 
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getScode() {
		return scode;
	}
	public void setScode(String scode) {
		this.scode = scode;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getDivcode() {
		return divcode;
	}
	public void setDivcode(String divcode) {
		this.divcode = divcode;
	}
	public String getDcode() {
		return dcode;
	}
	public void setDcode(String dcode) {
		this.dcode = dcode;
	}
	
	
	 
}
