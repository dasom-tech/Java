package main;

import childOne.ChildOne;
import childTwo.ChildTwo;
import parents.Parents;

public class mainClass {
	
	public static void main(String[] args) {
		
		// 10명
		/*
		ChildOne one = new ChildOne();
		ChildTwo two = new ChildTwo();
		*/
		
		
		/*
		Parents pone = new ChildOne();
		Parents ptwo = new ChildTwo();
		
		ChildOne cone = (ChildOne)pone;
		cone.func();
		*/
		
		Object obj = new ChildOne();
		Object obj1 = new ChildTwo();
		
		ChildOne one = (ChildOne)obj;
		ChildTwo two = (ChildTwo)obj1;
		
		one.func();
		one.method();
		two.method();
		
		/*
		Parents pArr[] = new Parents[10];
		pArr[0] = new ChildOne();
		pArr[1] = new ChildTwo();
		pArr[2] = new ChildTwo();
		pArr[3] = new ChildTwo();
		pArr[4] = new ChildOne();
		pArr[5] = new ChildOne();
		pArr[6] = new ChildTwo();
		pArr[7] = new ChildTwo();
		pArr[8] = new ChildTwo();
		pArr[9] = new ChildOne();
		
		for(Parents p : pArr) {
			p.method();
		}
		*/
		
	}

}
