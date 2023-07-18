package com.kh.day17.network.socket.calculator;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class CaculatorServer {
	
	public static void main(String[] args) {
		// 서버 구동중입니다.
		// 클라이언트의 연결을 기다리고 있습니다..
		// 클라이언트와 연결되었습니다.
		// 받은 메시지 : 23
		// 받은 메시지 : 24 + 42
		// 클라이언트가 종료하였습니다.
		ServerSocket serverSocket = null;
		int port = 7777; 
		InputStream is = null;
		OutputStream os = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
		try {
//			System.out.println(".");
//			Thread.sleep(1000); // 1초동안 슬립을 해줌 1초 뒤에 구동중 뜸
//			System.out.println(".");
//			Thread.sleep(1000);
//			System.out.println(".");
//			Thread.sleep(1000);
			System.out.println("서버 구동중입니다.");
			for(int i = 1; i <= 50; i++) {
				System.out.print("=");
				Thread.sleep(10);
			}
			System.out.println("100%");
			System.out.println();
			serverSocket = new ServerSocket(port);
			System.out.println("클라이언트의 연결을 기다리고 있습니다..");
			Socket socket =	serverSocket.accept();
			System.out.println("클라이언트와 연결되었습니다.");
			// 받을 준비
			is = socket.getInputStream();
			os = socket.getOutputStream();
			dis = new DataInputStream(is);
			dos = new DataOutputStream(os);
			while(true) {
				// 데이터 받기
				String recvMsg = dis.readUTF();
				// 무한반복문 빠져나가는 if문 작성
				if(recvMsg.equalsIgnoreCase("exit")) {
					System.out.println("클라이언트가 종료하였습니다.");
					break;
				}
				System.out.printf("받은 메세지 : %s\n", recvMsg);
				// 24 + 42 -> 띄어쓰기 기준으로 문자열 배열을 만듬
				String [] msgArrs = recvMsg.split(" ");
				if(msgArrs.length != 3) {
					String errMsg = "end";
					dos.writeUTF(errMsg);
					continue;						
				} 
				// 24 / + / 42 나눠서 각각 변수에 넣는다 
				// msgArrs는 String배열이라서 Integer.parseInt로 형변환
				int num1 = Integer.parseInt(msgArrs[0]);
				int num2 = Integer.parseInt(msgArrs[2]);
				String operator = msgArrs[1];
				String result = "";
				switch(operator) {
				case "+" : 
					result = String.valueOf(num1 + num2);
					break;
				case "-" : 
					result = String.valueOf(num1 - num2);
					// 문자열로 변환해도 되고 
					break;
				case "*" : 
					result = num1 * num2 + "";
					// 계산한 결과값에 문자열을 추가해서 문자열로 만들어도 됨
					break;
				case "/" : 
					result = num1 / num2 + "";
					break;
				case "%" : 
					result = num1 % num2 + "";
					break;
				}
				// 결과 보내고 끝
				dos.writeUTF(result);
				dos.flush();
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
