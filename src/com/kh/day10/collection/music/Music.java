package com.kh.day10.collection.music;

public class Music {
	private String title;
	private String singer;
	
	public Music() {}
	
	public Music(String title, String singer) {
		this.title = title;
		this.singer = singer;
	}
	
	//getter
	public String getTitle() {
		return this.title;
	}
	public String getSinger() {
		return this.singer;
	}
	
	
	//setter 
	public void setTitle() {
		this.title = title;
	}
	public void setSinger() {
		this.singer = singer;
	}
	
	@Override
	public String toString() {
		return "곡명 : " + title + ", 가수명 : " + singer;
	}
	

}
