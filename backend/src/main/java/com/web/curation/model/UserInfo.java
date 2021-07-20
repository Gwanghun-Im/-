package com.web.curation.model;

import java.sql.Date;

public class UserInfo {
	private String nickname;
	private String des;
	private String role;
	private Date regdate;
	
	private Integer follower;
	private Integer following;
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getDes() {
		return des;
	}
	public void setDes(String des) {
		this.des = des;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	public Integer getFollower() {
		return follower;
	}
	public void setFollower(Integer follower) {
		this.follower = follower;
	}
	public Integer getFollowing() {
		return following;
	}
	public void setFollowing(Integer following) {
		this.following = following;
	}

}
