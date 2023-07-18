package com.kh.day17.network.socket.chat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ChattingClient {
	public static void main(String[] args) {
		// 서버에 연결중입니다.
		// 채팅서버에 접속하였습니다.
		// 서버와의 채팅을 시작합니다.
		// 서버(상대) : 하이
		// 클라이언트(나) : 네네
		String address = "127.0.0.1"; // "127.0.0.1" 자기자신
		int port = 7777;
		InputStream is = null;
		OutputStream os = null;
		DataInputStream dis = null; // 보조스트림, 기본데이터타입 입출력 도와줌
		DataOutputStream dos = null;
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("서버에 연결중입니다.");
			Socket socket = new Socket(address, port);
			System.out.println("채팅서버에 접속하였습니다."); 
			// ========== 여기까지 서버접속 ==========
			is = socket.getInputStream(); // 입력스트림 만들어줌
			os = socket.getOutputStream(); // 출력스트림 만들어줌 
			dis = new DataInputStream(is);
			dos = new DataOutputStream(os);
			// 주스트림을 보조스트림의 생성자의 전달값으로 전달하면 됨 
			System.out.println("서버와의 채팅을 시작합니다."); 
			// ========== 여기까지 채팅 준비 ==========
			while(true) {  // 보내면 받음~! 
				String recvMsg = dis.readUTF();  // 받기 
				System.out.printf("서버(상대) : %s\n", recvMsg);
				System.out.print("클라이언트(나) : ");  // 가이드메시지 
				String sendMsg = sc.nextLine();
				dos.writeUTF(sendMsg);  // 보내기
				dos.flush();
			}
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
