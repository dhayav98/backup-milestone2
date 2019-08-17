 package com.demo.stc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {
	@Id
	@Column(name="user_id")
	private int userId;
	@Column(name="user_name")
	private String userName;
	@Column(name="password")
	private String userPassword;
	@Column(name="user_type")
	private String userType;
	@Column(name="email")
	private String email;
	@Column(name="mobile_number")
	private long mobileNumber;
	@Column(name="confirmed")
	private byte confirmed;
	

	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getUserType() {
		return userType;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public byte isConfirmed() {
		return confirmed;
	}
	public void setConfirmed(byte confirmed) {
		this.confirmed = 0;
	}
	public String toString()
	{
		return "id"+this.getUserId()+"name:"+this.getUserName();
	}
	
	
}
