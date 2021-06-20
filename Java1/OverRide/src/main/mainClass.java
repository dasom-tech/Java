package main;

import child.ChildClass;
import childone.ChildOneClass;
import parents.ParentsClass;

public class mainClass {
	
	public static void main(String[] args) {
		
		/*
		 	Over Ride
		 	상속 받은 후에 자식 클래스에서 상속 받은 함수를 고쳐 기입함을 의미
		 	
		 	상속 받은 함수와 prototype이 같아야 한다.
		 	
		 	public void func(int i) {
		 	
		 	}
		 	public double func(String i) {
		 	
		 	}
		 
		 */
		
		ChildClass cc = new ChildClass();
		cc.parents_method();
		
		ParentsClass pc = new ChildClass();
		pc.parents_method();
		
		
		/*
		ChildClass childArr[] = new ChildClass[5];
		ChildOneClass childOneArr[] = new ChildOneClass[3];
		
		childArr[0] = new ChildClass();
		childArr[1] = new ChildClass();
		childArr[2] = new ChildClass();
		
		childOneArr[0] = new ChildOneClass();
		childOneArr[1] = new ChildOneClass();
		childOneArr[2] = new ChildOneClass();
		
		ParentsClass pcArr[] = new ParentsClass[8];
		
		pcArr[0] = new ChildClass();
		pcArr[1] = new ChildOneClass();
		pcArr[2] = new ChildClass();
		*/
	}

}
