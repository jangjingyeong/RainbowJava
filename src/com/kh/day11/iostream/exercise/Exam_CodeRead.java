package com.kh.day11.iostream.exercise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Exam_CodeRead {
	public static void main(String[] args) {
		// Exam_FileCopy.java 파일을 읽어서 콘솔에 출력해보세요~! 
		// Input, Output 둘다 사용 byte 사용 
		
		InputStream is = null;
		
		try {
			is = new FileInputStream("src\\com\\kh\\day11\\iostream\\exercise\\Exam_FileCopy.java");
			byte [] readBytes = new byte[1024]; // 1kb 크기
			int readByteCount;
			String result = "";
			while((readByteCount = is.read(readBytes)) != 1) {
			// is.read()는 한글자씩 읽는 거라 너무 느리다 -> is.read(readBytes)
				result += new String(readBytes, 0, readByteCount);
				System.out.println(result);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}