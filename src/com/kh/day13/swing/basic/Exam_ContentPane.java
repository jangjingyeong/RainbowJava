package com.kh.day13.swing.basic;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Exam_ContentPane extends JFrame { // JFrame 상속하고 import
	// Exam_ContentPane 적고 ctrl + spacebar하면 생성자 자동완성 
	public Exam_ContentPane() {
		setTitle("ContentPane과 JFrame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// ㄴ실제로 종료하도록 하게 하는 코드 
		// 이 코드를 넣기 전에는 안보이게만 했음.
		
		Container contentPane = getContentPane(); //  Container도 import
		contentPane.setBackground(Color.PINK);
		contentPane.setLayout(new FlowLayout()); 
		// ㄴ이걸 안 넣으면 add 했을 때 버튼이 덮어씌워짐 
		
		contentPane.add(new JButton("OK"));
		contentPane.add(new JButton("Cancel"));
		contentPane.add(new JButton("Ignore"));
		
		setSize(300, 150); // 가로, 세로
		setVisible(true); // 눈에 보이게 해줌  
	}
	
	public static void main(String[] args) {
		// 버튼 넣기 
		new Exam_ContentPane();
	}

}
