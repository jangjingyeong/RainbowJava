package com.kh.day15.swing.exercise;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JTextField;

class MyModalDialog extends JDialog {
	private JTextField field;	// 필드에 입력한 값을 가져와야해서 전역변수로 선언
	private JButton btn;
	public MyModalDialog() {}
	public MyModalDialog(JFrame frame, String title, JButton jBtn) {
		super(frame, title);
		setLayout(new FlowLayout());
		field = new JTextField(10);
		add(field);
		btn = new JButton("OK");
		btn.addActionListener(new ActionListener() { // OK버튼 눌렸을 때
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);  	// OK버튼 누르면 사라짐
				if(field.getText().length() == 0) return;  // 아무것도 입력 안되면 동작 안 하도록 함
				else jBtn.setText(field.getText());		// jBtn의 텍스트를 입력받은걸로 하겠다
				field.setText("");		// 다이얼로그 호출될 때 필드를 비워줌
			}
		});
		add(btn);
		setSize(200, 100);
	}
//	public String getInput() {
//		if(field.getText().length() == 0) return null;
//		else return field.getText();
//	}
}

public class Exercise_DialogSetText extends JFrame {
	private MyModalDialog dialog;
	public Exercise_DialogSetText() {
		super("다이얼로그 텍스트 셋 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton btn = new JButton("Show Modal Dialog");
		btn.setSize(200, 50);
		btn.setLocation(20, 50);
		dialog = new MyModalDialog(this, "Show Modal Dialog", btn);
		btn.addActionListener(new ActionListener() {  // 버튼 누르면 다이얼로그 띄워줌
			@Override
			public void actionPerformed(ActionEvent e) {
				dialog.setVisible(true);		
//				String text = dialog.getInput();
//				if(text == null) return;
//				JButton btn = (JButton)e.getSource();
//				btn.setText(text);
			}
		});
		
		Container c = getContentPane();
//		c.add(btn, BorderLayout.WEST);
		c.setLayout(null);
		c.add(btn);
		
		setSize(250, 200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Exercise_DialogSetText();
	}
}
