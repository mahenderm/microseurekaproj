package com.newt.pojo;

public class Passport {
	private int pid;
	private String pname;
	private String pcity;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPcity() {
		return pcity;
	}
	public void setPcity(String pcity) {
		this.pcity = pcity;
	}
	@Override
	public String toString() {
		return "Passport [pid=" + pid + ", pname=" + pname + ", pcity=" + pcity + "]";
	}
	
	
	

}
