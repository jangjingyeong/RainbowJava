package com.kh.day10.collection.music;

import java.util.Scanner;

public class MusicRun {

	public static void main(String[] args) {
		MusicFunction mFunc = new MusicFunction();
		end : 
		while(true ) {
			// 메뉴 출력, 선택
			int value = mFunc.printMenu();
			switch(value) {
			case 1 : 
				mFunc.inputMusicLast(); 
				break;
			case 2 : 
				mFunc.inputMusicFirst(); 
				break;
			case 3 : 
				mFunc.printAllMusics();
				break;
			case 4 : 
				mFunc.printOneByTitle();
				break;
			case 5 : 
				mFunc.removeMusicByTitle();
				break;
			case 6 : 
				mFunc.modifyMusicInfo();
				break;
			case 7 : 
				break;
			case 8 : 
				break;
			case 9 : 
				break;
			case 10 : 
				break;
			case 0 : 
				System.out.println("프로그램이 종료되었습니다."); 
				break end;
			default : System.out.println("잘못입력하셨습니다. 메뉴를 선택해주세요."); 
			}
		}
	}

}
