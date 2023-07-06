package com.kh.day09.javaapi;

import java.util.StringTokenizer;

public class Exam_StringTokenizer {
	public static void main(String[] args) {
		String query = "name=kite&addr=seoul&age=21";
//		String [] words = query.split("&");
		StringTokenizer st = new StringTokenizer(query, "&");
		//자르는 건 똑같은데 있는지 없는지 체크해서 출력함
		while(st.hasMoreElements()) {
			System.out.println(st.nextToken());
		}
	}
}
