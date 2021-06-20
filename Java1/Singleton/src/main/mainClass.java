package main;

import he.HeClass;
import my.MyClass;
import single.SingletonClass;
import you.YouClass;

public class mainClass {

	public static void main(String[] args) {
		/*
		MyClass mycls = new MyClass();
		YouClass youcls = new YouClass();
		
		
		int n = mycls.getNumber();
		youcls.setCount(n);
		
		System.out.println(youcls.toString());
		*/
		
		/*
		SingletonClass scls1 = new SingletonClass();
		//SingletonClass.staticnumber = 111;
		scls1.staticnumber = 111;
		
		SingletonClass scls2 = new SingletonClass();
		scls2.staticnumber = 222;
		*/
		
		//SingletonClass s = new SingletonClass(); //private클래스라서 에러
		
		/*
		SingletonClass si = SingletonClass.getInstance();
		System.out.println(si);
		System.out.println(si.number);
		
		si = SingletonClass.getInstance();
		System.out.println(si);
		System.out.println(si.number);
		*/
		
		MyClass mycls = new MyClass();
		YouClass youcls = new YouClass();
		HeClass hecls = new HeClass();
		
		System.out.println(youcls.toString());
		
		hecls.method();
		System.out.println(hecls.toString());

	}

}
















