package com.kh.day11.iostream.writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Exam_Write {
	public static void main(String[] args) {
		Writer writer = null; // 추상클래스라 객체생성 안됨 new Writer 안함 
		try {
			// Unhandled exception type IOException
			writer = new FileWriter("src/com/kh/day11/iostream/writing.txt");
			char [] data = "Java/Oracle/JDBC".toCharArray(); 
			//ㄴ 문자열을 문자배열로 바꿔주는 toCharArray 메소드 이용
			for(int i = 0; i < data.length; i++) {
				writer.write(data[i]);
			}
			writer.flush(); // 버퍼를 비워줘야함 
			System.out.println("파일 쓰기 완료!");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
