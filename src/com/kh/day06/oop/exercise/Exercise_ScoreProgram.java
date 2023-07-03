package com.kh.day06.oop.exercise;

import java.util.Scanner;

public class Exercise_ScoreProgram {
	static int index = 0;
	public static void main(String [] args)
	{
//		Student stdOne = new Student();
		Student [] stds = new Student[3];
		
		
		
//		======================= for / if 로 바꿔서 해보기 =======================
		
		//finish : 
		for(;;) {
			Scanner sc = new Scanner(System.in);
			printMenu();  // ctrl + 클릭 하면 해당 메소드 확인 가능 
			int choice = sc.nextInt();
			if(choice == 1) {
				inputScore(stds);
			} else if(choice == 2) {
				printScore(stds);
			} else if(choice == 3) {
				showGoodBye(); 
				break; //finish;
			} else {
				printException();
			}
		}
			
			
			
			
	}

	public static void printMenu() {  // alt + ← 누르면 사용되고 있는 곳 확인 가능 
		System.out.println("===== 메인 메뉴 =====");
		System.out.println("1. 성적입력");
		System.out.println("2. 성적출력");
		System.out.println("3. 종료");
		System.out.print("선택 : ");
	}
	
	public static void inputScore(Student [] stds) {
		Scanner sc = new Scanner(System.in);
		
//		for(int i = 0; i < stds.length; i++) {
			stds[index] = new Student();
			System.out.println("===== 이름 입력 =====");
			System.out.print("이름 : ");
			// 문자열 입력 받는 메소드 next(), nextLine()
			// next() : 공백 없는 문자열 ex. 이름, ... 
			// nextLine() : 공백 있는 문자열 ex. 주소, ... 
//			stds[i].name = sc.next();	
			stds[index].name = sc.nextLine();				
			System.out.println("===== 성적 입력 =====");
			System.out.print("국어 : ");
			stds[index].kor = sc.nextInt();
			System.out.print("영어 : ");
			stds[index].eng = sc.nextInt();
			System.out.print("수학 : ");
			stds[index].math = sc.nextInt();
			sc.nextLine();  // 개행 입력 받아줌 
			if(index < stds.length) index++;
			
//		}
		
//		stds[0] = new Student();
//		System.out.println("===== 이름 입력 =====");
//		System.out.print("이름 : ");
//		stds[0].name = sc.next();	
//		System.out.println("===== 성적 입력 =====");
//		System.out.print("국어 : ");
//		stds[0].kor = sc.nextInt();
//		System.out.print("영어 : ");
//		stds[0].eng = sc.nextInt();
//		System.out.print("수학 : ");
//		stds[0].math = sc.nextInt();
//		
//		stds[1] = new Student();
//		System.out.println("===== 이름 입력 =====");
//		System.out.print("이름 : ");
//		stds[1].name = sc.next();	
//		System.out.println("===== 성적 입력 =====");
//		System.out.print("국어 : ");
//		stds[1].kor = sc.nextInt();
//		System.out.print("영어 : ");
//		stds[1].eng = sc.nextInt();
//		System.out.print("수학 : ");
//		stds[1].math = sc.nextInt();
//		
//		stds[2] = new Student();
//		System.out.println("===== 이름 입력 =====");
//		System.out.print("이름 : ");
//		stds[2].name = sc.next();	
//		System.out.println("===== 성적 입력 =====");
//		System.out.print("국어 : ");
//		stds[2].kor = sc.nextInt();
//		System.out.print("영어 : ");
//		stds[2].eng = sc.nextInt();
//		System.out.print("수학 : ");
//		stds[2].math = sc.nextInt();
	}
	
	public static void printScore(Student [] stds) {
		for(int i =0; i < index; i++) {
			System.out.println("===== 성적 출력 =====");
			System.out.printf("이름 : %s\n", stds[i].name);		
			System.out.printf("국어 : %d\n", stds[i].kor);
			System.out.printf("영어 : %d\n", stds[i].eng);
			System.out.printf("수학 : %d\n", stds[i].math);
			System.out.printf("총점 : %d\n", stds[i].getTotal());
			System.out.printf("평균 : %.2f\n", stds[i].getAvg());			
		}

//		System.out.println("===== 성적 출력 =====");
//		System.out.printf("이름 : %s\n", stds[0].name);		
//		System.out.printf("국어 : %d\n", stds[0].kor);
//		System.out.printf("영어 : %d\n", stds[0].eng);
//		System.out.printf("수학 : %d\n", stds[0].math);
//		System.out.printf("총점 : %d\n", (stds[0].kor+stds[0].eng+stds[0].math));
//		System.out.printf("평균 : %.2f\n", (double)(stds[0].kor+stds[0].eng+stds[0].math)/3);
//	
//		System.out.println("===== 성적 출력 =====");
//		System.out.printf("이름 : %s\n", stds[1].name);		
//		System.out.printf("국어 : %d\n", stds[1].kor);
//		System.out.printf("영어 : %d\n", stds[1].eng);
//		System.out.printf("수학 : %d\n", stds[1].math);
//		System.out.printf("총점 : %d\n", (stds[1].kor+stds[1].eng+stds[1].math));
//		System.out.printf("평균 : %.2f\n", (double)(stds[1].kor+stds[1].eng+stds[1].math)/3);
//		
//		System.out.println("===== 성적 출력 =====");
//		System.out.printf("이름 : %s\n", stds[2].name);		
//		System.out.printf("국어 : %d\n", stds[2].kor);
//		System.out.printf("영어 : %d\n", stds[2].eng);
//		System.out.printf("수학 : %d\n", stds[2].math);
//		System.out.printf("총점 : %d\n", (stds[2].kor+stds[2].eng+stds[2].math));
//		System.out.printf("평균 : %.2f\n", (double)(stds[2].kor+stds[2].eng+stds[2].math)/3);
	
	}
	
	public static void showGoodBye() {
		System.out.println("프로그램이 종료되었습니다."); 
	}

	public static void printException() {
		System.out.println("잘못입력하셨습니다. 메뉴를 선택해주세요.");
	}
	
	

}
