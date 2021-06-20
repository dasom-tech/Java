package dao;

import java.util.Scanner;

import dto.Batter;
import dto.Human;
import dto.Pitcher;
import file.DataProc;

public class MemberDao {

	Scanner sc = new Scanner(System.in);
	
//	private Pitcher pitcher[];
//	private Batter batter[];
	
	private Human human[] = null;	
	private int mem_count;
	
	DataProc dp;
	
	public MemberDao() {
		human = new Human[100];
		
		human[0] = new Pitcher(1, "홍길동", 20, 158, 1, 6, 5.5);
		human[1] = new Pitcher(2, "일지매", 19, 185, 2, 4, 9.2);
		human[2] = new Pitcher(3, "최성학", 35, 181, 9, 8, 9.8);
		human[3] = new Batter(1, "남주혁", 21, 184, 1, 6, 7.5);
		human[4] = new Batter(2, "성춘향", 31, 158, 6, 7, 4.1);
		
		mem_count = 0;
	}
	
	public MemberDao(int count) {
		human = new Human[count];
		mem_count = 0;
	}
	
	public void insert() {
		// 투수/타자 
		System.out.print("투수(1)/타자(2) = ");
		int pos = sc.nextInt();
		
		System.out.print("번호 = ");
		int number = sc.nextInt();
		
		System.out.print("이름 = ");
		String name = sc.next();
		
		System.out.print("나이 = ");
		int age = sc.nextInt();
		
		System.out.print("신장 = ");
		double height = sc.nextDouble();
		
		Human h = null;
		if(pos == 1) {
			System.out.print("승리 = ");
			int win = sc.nextInt();
			
			System.out.print("패전 = ");
			int lose = sc.nextInt();
			
			System.out.print("방어율 = ");
			double defence = sc.nextDouble();
			
			//human[mem_count] = new Pitcher(number, name, age, height, win, lose, defence);
			h = new Pitcher(number, name, age, height, win, lose, defence);			
			
		}else if(pos == 2){			
			System.out.print("타수 = ");
			int batcount = sc.nextInt();
			
			System.out.print("안타수 = ");
			int hit = sc.nextInt();
			
			System.out.print("타율 = ");
			double hitAvg = sc.nextDouble();
			
			//human[mem_count] = new Batter(number, name, age, height, batcount, hit, hitAvg);
			h = new Batter(number, name, age, height, batcount, hit, hitAvg);
		}	
		human[mem_count] = h;		
		mem_count++;
	}
	
	
	public void allprint() {
		for (int i = 0; i < human.length; i++) {
			if(human[i] != null && !human[i].getName().equals("")) {
				System.out.println(human[i].toString());
			}
		}
	}
	
	
	public void delete() {
		System.out.println("삭제할 선수의 이름을 입력 해주세요>>> ");
		String name = sc.next();
		
		int index = search(name);
		if(index == -1) {
			System.out.println("등록되지 않은 선수입니다.");
			return;
		}
		if(human[index] instanceof Pitcher) {
			Pitcher p = (Pitcher)human[index];
			p.pitcherClear();		
						
		}else if(human[index] instanceof Batter) {
			Batter b = (Batter)human[index];
			b.batterClear();
		
		}
		System.out.println(name + "선수의 데이터를 삭제했습니다.");
	}
	
