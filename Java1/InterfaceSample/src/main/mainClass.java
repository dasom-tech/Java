package main;

import cls.Ballpen;
import cls.MyClass;
import cls.Pencil;
import cls.WriterClass;
import inter.MyInterface;
import inter.WriteMode;

public class mainClass {

	public static void main(String[] args) {
		/*
		  	abstract class : 추상메소드 + 일반메소드
		  	
		  	interface : 메소드가 선언만 되어있다.
		  				생성은 불가능하다. 상속 후에 정의를 한 후에 생성이 가능
		  				변수 선언이 불가능하다.  	
		  				다중 상속이 가능하다.		  	
		 */
		
		MyClass mycls = new MyClass();
		mycls.method();
		mycls.func();
		
		MyInterface myint = new MyClass();
		myint.method();
		myint.func();
		
		MyInterface myinter = new MyInterface() {
			@Override
			public void method() {
			}
			
			@Override
			public void func() {
			}
		};
		
		WriterClass wc = new WriterClass();
		
		wc.writer_method(new Ballpen());
		wc.writer_method(new Pencil());
		
		WriteMode mode[] = new WriteMode[5];
		
		mode[0] = new Pencil();
		mode[1] = new Ballpen();
		mode[2] = new Ballpen();
		mode[3] = new Pencil();
		mode[4] = new Pencil();
		
		for (int i = 0; i < mode.length; i++) {
			wc.writer_method(mode[i]);
		}
		
	}
	
}
				
				
				 
				
		
		

