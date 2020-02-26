package com.netty.fuse.util;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({ "NIK", "user_id", "password", "ip_user" })
public class UserPojoReq {
	@JsonProperty("NIK")
	private String nik;
	@JsonProperty("user_id")
	private String user_id;
	@JsonProperty("password")
	private String password;
	@JsonProperty("ip_user")
	private String ip_user;

	public String getNik() {
		return nik;
	}

	public void setNik(String nik) {
		this.nik = nik;
	}

	public UserPojoReq() {
	}

	public void setValue(String nik, String user_id, String password, String ip_user) {

		this.nik = nik;
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