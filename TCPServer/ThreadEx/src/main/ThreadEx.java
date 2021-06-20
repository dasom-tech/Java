package main;

public class ThreadEx extends Thread{
	
	String msg;
	
	public ThreadEx(String msg) {
		this.msg = msg;
	}

	@Override
	public void run() {
		super.run();
		
		// for for for 동시에 실행 됨
		for (int i = 0; i < 10; i++) {
			System.out.println(msg);
			
			try {
				Thread.sleep(1000);	//1초마다 한번씩 돌기 
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
		}
	}
	
	
}
				
