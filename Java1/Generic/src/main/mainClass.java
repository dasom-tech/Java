package main;

public class mainClass {

	public static void main(String[] args) {
		/*
		 	Generic : template(형태)
		 			     자료형의 변수
		 			     같은 클래스에서 다양한 자료형을 사용하고 싶은 경우에 사용
		 
		 */
		Box<Integer> box = new Box<Integer>(111);
		System.out.println(box.getTemp() + 1);
		
		Box<String> str = new Box<String>("my World");
		System.out.println(str.getTemp());
		
		// Box<MyClass> box1 = new Box<MyClass>(); 가능
		
		BoxMap<Integer, String> bmap = new BoxMap<Integer, String>(1001, "hello");
		System.out.println(bmap.getKey());
		System.out.println(bmap.getValue());
		
		BoxMap<String, Object> boxM = new BoxMap<String, Object>(new String("world"), new Integer(235));
		System.out.println(boxM.getKey());
		System.out.println(boxM.getValue());
	}
	
}
class Box<T> {
	
	T temp;

	public Box(T temp) {
		this.temp = temp;
	}
	
	public T getTemp() {
		return temp;
	}
	
	public void setTemp(T temp) {
		this.temp = temp;
	}
	
}
		
class BoxMap<Key, Value> {		// HashMap도 이런 형태
	
	Key key;
	Value value;
	public BoxMap(Key key, Value value) {
		this.key = key;
		this.value = value;
	}
	public Key getKey() {
		return key;
	}
	public void setKey(Key key) {
		this.key = key;
	}
	public Value getValue() {
		return value;
	}
	public void setValue(Value value) {
		this.value = value;
	}
	
	
}
		 
		 
