package work06DiceGame;

import java.util.Arrays;
import java.util.Scanner;

public class MyWayDice {
	
	private int coin;
	private int dice1;
	private int dice2;
	private int myChoice;
	private int result;
	
	public int getCoin() {
		return coin;
	}
	public void setCoin() {
		Scanner sc = new Scanner(System.in);

		while(true) {
			System.out.println("배팅할 코인 수는?(1부터20사이 수) ");
			coin = sc.nextInt();

			if(coin < 1 || coin > 20) {
				System.out.println("잘 못 입력하셨습니다. 배팅할 코인 숫자를 다시 입력해주세요>>");
			}else {
				break;
			}
		}
		System.out.println("몇 번 숫자에 거시겠습니까? ");
		myChoice = sc.nextInt();
		
		while(coin <= 0) {
			if(myChoice == 3 && myChoice == result) {
				coin = coin * 18;
				System.out.println("축하합니다." + coin + "을 얻었습니다.");
			}else if(myChoice == 11 && myChoice == result) {
				coin = coin * 18;
				System.out.println("축하합니다." + coin + "을 얻었습니다.");
			}else if(myChoice == 4 && myChoice == result) {
				coin = coin * 12;
				System.out.println("축하합니다." + coin + "을 얻었습니다.");
			}else if(myChoice == 10 && myChoice == result) {
				coin = coin * 12;
				System.out.println("축하합니다." + coin + "을 얻었습니다.");
			}else if(myChoice == 5 && myChoice == result) {
				coin = coin * 9;
				System.out.println("축하합니다." + coin + "을 얻었습니다.");
			}else if(myChoice == 9 && myChoice == result) {
				coin = coin * 9;
				System.out.println("축하합니다." + coin + "을 얻었습니다.");
			}else if(myChoice == 6 && myChoice == result) {
				coin = coin * 8;
				System.out.println("축하합니다." + coin + "을 얻었습니다.");
			}else if(myChoice == 8 && myChoice == result) {
				coin = coin * 8;
				System.out.println("축하합니다." + coin + "을 얻었습니다.");
			}else if(myChoice == 7 && myChoice == result) {
				coin = coin * 7;
				System.out.println("축하합니다." + coin + "을 얻었습니다.");
			}else if(myChoice == 2 || myChoice == 12) {
				System.out.println("배팅할 수 없는 숫자입니다. 다시 입력해주세요>>> ");
			}else {
				System.out.println("틀렸습니다. 다시 배팅하세요>>> ");
			    continue;	
			}
			coin--;
			break;
		}
	}
	
	public void setDice1() {
		dice1 = (int)((Math.random()*6)+1);
		this.dice1 = dice1;
	}
	
	public void setDice2() {
		dice2 = (int)((Math.random()*6)+1);
		this.dice2 = dice2;
	}
	
	public int result1() {
		result = dice1 + dice2;
		return result;
	}
	
	
}