	public void select() {
		System.out.println("검색할 선수명을 입력 해주세요>>> ");
		String name = sc.next();
		
		int index = -1;
		for (int i = 0; i < human.length; i++) {
			if(human[i] != null) {
				if(name.equals(human[i].getName())) {
					index = i;
					break;
				}
			}
		}
		if(index != -1) {
			System.out.println(human[index].toString());
		}else {
			System.out.println("선수 명단에 없습니다.");
		}
	}
	public void update() {
		System.out.println("수정할 선수명을 입력 해주세요>>> ");
		String name = sc.next();
		
		int index = -1;
		for (int i = 0; i < human.length; i++) {
			if(human[i] != null) {
				if(name.equals(human[i].getName())) {
					index = i;
					break;
				}
			}
		}
		if(index != -1) {
			System.out.println("어떤 정보를 수정하시겠습니까?");
			System.out.println("1.번호  2.이름  3.나이  4.신장  5.승리/타수  6.패전/안타수  7.방어율/타율");
			
			int num = sc.nextInt();

			switch(num) {
			case 1:
				System.out.println("수정할 번호 : ");
				int number1 = sc.nextInt();
				human[index].setNumber(number1);
				System.out.println("번호가" + number1 + "로 수정되었습니다.");
				break;
			case 2:
				System.out.println("변경할 이름 : ");
				String name1 = sc.next();
				human[index].setName(name1);
				System.out.println("이름이" + name1 + "로 수정되었습니다.");
				break;
			case 3:
				System.out.print("수정할 나이(숫자) : ");
				int age1 = sc.nextInt();
				human[index].setAge(age1);
				System.out.println("나이가" + age1 + "살로 수정되었습니다.");
				break;
			case 4:
				System.out.println("변경할 신장(숫자) : ");
				double height1 = sc.nextDouble();
				human[index].setHeight(height1);
				System.out.println("신장이" + height1 + "로 수정되었습니다.");
				break;
			case 5:
				if(human[index] instanceof Pitcher) {
					Pitcher p = (Pitcher)human[index];
					System.out.println("변경할 승리 : ");
					int win1 = sc.nextInt();
					p.setWin(win1);
					System.out.println("승리가" + win1 + "로 수정되었습니다.");
					break;
				}else if(human[index] instanceof Batter) {
					Batter b = (Batter)human[index];
					System.out.println("변경할 타수 : ");
					int batcount1 = sc.nextInt();
					b.setBatcount(batcount1);
					System.out.println("타수가" + batcount1 + "로 수정되었습니다.");
					break;
				}				
				
			case 6:
				if(human[index] instanceof Pitcher) {
					Pitcher p = (Pitcher)human[index];
					System.out.println("변경할 패전 : ");
					int lose1 = sc.nextInt();
					p.setLose(lose1);
					System.out.println("패전이" + lose1 + "로 수정되었습니다.");
					break;
				}else if(human[index] instanceof Batter) {
					Batter b = (Batter)human[index];
					System.out.println("변경할 안타수 : ");
					int hit1 = sc.nextInt();
					b.setHit(hit1);
					System.out.println("안타수가" + hit1 + "로 수정되었습니다.");
					break;
				}
				
			case 7:
				if(human[index] instanceof Pitcher) {
					Pitcher p = (Pitcher)human[index];
					System.out.println("변경할 방어율 : ");
					double defence1 = sc.nextDouble();
					p.setDefence(defence1);
					System.out.println("방어율이" + defence1 + "로 수정되었습니다.");
					break;
				}else if(human[index] instanceof Batter) {
					Batter b = (Batter)human[index];
					System.out.println("변경할 타율 : ");
					double hitavg1 = sc.nextDouble();
					b.setHitAvg(hitavg1);
					System.out.println("타율이" + hitavg1 + "로 수정되었습니다.");
					break;
				}		
			}
			System.out.println(human[index].toString());
		}
	}
	
	public int search(String name) {		
		int index = -1;
		for (int i = 0; i < human.length; i++) {
			// 		생성 안 된 객체 체크			삭제된 데이터를 체크
			if(human[i] != null && human[i].getNumber() != 0) {
				if(name.equals(human[i].getName())) {
					index = i;
					break;
				}
			}
		}
		return index;
	}
	public int[] searchAll(String name) {
		int indexs[] = null;
		int count = 0;	
				
		for (int i = 0; i < human.length; i++) {
			if(human[i] != null && human[i].getAge() != 0) {
				if(human[i].getName().equals(name)) {
					count++;
				}
			}
		}
		
		if(count == 0) {
			System.out.println("작성한 이름의 선수는 없습니다");
			return null;
		}
		
		indexs = new int[count];
		
		int j = 0;
		for (int i = 0; i < human.length; i++) {
			if(human[i] != null && human[i].getAge() != 0) {
				if(human[i].getName().equals(name)) {
					indexs[j] = i;
					j++;
				}
			}
		}
		return indexs;		
	}
	
	public void save() {
		// 1001-홍길동-24-
		dp = new DataProc("야구선수명부");
		dp.createFile();
		
		int len = 0;
		for (int i = 0; i < human.length; i++) {
			if(human[i] != null && !human[i].getName().equals("")) {
				len++;
			}
		}
		
		String datas[] = new String[len];
		int j = 0;
		for (int i = 0; i < human.length; i++) {
			if(human[i] != null && !human[i].getName().equals("")) {
				datas[j] = human[i].toString();
				j++;
			}
		}
		dp.saveData(datas);
	}
	
	public void load() {
		
		String datas[] = dp.loadData();
		/* 확인용
		for (int i = 0; i < datas.length; i++) {
			System.out.println(datas[i]);
		}
		*/
		/*
		 	datas => Human
		 	pos -> "투수" / "타자"
		 	number 투수 -> 1001
		 		       타자 -> 1002 + 1000
		 		       
		 */
		
		for (int i = 0; i < datas.length; i++) {
			
			/*
			 	datas[0] -> 1001-홍길동-24-180-...
			 	
			 	data[0] : number
			 	data[1] : name
			 	data[2] : age
			 
			 */
			String data[] = datas[i].split("-");
			int number = Integer.parseInt(data[0]);
			
			if(number < 2000) {	//투수
				human[i] = new Pitcher(Integer.parseInt(data[0]), 
										data[1], 
										Integer.parseInt(data[2]), 
										Double.parseDouble(data[3]), 
										Integer.parseInt(data[4]), 
										Integer.parseInt(data[5]), 
										Double.parseDouble(data[6]));
				
			}else {
				human[i] = new Batter(Integer.parseInt(data[0]), 
						data[1], 
						Integer.parseInt(data[2]), 
						Double.parseDouble(data[3]), 
						Integer.parseInt(data[4]), 
						Integer.parseInt(data[5]), 
						Double.parseDouble(data[6]));
			}
		}
	}
	
			
}
