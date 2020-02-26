package com.netty.fuse.util;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


public class UserPojoReq2 {
	private String NIK;
	private String user_id;
	private String password;
	private String ip_user;




	public String getNIK() {
		return NIK;
	}

	public void setNIK(String nIK) {
		NIK = nIK;
	}

	public UserPojoReq2() {
	}

	public void setValue(String nik, String user_id, String password, String ip_user) {

		this.NIK = nik;
		this.user_id = user_id;
		this.password = password;
		this.ip_user = ip_user;

	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getIp_user() {
		return ip_user;
	}

	public void setIp_user(String ip_user) {
		this.ip_user = ip_user;
	}

}