package com.klef.jfsd.springboot.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "book_table")
public class Book 
{
	@Id
	private int bid;
	@Column(name = "btitle",length = 20,nullable = false)
	private String btitle;
	@Column(name = "bauth",length = 20,nullable = false)
	private String bauth;
	@Column(name = "bgenre",length = 20,nullable = false)
	private String bgenre;
	@Column(name = "bprice",length = 20,nullable = false)
	private String bprice;
	@Column(name = "byear",length = 10,nullable = false)
	private String byear;
	
	
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBtitle() {
		return btitle;
	}
	public void setBtitle(String btitle) {
		this.btitle = btitle;
	}
	public String getBauth() {
		return bauth;
	}
	public void setBauth(String bauth) {
		this.bauth = bauth;
	}
	public String getBgenre() {
		return bgenre;
	}
	public void setBgenre(String bgenre) {
		this.bgenre = bgenre;
	}
	public String getBprice() {
		return bprice;
	}
	public void setBprice(String bprice) {
		this.bprice = bprice;
	}
	public String getByear() {
		return byear;
	}
	public void setByear(String byear) {
		this.byear = byear;
	}
	
	
}
