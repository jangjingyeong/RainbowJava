package com.kh.day17.network.socket.baseball;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BaseballServer {

	public static void main(String[] args) {
//		서버소켓을 생성하였습니다.
//		2023-07-18 12:04:56:15
//		클라이언트의 접속을 기다립니다.
//		클라이언트가 접속했습니다.
//		서버 숫자 -> 7 3 8
//		서버 준비 완료
//		받기 : 4 2 1
//		0스트라이크 0볼
//		받기 : 1 2 3
//		0스트라이크 1볼
//		받기 : 2 3 4
//		1스트라이크 0볼
//		받기 : 5 3 8
//		2스트라이크 0볼
//		받기 : 5 3 7
//		1스트라이크 1볼
//		받기 : 7 3 8
//		3스트라이크 0볼
//		아웃! 게임종료
		ServerSocket serverSocket = null;
		int port = 7777;
		InputStream is = null;
		OutputStream os = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
		int [] numbers = new int[3];
		
		try {
			serverSocket = new ServerSocket(port);
			System.out.println("서버소켓을 생성하였습니다.");
			Thread.sleep(3000);
//			SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:ms");
//			Date date = new Date(System.currentTimeMillis());
//			System.out.println(formatter.format(date));
			System.out.println("클라이언트의 접속을 기다립니다.");
			Socket socket = serverSocket.accept();
			System.out.println("클라이언트가 접속했습니다.");
			// (int)(Math.random() * (최대값 - 최솟값 +1) + 최소값
			System.out.print("서버 숫자 -> ");
			for(int i = 0; i < 3; i++) {
				// 중복 제거 
				numbers[i] = (int)(Math.random()*9+1);
				for(int j = 0; j < i; j++) {
					// #1 skip
					// 		   j             i
					// #2 
					// numbers[0] == numbers[1]
					// #3
					// numbers[0] == numbers[2]
					// numbers[1] == numbers[2]
					if(numbers[i] == numbers[j]) {
						//다시 뽑기 
						i--; // 중복이 발생한 자리 다시 뽑게 됨
						break;
					}
				}				
			}
			System.out.printf("%d %d %d\n"
					, numbers[0]
					, numbers[1]
					, numbers[2]); 
			System.out.println("서버 준비 완료");
			
			while(true) {
				// 보낸 거 받아주기
				is = socket.getInputStream();
				dis = new DataInputStream(is);
				os = socket.getOutputStream();
				dos = new DataOutputStream(os);
				
				String recvMsg = dis.readUTF();
				System.out.printf("받기 : %s\n", recvMsg);
				
				// 결과 알려주기(보내기)
				// numbers 배열과 입력한 값으로 만든 배열 비교 
				// 정답과 비교해서 스트라이크, 볼 알려주기 
				
				String [] inputNums = recvMsg.split(" ");
				int strike = 0;
				int ball = 0;
				for(int i = 0; i < 3; i++) {
					for(int j = 0; j < 3; j++) {
						if(numbers[i] == Integer.parseInt(inputNums[j])) {
							if(i == j) { // 값이 같은 상태에서 인덱스가 같으면 스트라이크임 
								strike++;
							} else { // 값이 같은 상태인데 인덱스가 다르면 볼임 
								ball++;
							}
						}
					}				
				}
				// numbers[0] == Integer.parseInt(inputNums[0]);
				// -> 스트라이크 +1 
				// numbers[0] == Integer.parseInt(inputNums[1]);
				// numbers[0] == Integer.parseInt(inputNums[2]);
				
				// numbers[1] == Integer.parseInt(inputNums[0]);
				// -> 볼 +1
				// numbers[1] == Integer.parseInt(inputNums[1]);
				// numbers[1] == Integer.parseInt(inputNums[2]);
				
				// numbers[2] == Integer.parseInt(inputNums[0]);
				// numbers[2] == Integer.parseInt(inputNums[1]);
				// numbers[2] == Integer.parseInt(inputNums[2]);
				
				String result = strike + "스트라이크 " + ball + "볼";
				dos.writeUTF(result);
				dos.flush();
				if(strike == 3) {
					System.out.println("아웃! 게임종료");
					break;
				}
				
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
