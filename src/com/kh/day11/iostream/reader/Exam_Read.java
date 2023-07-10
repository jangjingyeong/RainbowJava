package com.kh.day11.iostream.reader;

import java.io.Reader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Exam_Read {
	public static void main(String[] args) {
		Reader reader = null;
		// Reader reader = new Reader();
		// 오류 : Cannot instantiate the type Reader
		
		try {
			reader = new FileReader("src/com/kh/day11/iostream/reading.txt");
			while(true) {
				int readData = reader.read();
				if(readData == -1) break; // 다 읽고 나서 종료됨 
				System.out.print((char)readData);				
			} // 무한반복문 끝을 알려줘야 함 
			// reader.read();
			// 오류 : Unhandled exception type IOException 
			// 해결방안 : catch (FileNotFoundException e)
			// reader = new FileReader("");
			// 오류 : Unhandled exception type FileNotFoundException
			// 해결방안 : catch (IOException e)
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();
				// reader.close();
				// 오류 : Unhandled exception type IOException
				// 해결방안 : catch (IOException e)
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} 
	}
}
