package cls;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dto.Batter;
import dto.Human;
import dto.Pitcher;
import single.SingletonClass;

public class UpdateClass {
	Scanner sc = new Scanner(System.in);
	private List<Human> list = null;
	
	SingletonClass si = SingletonClass.getInstance();
		
	public void update() {	
		list = si.list;
		System.out.print("수정하고 싶은 선수의 이름 = ");
		String name = sc.next();
		
		int index = search(name);
		
		if(index == -1) {
			System.out.println("선수 명단에 없습니다");
			return;
		}
		
		Human h = list.get(index);
		if(h instanceof Pitcher) {
			System.out.print("승 = ");
			int win = sc.nextInt();
			
			System.out.print("패 = ");
			int lose = sc.nextInt();
			
			System.out.print("방어율 = ");
			double defence = sc.nextDouble();
			
			((Pitcher)h).setWin(win);
			((Pitcher)h).setLose(lose);
			((Pitcher)h).setDefence(defence);
		}
		else if(h instanceof Batter) {
			System.out.print("타수 = ");
			int batcount = sc.nextInt();
			
			System.out.print("안타 수 = ");
			int hit = sc.nextInt();
			
			System.out.print("타율 = ");
			double hitAvg = sc.nextDouble();
			
			Batter bat = (Batter)h;
			bat.setBatcount(batcount);
			bat.setHit(hit);
			bat.setHitAvg(hitAvg);			
		}
	}
	
	private int search(String name) {
		int index = -1;		
		for (int i = 0; i < list.size(); i++) {
			Human h = list.get(i);
			if(name.equals(h.getName())) {
				index = i;
				break;
			}
		}		
		return index; 
	}
}
