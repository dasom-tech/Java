package main;

import java.util.Scanner;

	public class testing {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        String n;
	        char c;
	        
	        System.out.println("숫자입력>> ");
	        n = scanner.nextLine();
	        
	        for(int i=0;i<n.length();i++){
	            c = n.charAt(i);
	            if(!('0'<= c && c <= '9')){
	                System.out.println("문자가 포함되어있습니다.");
	                System.exit(-1);
	            }
	        }
	        boolean isPrime = false;
	        int m = Integer.parseInt(n);
	        for(int i=2;i<m;i++){
	            if(m % i == 0){
	                isPrime = true;
	                break;
	            }
	        }
	        if(isPrime) {

	            System.out.println(m + "은 정수입니다.");
	        }
	        else{
	            System.out.println(m + "은 소수입니다.");
	        }
	    }
	
}