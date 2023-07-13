package com.kh.day14.component.exercise;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Exercise_CheckBoxItemEvent extends JFrame {
	
	private JCheckBox [] fruits;  // 체크박스 객체 배열
	private String [] names = {"사과", "배", "체리"}; // 체크박스 이름 배열
	private JLabel sumLabel; // 합계 레이블 
	private int sum;

	public Exercise_CheckBoxItemEvent() {
		setTitle("CheckBoxItemEvent 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());  // FlowLayout 사용 
		sum = 0;
		sumLabel = new JLabel("사과 100원, 배 500원, 체리 2000원"); // 처음 텍스트 
		fruits = new JCheckBox[3];
//		fruits[0] = new JCheckBox("사과");
//		fruits[1] = new JCheckBox("배");
//		fruits[2] = new JCheckBox("체리");
//		JCheckBox apple = new JCheckBox("사과");
//		JCheckBox pear = new JCheckBox("배");
//		JCheckBox cherry = new JCheckBox("체리");
		c.add(sumLabel);
		for(int i = 0; i < fruits.length; i++) {  // 반복문을 이용하여
			fruits[i] = new JCheckBox(names[i]);  // 배열에 체크박스 생성해서 넣어줌
			fruits[i].setBorderPainted(true);	  // 테두리 음각양각 
			c.add(fruits[i]);					  // 컨텐츠팬에 체크박스 추가
			fruits[i].addItemListener(new ItemListener() { // 아이템리스너 핸들러 등록
			// 체크하면 동작하는 ItemListener
				@Override
				public void itemStateChanged(ItemEvent e) { // 아이템이 선택될 때
					if(e.getStateChange() == ItemEvent.SELECTED) { // 체크 됐으면 
						if(e.getItem().equals(fruits[0])) {  // 그 이름이 사과인지? 
							sum += 100;						 // 맞으면 100을 더함 
						} else if(e.getItem().equals(fruits[1])) { // 이름이 배인지?
							sum += 500;						 // 맞으면 500 더함 
						} else if(e.getItem().equals(fruits[2])) { // 이름이 체리인지?
							sum += 2000;					 // 맞으면 2000 더함 
						}
					} else { // 체크가 해제되면 
						if(e.getItem().equals(fruits[0])) { // 사과 100 빼고 
							sum -= 100;		
						} else if(e.getItem().equals(fruits[1])) { // 배 500 빼고 
							sum -= 500;	
						} else if(e.getItem().equals(fruits[2])) { // 체리 2000 뺌 
							sum -= 2000;	
						}
					}
					sumLabel.setText("현재" + sum + "원 입니다.");  // 더한 값 출력			
				}	
			});
		}
//		c.add(apple);
//		c.add(pear);
//		c.add(cherry);
//		apple.addItemListener(new ItemListener() { // 메소드가 한개밖에 없으면 어댑터도 없다
//			@Override
//			public void itemStateChanged(ItemEvent e) {
//				if(e.getStateChange() == ItemEvent.SELECTED) {
//					sum += 100;
//				} else {
//					sum -= 100;
//				}
//				sumLabel.setText("현재" + sum + "원 입니다.");					
//			}	
//		});
//		pear.addItemListener(new ItemListener() { // 메소드가 한개밖에 없으면 어댑터도 없다
//			@Override
//			public void itemStateChanged(ItemEvent e) {
//				if(e.getStateChange() == ItemEvent.SELECTED) {
//					sum += 500;
//				} else {
//					sum -= 500;
//				}
//				sumLabel.setText("현재" + sum + "원 입니다.");	
//			}
//		});
//		cherry.addItemListener(new ItemListener() { // 메소드가 한개밖에 없으면 어댑터도 없다
//			@Override
//			public void itemStateChanged(ItemEvent e) {
//				if(e.getStateChange() == ItemEvent.SELECTED) {
//					sum += 2000;			
//				} else {
//					sum -= 2000;
//				}
//				sumLabel.setText("현재" + sum + "원 입니다.");	
//			}
//		});
		sumLabel = new JLabel("현재 0원입니다.");
		c.add(sumLabel);
		
		setSize(250, 150);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Exercise_CheckBoxItemEvent();
	}

}
