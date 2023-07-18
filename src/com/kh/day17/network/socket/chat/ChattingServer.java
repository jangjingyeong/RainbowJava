package com.kh.day17.network.socket.chat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ChattingServer {
	public static void main(String[] args) {
		// 채팅서버를 구동 중입니다...
		// 채팅서버를 구동하였습니다..
		// 클라이언트의 접속을 기다리고 있습니다.
		// 클라이언트가 접속하였습니다.
		// 채팅이 시작되었습니다.
		// 서버(나) : 하이
		// 클라이언트(상대) : 네네
		ServerSocket serverSocket = null;
		int port = 7777;
		// 여러가지 프로그램을 구분하기 위해서 포트번호 사용 
		InputStream is = null;
		OutputStream os = null;
		DataInputStream dis = null; // 보조스트림, 기본데이터타입 입출력 도와줌
		DataOutputStream dos = null;
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("채팅서버를 구동 중입니다...");
			serverSocket = new ServerSocket(port);
			System.out.println("채팅서버를 구동하였습니다..");
			System.out.println("클라이언트의 접속을 기다리고 있습니다.");
			Socket socket = serverSocket.accept();  
			// 소켓변수 타입의 참조변수 socket 해당변수로 객체를 받아들임 
			System.out.println("클라이언트가 접속하였습니다."); 
			// ========== 여기까지 서버접속 ==========
			is = socket.getInputStream(); // 입력스트림 만들어줌
			os = socket.getOutputStream(); // 출력스트림 만들어줌 
			dis = new DataInputStream(is);
			dos = new DataOutputStream(os);
			// 주스트림을 보조스트림의 생성자의 전달값으로 전달하면 됨 
			System.out.println("채팅이 시작되었습니다.");
			// ========== 여기까지 채팅 준비 ==========
			while(true) {  // 무한반복 서버에서 먼저 보냄! 
				System.out.print("서버(나) : ");  // 가이드메시지 
				String sendMsg = sc.nextLine();
				dos.writeUTF(sendMsg);  // 보내기
				dos.flush();
				String recvMsg = dis.readUTF();  // 받기 
				System.out.printf("클라이언트(상대) : %s\n", recvMsg);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
