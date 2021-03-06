package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class mainClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		new ChatView();
		/*
		 	1. 접속을 해야 할 Server의 주소를 설정해줄 Socket 1개 필요
		 	2. 소켓 생성
		 	3. 접속
		 	4. 데이터 송수신	 
		 */
		
		// 서버 주소 설정
		InetSocketAddress sockAddr = new InetSocketAddress("192.168.0.130", 9000);
		
		// 소켓 생성
		Socket socket = new Socket();
		
		// 접속
		try {
			socket.connect(sockAddr, 5000);// 접속 안될 때 5초동안 대기
			
			InetAddress inetAddr;
			if((inetAddr = socket.getInetAddress()) != null) {
				System.out.println("server 접속 성공! :" + inetAddr);
			}else {
				System.out.println("server 연결 실패~");
			}
			String msg = "";
			
			new ReadThread(socket).start();
			
			while(true) {
				System.out.println("전송할 메세지를 입력하세요>>> ");
				msg = sc.next();			
				
				// send
				PrintWriter pw = new PrintWriter(socket.getOutputStream());
				pw.println(msg);	//실질적으로 전송되는 부분
				pw.flush();
				
				/*
				// receive
				BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				String msg3 = br.readLine();	// 실질적으로 받는 부분
				
				System.out.println("서버로부터 받은 메세지:" + msg3);
				*/
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
