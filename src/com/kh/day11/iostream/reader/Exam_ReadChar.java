package com.kh.day11.iostream.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Exam_ReadChar {
	public static void main(String[] args) {
		Reader reader = null;
		try {
			reader = new FileReader("src/com/kh/day11/iostream/reading.txt");
			int readCharCount;
			char [] cBuf = new char[3]; // 배열이 필요, 읽어들이는 크기는 내가 정함
			// 원래 한글자씩 했다면 배열 이용해서 jav a/o 이런식으로 세개씩 퍼다 읽음 
//			int i = 0;
			String result = "";
//			while(i < 10) {
			while(true) {
				readCharCount = reader.read(cBuf);
//				System.out.print(readCharCount); // 읽을게 없으면 -1이 나옴 
				if(readCharCount == -1) break;
				result += new String(cBuf, 0, readCharCount);
				// ㄴ 읽은 곳까지만 String으로 바꾸라
//				for(char c : cBuf) {
//					System.out.print(c);				
//				}	// 마지막에 읽은 갯수가 적으면 다 덮어씌워지지 않음 
//				System.out.println();
//				i++;
			}
			System.out.println(result);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
