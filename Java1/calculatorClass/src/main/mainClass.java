package main;

import calculator2.Calculator2;
import calculator.Calculator;

public class mainClass {

	public static void main(String[] args) {
		
		/* Calculator패키지꺼 쓸 때
		Calculator cal = new Calculator();
		cal.input();
		cal.process();
		cal.result();
		*/
		
		Calculator2 cal2 = new Calculator2();
		cal2.resultPrint();

	}

}
