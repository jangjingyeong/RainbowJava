package com.kh.day14.swing;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Exam_MouseListenerAll extends JFrame {
	private JLabel la;
	
	public Exam_MouseListenerAll() {
		setTitle("MouseListener와 MouseMotionListener 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		la = new JLabel("No Mouse Event");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(la);
		MymouseListener listener = new MymouseListener();
		c.addMouseListener(listener);
		c.addMouseMotionListener(listener);
		
		setSize(300, 200);
		setVisible(true);
	}

	// 마우스랑 모션 같이 할 거라서 클래스 만들기 
	// MouseListener는 인터페이스라서 추상메소드만 인터페이스는 추상메소드만 존재, 
	// 몸체가 없으니 오버라이딩 해서 사용 
	// extends 콤마 찍어서 여러개 안됨, implements는 콤마 찍어서 여러개 가능 
	// 메인 위에 위치하고 내부클래스로 했기 때문에 나만 쓰기 위해 private 접근지정자 
	private class MymouseListener implements MouseListener, MouseMotionListener {
		
		@Override
		public void mouseClicked(MouseEvent e) {
			
		}
		
		@Override
		public void mousePressed(MouseEvent e) {
			
		}
		
		@Override
		public void mouseReleased(MouseEvent e) {
			
		}
		
		@Override
		public void mouseEntered(MouseEvent e) {
			// 마우스가 들어가면 실행됨 
			Component c = (Component)e.getSource(); 
			c.setBackground(Color.GREEN);
		}
		
		@Override
		public void mouseExited(MouseEvent e) {
			// 마우스가 나가면 실행됨 
			Component c = (Component)e.getSource(); 
			c.setBackground(Color.RED);
		}
		
		@Override
		public void mouseDragged(MouseEvent e) {
			// 드래그 하면 좌표 찍음 
			la.setText("MouseDragged(" + e.getX() + ", " + e.getY() + ")");
		}
		
		@Override
		public void mouseMoved(MouseEvent e) {
			// 움직이면 좌표 찍음
			la.setText("MouseMoved(" + e.getX() + ", " + e.getY() + ")");
		} 
		
	}
	
	public static void main(String[] args) {
		new Exam_MouseListenerAll();
	}

}


