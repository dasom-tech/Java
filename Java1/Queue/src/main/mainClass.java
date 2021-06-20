package main;

public class mainClass {
	public static void main(String[] args) {
		// First In First Out
		
		QueueClass queue = new QueueClass(5);
		
		String str = "one";
		queue.push(str);
		
		String front = (String)queue.peek();
		System.out.println("front = " + front);
		
		str = "two";
		queue.push(str);
		
		front = (String)queue.peek();
		System.out.println("front = " + front);
		
		str = "three";
		queue.push(str);
		
		front = (String)queue.peek();
		System.out.println("front = " + front);
		
		queue.pop();
		
		front = (String)queue.peek();
		System.out.println("front = " + front);
		
		queue.pop();
		
		front = (String)queue.peek();
		System.out.println("front = " + front);
	}

}
