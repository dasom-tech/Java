package queue;

import java.util.ArrayList;
import java.util.List;

public class ArrayQueue {
	
	private int maxSize;
	private int front;
	private int rear;
	
	private List<Object> list = new ArrayList<Object>();

	public ArrayQueue() {
		maxSize = 10;
	}
	
	public boolean isEmpty() {
		return (front == rear + 1);
	}
	
	public boolean isFull() {
		return (rear == maxSize - 1);
	}
	
	// 추가
	public void push(Object obj) {
		if(isFull()) {
			return;
		}
		rear++;
		list.add(obj);
	}
	
	// 삭제
	public Object pop() {
		Object obj = peek();
		
		if(front > maxSize -1) {
			list.remove(obj);
			return obj;
		}
		
		front++;
		return obj;
	}
	
	public Object peek() {
		if(isEmpty()) {
			return null;
		}
		return list.get(front);
	}

}
