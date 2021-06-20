package ccls;

import pcls.ParentsClass;

public class ChildClass extends ParentsClass {
	
	private int cnumber;
	
	private ChildClass() {
		System.out.println("ChildClass ChildClass()");

	}
	
	public ChildClass(int cnumber, int pnumber) {
		//this(); 		// 자기참조: heap상에 올라가는 주소(pointer)
		//super(); 		// 부모 클래스의 reference(pointer)
		super(pnumber);
		
		System.out.println("ChildClass ChildClass(int cnumber)");
		this.cnumber = cnumber;
		
		System.out.println("cnumber=" + cnumber + "  pnumber=" + pnumber);
	}
	
}
		
