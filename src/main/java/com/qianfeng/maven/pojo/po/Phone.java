package com.qianfeng.maven.pojo.po;

public class Phone {
	private int id;
	private String phoneName;
	
	public Phone() {}
	
	public Phone(int id, String phoneName) {
		super();
		this.id = id;
		this.phoneName = phoneName;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPhoneName() {
		return phoneName;
	}
	public void setPhoneName(String phoneName) {
		this.phoneName = phoneName;
	}
	@Override
	public String toString() {
		return "Phone [id=" + id + ", phoneName=" + phoneName + "]";
	}
	
}
