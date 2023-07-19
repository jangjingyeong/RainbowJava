package com.kh.day18.music.model.vo;

public class Music {
	private String title;
	private String singer;
	
	// 생성자는 아예 안 쓰거나 다 쓰거나 함, 기본생성자는 생략되어있음.
	// 매개변수 있는 생성자를 쓸 거면 기본생성자 + 매개변수 있는 생성자 만든다.
	public Music() {
		super();
	}
		
	public Music(String title, String singer) {
		super();
		this.title = title;
		this.singer = singer;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	@Override
	public String toString() {
		return "음악 [제목=" + title + ", 가수명=" + singer + "]";
	}
	
	
	
	
}
