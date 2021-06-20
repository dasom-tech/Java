package main;

import java.util.Scanner;
import java.util.Stack;

public class mainClass {
	public static void main(String[] args) {
		/*
		 	Stack : First In Last Out
		*/
		
		/*
		StackClass stack = new StackClass(5);
		
		String str = "one";
		stack.push(str);
		
		String peekstr = (String)stack.peek();
		System.out.println("top object : " + peekstr);
		
		str = "two";
		stack.push(str);
		
		peekstr = (String)stack.peek();
		System.out.println("top object : " + peekstr);
		
		String popstr = (String)stack.pop();
		System.out.println("삭제된 객체 : " + popstr);
		
		peekstr = (String)stack.peek();
		System.out.println("top object : " + peekstr);
		
		Integer i =111;
		stack.push(i);
		
		Integer t = (Integer)stack.peek();
		System.out.println("top object : " + t);
		*/
		
		// 통 가득 차면 못 들어가게 메뉴 만들어보기
		Scanner sc = new Scanner(System.in);
		StackClass stack = new StackClass(3);
		
		while(true) {
		System.out.println("메뉴를 선택하세요>>>");
		System.out.println("1.추가  2.삭제  3.제일 위의 물건이 무엇인지 확인하기");
		int choice = sc.nextInt();
				
			switch(choice) {
			case 1:
				System.out.println("어떤 물건을 넣으시겠습니까?");
				String str = sc.next();
				stack.push(str);
				break;
			case 2:
				System.out.println("마지막에 넣은 물건을 삭제합니다.");
				String popstr = (String)stack.pop();
				System.out.println(popstr + "을 삭제하였습니다.");
				break;
			case 3:
				String peekstr = (String)stack.peek();
				System.out.println("제일 위에 있는 물건은 " + peekstr + "입니다.");
			}
			continue;
		}
	}

}
