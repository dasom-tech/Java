package quiz4;

public class Unit {
	int x, y; // 현재 위치
	void move(int x, int y) { 
		System.out.println("x = " + x + " y = " + y);
		/* 지정된 위치로 이동 */ 
	}
	void stop() { 
		System.out.println("멈춤!");
		/* 현재 위치에 정지 */ 
	}

}
