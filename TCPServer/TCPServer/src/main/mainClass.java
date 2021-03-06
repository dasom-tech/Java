package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Thread.ServerThread;

public class mainClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 	TCP : Transmission Control Protocol
		 			전송			제어		통신규약
		 			
		 	TCP server
			 	Web server(Tomcat)
			 	DB  server
			 	
			종단 System : 			host
					PC, Printer, Smart phone, Scanner
					
			Router -  hardware
					host들 간에 상호 데이터를 교환할 수 있도록 하는 기기
					
			inter Network	포괄적인 통신망
			
			Protocol - 통신규약
			TCP : 신사적인 프로토콜
				    연결형
				    전화 ---> 상대방 통신 시작
				    데이터의 경계가 없다. 전송 데이터 크기가 한정되어 있지 않다.
				  1 대 1 통신	unicast
				    채팅
				  
			UDP : User Datagram Protocol
				    비 연결형
				    편지 ---> 받았는지 확인 x
				    지상파 방송
				    데이터의 경계가 있다.
				  1 대 1		unicast
				  1대 다		broadcast
				    다 대 다		multicast
				    
			7 Layer(계층)
			1계층 - Physical Layer 		물리계층
			2계층 - Data Link Layer		주소를 헤더에 첨부
			3계층 - Network Layer			IP == Address
			4계층 - Transport Layer		Port를 지정
			5계층 - Session Layer			세션을 동기화
			6계층 - Presentation Layer	보안, 압축, 확장 
			7계층 - Application Layer		프로그램
			
			Packet(데이터의 묶음)
			제어정보, 데이터 등이 결합된 형태로 전송되는 실제의 데이터
			TCP/UDP, IP, Port, String, Object
			
			IP : Internet Protocol == 주소
			
			IPv4 : 0 ~ 255.		XXX.XXX.XXX.XXX
			IPv6:				XXX.XXX.XXX.XXX.XXX.XXX
			
			자기 자신의 접속 IP: 127.0.0.1
			
			Port Number
			IP 주소는 internet에 존재하는 host(PC)를 식별할 수 있으나
			최종 주체인 Process(프로그램)를 식별하지 못하기 때문에 
			프로세스를 구별하기 위해서 지정된 수 (0 ~ 1024: sys)
			
			Socket통신				유닉스(file(write, read))
			통신을 하기 위한 주체(Object)
			IP, Port, TCP/UDP
			
			통신 순서
			
			  Server					Client
			1.Socket버전 확인				1.Socket버전 확인
			2.Socket생성					2.Socket생성
			3.IP, Port설정(binding)
			4.listen
			5.accept	<------			3.connect
			    		접속 성공
			6.Packet(데이터)의 송수신
			  receive	<------			send
			  send		------>			receive		 
		 
		 */
		
		Socket clientSocket = null;
		List<Socket> list = new ArrayList<Socket>();
		
		try {
			// 문지기 소켓
			ServerSocket servSocket = new ServerSocket(9000);
			// IP, Port, Binding, listen
			
			while(true) {
				System.out.println("접속 대기중...");
				clientSocket = servSocket.accept();
				
				list.add(clientSocket); //다른 클라이언트에게 메세지 보내기 위해 소켓들을 모아줌.
				/*
				 	clientSocket : 접속된 소켓의 정보를 갖고 있는 소켓
				 	(client의 담당자 소켓)
				 */
				
				System.out.println("접속된 Client의 정보 IP:" + clientSocket.getInetAddress() + 
						 " Port:" + clientSocket.getPort());
				
				new ServerThread(clientSocket, list).start(); // run()메서드-> start()메서드로 실행
				/*
				// 수신
				BufferedReader br = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
				String msg = br.readLine();	// 실질적으로 받는 부분
				
				System.out.println("클라이언트로부터 받은 메세지:" + msg);			
				
				// 전송
				System.out.println("전송할 메세지를 입력하세요>>> ");
				String msg2 = sc.next();	
				
				PrintWriter pw = new PrintWriter(clientSocket.getOutputStream());
				pw.println(msg2);	//실질적으로 전송되는 부분
				pw.flush(); // 현재 버퍼에 저장되어 있는 내용을 클라이언트로 전송하고 버퍼를 비운다.
				*/
			
			}
//			clientSocket.close();
//			servSocket.close();			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	}
	
}










