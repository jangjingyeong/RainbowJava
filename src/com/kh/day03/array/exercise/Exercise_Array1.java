package com.kh.day03.array.exercise;

import java.util.Random;
import java.util.Scanner;

public class Exercise_Array1 {
	
	public void exercise1() {
		// 양수 5개를 입력받아 배열에 저장하고, 제일 큰 수를 출력하는 프로그램을 작성하라.
		Scanner sc = new Scanner(System.in);
		// int num = sc.nextInt();  // 변수에 저장 
		int [] nums = new int[5];  // 배열에 저장하려면 먼저 배열 선언
		int max = 0; // 큰 수는 변수를 선언해서 확인 
		for(int i = 0; i < nums.length; i++) {
			nums[i] = sc.nextInt();
			if(nums[i] > max) {
				max = nums[i]; // 현재 max보다 입력한 값이 크면 넣어주는 것 				
			}
		} 
		System.out.println("가장 큰 수는 " + max + "입니다.");
		// 변수로 대체해서 반복문으로 적어주기 
//		nums[0] = sc.nextInt();
//		nums[1] = sc.nextInt();
//		nums[2] = sc.nextInt();
//		nums[3] = sc.nextInt();
//		nums[4] = sc.nextInt();
		
		// 메인이 아닌 곳으로 옮겨서 ctrl + f11해도 반응 없음 
		
		
		
	}
	public void exercise2() {
		// 배열의 length 필드를 이용하여 배열 크기만큼 정수를 입력 받고 
		// 평균을 구하는 프로그램을 작성하라.
		Scanner sc = new Scanner(System.in);
		int [] arrs = new int[5];
		for(int i = 0; i < arrs.length; i++) {
			arrs[i] = sc.nextInt();
		}
		
		
		// 배열에 저장된 값을 이용하여 평균 구하기! 
		// for, arrs.length, typeTrans, 누적합 
		int sum = 0;
		for(int j = 0; j < arrs.length; j++) {
			sum += arrs[j];
		}
		System.out.println("평균 : " + (double)sum/arrs.length);
		// 정수와 정수끼리 계산해서 정수가 나왔는데 소수점까지 보고 싶으면
		// 하나를 소수점으로 강제형변환 하면 됨
	}
	
	public void arryCopyExercise() {
		// 사용자에게 주민번호를 입력 받은 후 
		// 성별자리 이후부터 *로 저장되어 출력되도록 프로그램을 작성하시오
		// 230515-1231514 -> 230515-1****** 
		// 231026-1231515 -> 231026-1******
 		// 주민번호 13자리고 - 포함해서 입력받으려면 배열의 크기 14개 
 		char [] origin = new char[14];
 		Scanner sc = new Scanner(System.in);
 		System.out.print("주민번호를 입력하세요 : ");
 		String memberNum = sc.next();
 		for(int i = 0; i < origin.length; i++) {
 			origin[i] = memberNum.charAt(i);
 		}

 		// 복사해서 마스킹 처리 
 		// 복사할 배열 하나 만들기 
 		char [] copy = new char[14];   		// 깊은 복사의 시작 
 		for(int i = 0; i < origin.length; i++) {
 			if(i < 8) {
 				copy[i] = origin[i]; // 성별자리 전까지 차례대로 값을 대입
 			} else {
 				copy[i] = '*';       // 성별자리 이후엔 *로 값을 대입 
 			}
 		}
 		for(int i = 0; i < copy.length; i++) {
 			System.out.print(copy[i]);
 		}
		
		
	}
	
