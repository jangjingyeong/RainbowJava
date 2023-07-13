package com.kh.day14.component;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class Exam_JRadioButton extends JFrame {

	public Exam_JRadioButton() {
		setTitle("JRadioButton 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		ImageIcon cherryIcon = new ImageIcon("images/cherry.jpg");
		ImageIcon selectedCherry = new ImageIcon("images/selectedCherry.jpg");
		
		JRadioButton apple = new JRadioButton("사과", true); 
		// true를 적어주면 사과가 선택된 상태로 시작됨
		JRadioButton pear = new JRadioButton("배");
		JRadioButton cherry = new JRadioButton("체리", cherryIcon);
		cherry.setBorderPainted(true);
		cherry.setSelectedIcon(selectedCherry);
		// 라디오 버튼은 1개만 선택되어야 하는데 버튼 그룹으로 묶어주지 않으면 여러개가 선택됨 
		// 라디오 버튼 input[type=radio] 태그의 name을 맞춰주는 것과 같음 
		ButtonGroup g = new ButtonGroup();
		g.add(apple);
		g.add(pear);
		g.add(cherry);
		c.add(apple);
		c.add(pear);
		c.add(cherry);
		
		
		setSize(250, 150);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Exam_JRadioButton();
	}

}
