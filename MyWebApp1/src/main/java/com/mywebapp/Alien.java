package com.mywebapp;

public class Alien {
	private int aId;
	private String aName;
	private String aLang;
	
	public int getaId() {
		return aId;
	}
	public void setaId(int aId) {
		this.aId = aId;
	}
	public String getaName() {
		return aName;
	}
	public void setaName(String aName) {
		this.aName = aName;
	}
	public String getaLang() {
		return aLang;
	}
	public void setaLang(String aLang) {
		this.aLang = aLang;
	}
	@Override
	public String toString() {
		return "aId=" + aId + ", aName=" + aName + ", aLang=" + aLang;
	}
	
}
