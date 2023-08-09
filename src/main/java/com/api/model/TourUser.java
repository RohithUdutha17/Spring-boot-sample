package com.api.model;
import jakarta.persistence.*;

@Entity
public class TourUser {
	
	@Id
	private int userId;
	private String userName;
	private String emailId;
	private String mobileNo;
	private String address;
	private String prefferedPaymentMode;
	
	public TourUser() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TourUser(int userId, String userName, String emailId, String mobileNo, String address,
			String prefferedPaymentMode) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.emailId = emailId;
		this.mobileNo = mobileNo;
		this.address = address;
		this.prefferedPaymentMode = prefferedPaymentMode;
	}
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
	public String getEmailId() {
		return emailId;
	}
	
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPrefferedPaymentMode() {
		return prefferedPaymentMode;
	}
	public void setPrefferedPaymentMode(String prefferedPaymentMode) {
		this.prefferedPaymentMode = prefferedPaymentMode;
	}
	
}
