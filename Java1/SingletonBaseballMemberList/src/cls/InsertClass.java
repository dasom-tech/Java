package cls;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dto.Batter;
import dto.Human;
import dto.Pitcher;
import file.DataProc;
import single.SingletonClass;

public class InsertClass {
	Scanner sc = new Scanner(System.in);
	private int memberNumber;
	
		
	private List<Human> list;
	Human h;
	
	public void insert() {
		SingletonClass si = SingletonClass.getInstance();
		list = si.list;
		
		if(list.isEmpty()) {
			memberNumber = 1000 + 1;
		}else {
			// list의 마지막 선수의 번호
			memberNumber = list.get( list.size() - 1 ).getNumber();
			if(memberNumber >= 2000) {
				memberNumber = memberNumber - 1000;
			}
			
			memberNumber = memberNumber + 1;
		}
		 
		System.out.print("투수(1)/타자(2) = ");
		int position = sc.nextInt();
		
		// human
		System.out.print("이름 = ");
		String name = sc.next();
		
		System.out.print("나이 = ");
		int age = sc.nextInt();
		
		System.out.print("신장 = ");
		double height = sc.nextDouble();
		
		if(position == 1) {
			System.out.print("승 = ");
			int win = sc.nextInt();
			
			System.out.print("패 = ");
			int lose = sc.nextInt();
			
			System.out.print("방어율 = ");
			double defence = sc.nextDouble();
			
			h = new Pitcher(memberNumber, name, age, height, win, lose, defence);			
			si.list.add(h);
		}else if(position == 2){
			Batter b = new Batter();
			
			b.setNumber(memberNumber + 1000);
			b.setName(name);
			b.setAge(age);
			b.setHeight(height);
			
			System.out.print("타수 = ");
			int batcount = sc.nextInt();
			b.setBatcount(batcount);
			
			System.out.print("안타 수 = ");
			b.setHit( sc.nextInt() );
			
			System.out.print("타율 = ");
			double hitAvg = sc.nextDouble();
			b.setHitAvg(hitAvg);

			si.list.add(b);			
		}
		memberNumber++;
		
	}

}
