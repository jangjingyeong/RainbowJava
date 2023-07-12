package com.kh.day13.swing.event;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Exam_InnerClassListener extends JFrame {
	
	public Exam_InnerClassListener() {
		setTitle("Action 이벤트 리스너 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("Action");
		btn.addActionListener(new MyActionListener()); 
		// ㄴ동작할 코드가 있는 클래스 아래에 만들어서 안에 넣어줌 
		c.add(btn);
		
		setSize(350, 150);
		setVisible(true);
	}
	
// btn.addActionListener(null); 여기에 동작할 코드가 있는 클래스를 만들어줘야 함 
	private class MyActionListener implements ActionListener {
		// ActionListener 인터페이스는 기본적으로 추상메소드로만 되어있음 -> 오버라이딩 
		@Override
		public void actionPerformed(ActionEvent e) {
			JButton btn = (JButton)e.getSource(); // JButton으로 형변환 
			if(btn.getText().equals("Action")) {
				btn.setText("액션");
			} else {
				btn.setText("Action");
			}
			Exam_InnerClassListener.this.setTitle(btn.getText()+" 이벤트 리스너 예제");
		}  // ㄴ위에 있는 클래스 자체를 불러서 setTitle을 부름 
	}  // -- > 내부클래스(InnerClass)
	
	public static void main(String[] args) {
		new Exam_InnerClassListener();
	}
}

