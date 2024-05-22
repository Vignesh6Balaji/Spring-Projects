package com.example.demo;

import org.springframework.stereotype.Component;

@Component("gad1")
public class Gadget {

	private int gId;
	private String gBrand;
	public int getgId() {
		return gId;
	}
	public void setgId(int gId) {
		this.gId = gId;
	}
	public String getgBrand() {
		return gBrand;
	}
	public void setgBrand(String gBrand) {
		this.gBrand = gBrand;
	}
	@Override
	public String toString() {
		return "Gadget [gId=" + gId + ", gBrand=" + gBrand + "]";
	}
	public void compile() {
		System.out.println("Process is compling...");
		System.out.println("200 OK");
	}
}
