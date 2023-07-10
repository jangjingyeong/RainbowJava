package com.kh.day11.iostream.fileio;

import java.io.File;
import java.io.IOException;

public class Exam_File {
	public static void main(String[] args) {
		File file = new File("D:\\img\\flower1.png");
		// 해당 경로에 있는 파일이 객체화됨 
		String fileName = file.getName();
		String path		= file.getPath();
		String parent	= file.getParent();
		System.out.printf("파일 이름 : %s \n파일 경로 : %s \n부모 폴더 : %s \n"
				, fileName
				, path
				, parent);
		System.out.printf("파일이 존재하는가? : %b\n파일이 맞는가? %b\n폴더가 맞는가? : %b"
				, file.exists()
				, file.isFile()
				, file.isDirectory());
		

	}
	public void folderMake() {		
		File folderMake = new File("src/com/kh/day11/iostream/fileio/newfolder");
		folderMake.mkdir(); // mkdirs() 메소드는 폴더를 만드는 메소드인데 
							// 계층형 폴더를 한번에 만들어주는 메소드임
		System.out.println("폴더가 만들어졌습니다.");
	}
	public void fileMake() {
		try {
			File fileMake = new File("src/com/kh/day11/iostream/fileio/file1.txt");
			fileMake.createNewFile();
			System.out.println("파일이 만들어졌습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		} // 파일 만들어줌 
				
	}

}
