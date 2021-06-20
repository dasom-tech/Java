package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ReadThread extends Thread{
	
	Socket socket;
	
	public ReadThread(Socket socket) {
		this.socket = socket;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		
		// receive
		BufferedReader br;
		try {
			
			while(true) {
				br = new BufferedReader(new InputStreamReader(socket.getInputStream()));

				String msg = br.readLine();
				System.out.println("서버로부터 받은 메세지:" + msg);

				Thread.sleep(300); // (0.3초)저장된 시간동안 스레드 실행 멈춤 
				   				   // sleep 메소드는 정해진 시간만큼 대기하였다가 이후 일들을 처리하게 됨.
				   				   // ex) 1초마다 시간 출력되는 전광판 Thread.sleep(1000);

			}
		
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}	
		
		
	}
	

}