	// 끝판왕^^ 
	public void lottoExercise() {
		// 로또 번호 자동 생성기 프로그램, 중복 없이 추출하기
		// 단, 결과는 오름차순으로 정렬
		// 로또 번호는 6개. 로또 번호의 범위는 1 ~ 45 
		// 힌트 배열 사용 
		int [] lottoNums = new int[6];
		Random rands = new Random();
		// 22 16 22 45 6 29
		// 22 1 39 14 14 19
		// 0  1  2  3  4  5  인덱스값 
//		int count = 1; // 밖에서 돌고 있는 i 값으로 대체 가능 
		// 중복없이 1 ~ 45 사이의 랜덤한 수를 6개 뽑는 것 
		for(int i = 0; i < 6; i++ ) {
			lottoNums[i] = rands.nextInt(45)+1;
			for(int e = 0; e < i; e++) {
				if(lottoNums[i]==lottoNums[e]) {
					// 다시 뽑기 
					i--; // 중복이 발생한 자리 다시 뽑게 됨 
					break; 
				} 
			}
//			count++;
			
//			if(lottoNums[1]==lottoNums[0]) {
//				// 다시 뽑기 
//			} 
//			// ===============================
//			if(lottoNums[2]==lottoNums[1]) {
//				// 다시 뽑기 
//			} 
//			if(lottoNums[2]==lottoNums[0]) {
//				// 다시 뽑기 
//			} 
//			// ===============================
//			if(lottoNums[3]==lottoNums[2]) {
//				// 다시 뽑기 
//			} 
//			if(lottoNums[3]==lottoNums[1]) {
//				// 다시 뽑기 
//			} 
//			if(lottoNums[3]==lottoNums[0]) {
//				// 다시 뽑기 
//			} 
			// ===============================
			// lottoNums[4]는 4번 비교, lottoNums[5]는 5번 비교 
			// 이걸 반복문으로 바꾸는 연습 필요!! 
		}
		
		// 버블정렬 해보기!! 
		// for의 변수가 증가하기만 하면 됨 그래서 쉬움!!
		// 단, 안에 있는 for문의 조건식의 최대값은 감소(-i)해야함!! 
		for(int i = 0; i < lottoNums.length-1; i++) {
			for(int j = 0; j < (lottoNums.length-1)-i; j++) {
				// 왼쪽이 크면 자리 바꾸기! 
				if(lottoNums[j] > lottoNums[j+1]) {
					int tmp = lottoNums[j]; // 왼쪽에 있는 값이 지워지기 전에 킵
					lottoNums[j] = lottoNums[j+1]; // 오른쪽에 있는 값을 왼쪽에 대입
					lottoNums[j+1] = tmp; // 킵해놓은 것을 오른쪽에 대입
				}
			}
		}
		
	
		
		// 출력 
		for(int i = 0; i < lottoNums.length; i++) {
			System.out.print(lottoNums[i] + " ");			
		}  
		// 중복 없이, 오름차순으로 정렬 ....... 
		
	} 
	
	public void gameExercise1() {
		for(;;) {
			
			System.out.println("===== 가위 바위 보 게임 =====");
			System.out.print("숫자를 선택하세요. (1. 가위 / 2. 바위 / 3. 보) : ");
			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();
			Random rand = new Random();
			int computer = rand.nextInt(3)+1;
			System.out.println("========== 결과 ==========");
			if(choice == 1) {
				System.out.println("당신은 가위를 냈습니다.");
			} else if(choice == 2) {
				System.out.println("당신은 바위를 냈습니다.");
			} else if(choice == 3) {
				System.out.println("당신은 보를 냈습니다.");
			} else {
				System.out.println("1 ~ 3 사이의 숫자를 입력해주세요.");
			}
			
			if(computer == 1) {
				System.out.println("컴퓨터는 가위를 냈습니다.");
			} else if(computer == 2) {
				System.out.println("컴퓨터는 바위를 냈습니다.");
			} else if(computer == 3) {
				System.out.println("컴퓨터는 보를 냈습니다.");
			} 
			System.out.println("=========================");
			if(choice == computer) {
				System.out.println("비겼습니다");
			} else if((choice == 1) && (computer == 2)) {
				System.out.println("당신이 졌습니다.");
			} else if((choice == 1) && (computer == 3)) {
				System.out.println("당신이 이겼습니다.");
			} else if((choice == 2) && (computer == 1)) {
				System.out.println("당신이 이겼습니다.");
			} else if((choice == 2) && (computer == 3)) {
				System.out.println("당신이 졌습니다.");
			} else if((choice == 3) && (computer == 1)) {
				System.out.println("당신이 졌습니다.");
			} else if((choice == 3) && (computer == 2)) {
				System.out.println("당신이 이겼습니다.");
			}
			System.out.println();
			System.out.println();
		}
		
	} // gameExercise1()
	
	public void gameExercise2() {
		// UP & DOWN 게임 
		System.out.println("===== Up & Down Game =====");
		for(;;) {
			System.out.print("Input Number : ");
			Scanner sc = new Scanner(System.in);
			int inputNum = sc.nextInt();
			Random rand = new Random();
			int computer = rand.nextInt(99)+1;
			if(inputNum == computer) {
				System.out.println("<< 정답 >>");  
			} else if(inputNum > computer) {
				System.out.println("<< DOWN >>"); 
			} else if(inputNum < computer) {
				System.out.println("<< UP >>");
			}
			
		}
		
		
		
	} // gameExercise2()
	
	
	
	
	
	
	
	
	public static void main(String [] args)
	{
		

		
		
		
		
		
	}
}
 