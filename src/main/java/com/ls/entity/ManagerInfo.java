package com.ls.entity;

import org.springframework.stereotype.Repository;

@Repository
public class ManagerInfo {
	private Integer userId;

	private String account;

	private String ban;

	private String type;

	private Integer postNum;

	private Integer expNum;

	private Integer postBarrageNum;

	private Integer expBarrageNum;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getBan() {
		return ban;
	}

	public void setBan(String ban) {
		this.ban = ban;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getPostNum() {
		return postNum;
	}

	public void setPostNum(Integer postNum) {
		this.postNum = postNum;
	}

	public Integer getExpNum() {
		return expNum;
	}

	public void setExpNum(Integer expNum) {
		this.expNum = expNum;
	}

	public Integer getPostBarrageNum() {
		return postBarrageNum;
	}

	public void setPostBarrageNum(Integer postBarrageNum) {
		this.postBarrageNum = postBarrageNum;
	}

	public Integer getExpBarrageNum() {
		return expBarrageNum;
	}

	public void setExpBarrageNum(Integer expBarrageNum) {
		this.expBarrageNum = expBarrageNum;
	}
}
