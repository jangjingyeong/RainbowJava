package com.kh.day14.component;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Exam_SwingTemplate extends JFrame {

	public Exam_SwingTemplate() {
		setTitle("JButton 이미지 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		
		setSize(250, 150);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Exam_SwingTemplate();
	}

}
