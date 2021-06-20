package main;

public class StackClass {
	
	private int top;				// 통에서 제일 상위에 있는 공
	private int maxSize;
	
	private Object stackArray[];	// 통
	
	public StackClass(int maxSize) {
		this.maxSize = maxSize;
		this.top = -1;
		
		stackArray = new Object[maxSize];
	}
	
	// 통이 비어 있는지?
	public boolean isEmpty() {
		return(top == -1);
	}
	
	// 통이 가득 차 있는지?
	public boolean isFull() {
		return(top == maxSize - 1);
	}
	
	// 통에 공을 추가
	public void push(Object obj	) {
		if(isFull()) {
			System.out.println("통이 가득 차 있습니다.");
			return;
		}
		top++;
		stackArray[top] = obj;
	}
	
	// 통에 공을 뺀다
	public Object pop() {
		Object obj = peek();
		
		if(top <= -1) {
			System.out.println("통이 비어 있습니다.");
			return null;
		}
		top--;
		return obj;
	}
	
	// 가장 위의 공이 무엇인지 확인
	public Object peek() {
		if(isEmpty()) {
			System.out.println("통이 비어 있습니다.");
			return null;
		}
		return stackArray[top];
	}

}
