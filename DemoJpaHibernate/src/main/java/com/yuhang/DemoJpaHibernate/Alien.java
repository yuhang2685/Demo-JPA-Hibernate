package com.yuhang.DemoJpaHibernate;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Alien {

	@Id
	private int aid;
	private String aname;
	private int points;
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	@Override
	public String toString() {
		return "Alien [aid=" + aid + ", aname=" + aname + ", points=" + points + "]";
	}
	
	
}
