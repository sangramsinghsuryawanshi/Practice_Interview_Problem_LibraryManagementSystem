package com.project.LP.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Library 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int bid;
	private String bname;
	private int bquantity;
	private String status;
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public int getBquantity() {
		return bquantity;
	}
	public void setBquantity(int bquantity) {
		this.bquantity = bquantity;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Library(int bid, String bname, int bquantity, String status) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.bquantity = bquantity;
		this.status = status;
	}
	@Override
	public String toString() {
		return "Library [bid=" + bid + ", bname=" + bname + ", bquantity=" + bquantity + ", status=" + status + "]";
	}
	public Library() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
