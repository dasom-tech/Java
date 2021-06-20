package main;

import cls.AbstractClass;
import cls.NormalClass;

public class mainClass {
	public static void main(String[] args) {

		/*
	 	abstract : 추상
	 			       완전체는 아닌 선언만 되어 있는 메소드를 포함하고 있는 클래스(내용이 없음)

	 			       추상메소드 + 일반메소드 + 변수 = 추상클래스

	 			       생성은 불가능하다. 상속후 추상메소드를 작성한 후에 생성이 가능
	 			   instance로 생성은 가능하다.

	 	abstract class{
	 	 	void method() {

	 	 	}
	 	 	abstract void func();
	 	} 

		 */

		//AbstractClass acls = new AbstractClass(); -> 불가

		NormalClass nc = new NormalClass();
		nc.method();
		nc.abstractMethod();

		AbstractClass ac = new NormalClass();
		ac.method();
		ac.abstractMethod();
		
		AbstractClass ac1 = new AbstractClass() {
			
			@Override
			public void abstractMethod() {
				System.out.println("AbstractClass abstractMethod()");
				
			}
		};
		
		ac1.abstractMethod();
		ac1.method();

	}

}

	 		
