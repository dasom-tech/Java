package main;

import cls.MyClass;
import observer.ObserverAA;
import observer.ObserverBB;

public class mainClass {

	public static void main(String[] args) {
		/*
		 	Observer : 감시, 정찰
		 			       감시자 패턴
		 			       특정 class를 감시
		 
		 */
		
		MyClass cls = new MyClass();
		
		// 감시자를 두 명 추가
		cls.addObserver(new ObserverAA());
		cls.addObserver(new ObserverBB());
		
		cls.setId("abc123");
		cls.setPassword("aabbccddPassword");
		
		cls.notifyObservers("id: " + cls.getId() + " pw: " + cls.getPassword());

	}

}
