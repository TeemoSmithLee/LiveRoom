package com.niit.org.bean;

/*
 * Edit By Teemo
 * 
 * 2017-10-24
 * 
 * 用户账户实体类
 * 
 */

public class User {
	private int id;
	private String username;
	private String password;
	private String dscp;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDscp() {
		return dscp;
	}

	public void setDscp(String dscp) {
		this.dscp = dscp;
	}

}
