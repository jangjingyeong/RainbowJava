package com.kh.day09.objectpkg;

public class Point {
	private int x, y;
	public Point() {}
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	// 눈으로 보이지 않는 걸 볼 때 많이 사용 toString Override
	@Override
	public String toString() {
		return "x : " + this.x + ", y : " + this.y;
	}
	
	public boolean equals(Object obj) {
		Point p = (Point)obj; 
		if(x == p.x && y == p.y) {
			return true;
		} else {
			return false;
		}
	}
}
	
	

