package com.kh.day10.collection.student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentFunction {
	
//	Student [] students;
//	int index;
	List<Student> stdList;
	
	public StudentFunction() {
//		students = new Student[100];
//		index = 0;
		stdList = new ArrayList<Student>();
	}
	
	public int printMenu() { 
		Scanner sc = new Scanner(System.in);
		System.out.println("학생 성적관리 프로그램");
		System.out.println("1. 학생 정보 입력");
		System.out.println("2. 학생 정보 이름 검색");
		System.out.println("3. 학생 정보 전체 출력");
		System.out.println("4. 재평가 대상 여부 확인");
		System.out.println("5. 프로그램 종료");
		System.out.print("선택 : ");
		int choice = sc.nextInt();
		return choice;
	}
	public void inputInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("학생 정보 입력");
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("1차 점수 : ");
		int score1 = sc.nextInt();
		System.out.print("2차 점수 : ");
		int score2 = sc.nextInt();
		Student std = new Student(name, score1, score2);
		stdList.add(std);
//		students[index] = std;
//		index++;
	}
	public void searchInfoByName() {
		System.out.println("학생 정보 이름 검색");
		Scanner sc = new Scanner(System.in);
		System.out.print("검색할 이름 : ");
		String searchName = sc.next();
		for(Student std : stdList) {
			if(std.getName().equals(searchName)) {
				System.out.println(std.toString());
				break;
			}
		}
	}
	public void printInfo() {
		for(Student student : stdList) { // stdList의 값을 반복하면서 student에 넣어준다
			System.out.println(student.toString());
		} //foreach문 
		
//		for(int i = 0; i < stdList.size(); i++) {
////			System.out.println(students[i].getName() + "/ ");
////			System.out.println(stdList.get(i).getName() + "/ ");
//			System.out.println(stdList.get(i).toString());
//		}
	}
	public void checkPass() {
		for(Student student : stdList) {
			String name = student.getName();
			int score1 = student.getScore1();
			int score2 = student.getScore2();
			double avg = (score1 + score2) / 2;
			if(avg >= 60 && score1 >= 40 && score2 >= 40) {
				System.out.println(name + "님은 합격하셨습니다.");
			} else if (score1 >= 60 && score2 < 60) {
				System.out.println(name + "님은 2차 시험 재평가 대상자입니다.");				
			} else if (score1 < 60 && score2 >= 60) {
				System.out.println(name + "님은 1차 시험 재평가 대상자입니다.");
			} else {
				System.out.println(name + "님은 1차, 2차 시험 재평가 대상자입니다.");
			}
		}
	}
}
