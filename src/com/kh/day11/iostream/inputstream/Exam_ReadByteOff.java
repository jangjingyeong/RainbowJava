package com.kh.day11.iostream.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Exam_ReadByteOff {
	public static void main(String[] args) {
		InputStream is = null;
		
		try {
			is = new FileInputStream("src/com/kh/day11/iostream/reading.txt");
			int readByteCount;
			byte [] readBytes = new byte[3]; //배열존재 
			String result = "";
			while((readByteCount = is.read(readBytes, 0, 3)) != -1) { 
				// readOffSet 배열 저장할 위치랑 크기 커스터마이징
//				readByteCount = is.read(readBytes);
//				if(readByteCount == -1) break;
				result += new String(readBytes, 0, readByteCount); 
				// ㄴ> 0부터 readByteCount(읽어들인갯수)까지 넣겠다고 
//				System.out.print(readByteCount); // 읽은 갯수 
//				for(byte rByte : readBytes) {
//					System.out.print((char)rByte);
//				}				// 확인용코드 
			}
			System.out.println(result);
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
