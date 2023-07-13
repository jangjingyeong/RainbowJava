package com.kh.day14.component;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class Exam_JCheckBox extends JFrame {

	public Exam_JCheckBox() {
		setTitle("JButton 이미지 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		ImageIcon cherryIcon = new ImageIcon("images/cherry.jpg");
		ImageIcon selectedCherry = new ImageIcon("images/selectedCherry.jpg");
		
		JCheckBox apple = new JCheckBox("사과");
		JCheckBox pear = new JCheckBox("배");
		JCheckBox cherry = new JCheckBox("체리", cherryIcon);
		cherry.setBorderPainted(true); // 음각양각 이용해서 체크되는 것 확인 쉽게 함 
		cherry.setSelectedIcon(selectedCherry); // 체크 됐을 때 이미지 지정 
		c.add(apple);
		c.add(pear);
		c.add(cherry);
		
		setSize(250, 150);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Exam_JCheckBox();
	}

}
