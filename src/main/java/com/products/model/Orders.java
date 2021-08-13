package com.products.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name ="tblorders")
public class Orders {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "productname")
	private String productname;
	
	@Column(name = "price")
	private int price;
	
	@Column(name = "username")
	private String username;
	
	@Column(name = "firstname")
	private String firstname;
	
	@Column(name = "lastname")
	private String lastname;
	
	@Column(name = "emailid")
	private String emailid;
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "ordernum")
	private String ordernum;
	
	@Column(name = "createdate")
	private String createdate;
	
	

	public Orders() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Orders(String productname, int price, String username, String firstname, String lastname, String emailid,
			String address, String ordernum, String createdate) {
		super();
		this.productname = productname;
		this.price = price;
		this.username = username;
		this.firstname = firstname;
		this.lastname = lastname;
		this.emailid = emailid;
		this.address = address;
		this.ordernum = ordernum;
		this.createdate = createdate;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getProductname() {
		return productname;
	}



	public void setProductname(String productname) {
		this.productname = productname;
	}



	public int getPrice() {
		return price;
	}



	public void setPrice(int price) {
		this.price = price;
	}



	public String getUsername() {
		return username;
	}



	public void setUsername(String username) {
		this.username = username;
	}



	public String getFirstname() {
		return firstname;
	}



	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}



	public String getLastname() {
		return lastname;
	}



	public void setLastname(String lastname) {
		this.lastname = lastname;
	}



	public String getEmailid() {
		return emailid;
	}



	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public String getOrdernum() {
		return ordernum;
	}



	public void setOrdernum(String ordernum) {
		this.ordernum = ordernum;
	}



	public String getCreatedate() {
		return createdate;
	}



	public void setCreatedate(String createdate) {
		this.createdate = createdate;
	}



	@Override
	public String toString() {
		return "Orders [id=" + id + ", productname=" + productname + ", price=" + price + ", username=" + username
				+ ", firstname=" + firstname + ", lastname=" + lastname + ", emailid=" + emailid + ", address="
				+ address + ", ordernum=" + ordernum + ", createdate=" + createdate + "]";
	}

	
	
	
	

}
