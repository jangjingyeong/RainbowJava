package com.kh.day14.component;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JSlider;

public class Exam_JSlider extends JFrame {

	public Exam_JSlider() {
		setTitle("JSlider 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 200, 100);
		// HORIZONTAL 수평, 최소값, 최대값, 초깃값 
		slider.setPaintLabels(true);	  // 숫자
		slider.setPaintTicks(true);		  // 눈금
		slider.setMajorTickSpacing(50);   // 눈금 중간값
		slider.setMinorTickSpacing(10);   // 눈금 최소값 
		slider.setPaintTrack(false);	  // track
		c.add(slider);
		
		setSize(300, 100);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Exam_JSlider();
	}

}
