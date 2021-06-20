package main;

import javax.print.DocFlavor.STRING;

import stack.ArrayStack;

public class mainClass {

	public static void main(String[] args) {
		
		ArrayStack as = new ArrayStack();
		
		String str1 = "AAAAA";
		as.push(str1);
		
		String peekStr = (String)as.peek();
		System.out.println("top object : " + peekStr);
		
		str1 = "BBBBB";
		as.push(str1);
		
		peekStr = (String)as.peek();
		System.out.println("top object : " + peekStr);
		
		String delStr = (String)as.pop();
		
		peekStr = (String)as.peek();
		System.out.println("top object : " + peekStr);

	}

}
