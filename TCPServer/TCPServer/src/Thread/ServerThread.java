package Thread;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class ServerThread extends Thread{
	
	Socket clientSocket;
	List<Socket> list = new ArrayList<Socket>();
	
	public ServerThread(Socket clientSocket, List<Socket> list) {
		this.clientSocket = clientSocket;
		this.list = list;
	}

	@Override
	public void run() { // 스레드 클래스는 실행시 새로운 메서드를 실행한 후 자신의 run 패키지를 찾아 실행. 스레드에서 동작할 명령문들은 run()메서드에 구현.
		super.run();

		try {

			while(true) {
				// 수신
				BufferedReader br = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
				String msg;
				msg = br.readLine();
				System.out.println("클라이언트로부터 받은 메세지:" + msg);			


				// 전송
				for (int i = 0; i < list.size(); i++) {
					Socket s = list.get(i);
					if(s != clientSocket) {
						PrintWriter pw = new PrintWriter(s.getOutputStream());
						pw.println(msg);	//실질적으로 전송되는 부분
						pw.flush();	//현재 버퍼에 저장되어 있는 내용을 클라이언트로 전송하고 버퍼를 비운다.

					}
				}
				
				Thread.sleep(500); // (0.5초)저장된 시간동안 스레드 실행 멈춤 
								   // sleep 메소드는 정해진 시간만큼 대기하였다가 이후 일들을 처리하게 됨.
								   // ex) 1초마다 시간 출력되는 전광판 Thread.sleep(1000);
			}
		} catch (Exception e) {
			System.out.println("연결이 끊어진 IP:" + clientSocket.getInetAddress());
			
			list.remove(clientSocket);
			
			// 남은 client를 확인
			for (Socket soc : list) {
				System.out.println("접속이 되어 있는 IP:" + soc.getInetAddress() + " Port:" + soc.getPort());
			}
			
			try {
				clientSocket.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		} 

	}
}
