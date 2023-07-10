package com.kh.day11.iostream.outputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.sql.DatabaseMetaData;

public class Exam_WriteByteOff {
	public static void main(String[] args) {
		OutputStream os = null;
		
		try {
			os = new FileOutputStream("src/com/kh/day11/iostream/outputting3.txt");
			byte [] data = "Real I/O".getBytes();
			os.write(data, 0, 4); // 시작 위치와 갯수 지정 가능해짐~~! 
			// 넉넉하게 읽어오지 않으면 한글 같은 건 깨질 수 있음 
			// 문자 기반으로 하면 그걸 방지함 
			os.flush();
			System.out.println("파일 쓰기 완료");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				os.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
				
	}
}
