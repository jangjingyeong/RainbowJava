package com.kh.day13.swing.basic;

import javax.swing.JFrame;

public class Exam_MyFrame extends JFrame {
	
	public Exam_MyFrame() {
		setTitle("300x300 스윙 프레임 만들기");
		setSize(300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
//		Exam_MyFrame exFrame = new Exam_MyFrame();
		new Exam_MyFrame(); 
		// Exam_MyFrame exFrame 이거 때문에 실행이 되는 게 아니고 
		// 뒤에 new Exam_MyFrame(); 때문에 실행되는 것 
	}
}
