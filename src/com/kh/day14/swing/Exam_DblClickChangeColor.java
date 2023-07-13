package com.kh.day14.swing;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

public class Exam_DblClickChangeColor extends JFrame {
	
	public Exam_DblClickChangeColor() {
		setTitle("Click and Dbl Click Change BackgroundColor");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
//		MyMouseListener listener = new MyMouseListener();
//		c.addMouseListener(listener);
		c.addMouseListener(new MyMouseListener());
		
		
		
		
		setSize(300, 200);
		setVisible(true);
	}
	
	// Adapter는 필요한 것만 오버라이딩 할 수 있음 
	private class MyMouseListener extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			// 더블 클릭 구현, 클릭 카운트수가 2면 더블클릭 
			if(e.getClickCount() == 2) {
				// (int)Math.random()*(최댓값 - 최솟값 + 1) + 최솟값 
				// 0 ~ 255 범위의 랜덤한 수를 출력하는 방법 
				int red = (int)(Math.random()*256);
				int green = (int)(Math.random()*256);
				int blue = (int)(Math.random()*256);
				Component c = (Component)e.getSource(); 
				c.setBackground(new Color(red, green, blue));	// RGB 삼원색 조절로 색 바꿈  
				// 랜덤한 값으로 바뀌어야 함 
			}
		}
	
	}
		
	// 인터페이스로 하면 필요하지 않은 것들도 오버라이딩 됨 
	private class MyMouseListener1 implements MouseListener { 

		@Override
		public void mouseClicked(MouseEvent e) {
			Component c = (Component)e.getSource(); 
			c.setBackground(Color.BLACK);
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	public static void main(String[] args) {
		new Exam_DblClickChangeColor();
	}

}
