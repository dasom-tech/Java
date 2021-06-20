package main;

import queue.ArrayQueue;

public class mainClass {

	public static void main(String[] args) {
		
		ArrayQueue aq = new ArrayQueue();
		
		String str1 = "AAAAA";
		aq.push(str1);
		
		String peekStr = (String)aq.peek();
		System.out.println("top object : " + peekStr);
		
		str1 = "BBBBB";
		aq.push(str1);
		
		peekStr = (String)aq.peek();
		System.out.println("top object : " + peekStr);
		
		String delStr = (String)aq.pop();
		
		peekStr = (String)aq.peek();
		System.out.println("top object : " + peekStr);
		
		

	}

}
