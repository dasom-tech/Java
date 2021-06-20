package test;

import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print(">> name : ");
		String name = sc.nextLine();
		System.out.println(">> name : " + name);
		
		System.out.print(">> age : ");
		int age = sc.nextInt();
		System.out.println(">> age : " + age);
		
		System.out.print(">> man : ");
		boolean man = sc.nextBoolean();
		System.out.println(">> man : " + man);
		
		System.out.print(">> phone : ");
		String phone = sc.next();
		System.out.println(">> phone : " + phone);
		
		System.out.print(">> height : ");
		double height = sc.nextDouble();
		System.out.println(">> height : " + height);
		
		System.out.print(">> address : ");
		String address = sc.next();
		System.out.println(">> address : " + address);
		
	}

}
