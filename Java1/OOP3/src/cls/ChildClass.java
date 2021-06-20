package cls;

import pcls.ParentsClass;

public class ChildClass extends ParentsClass {
	
	public ChildClass() {
		System.out.println("ChildClass ChildClass()");
	}
	
	public void childMethod() {
		setPrivate_num(123);
		int n = getPrivate_num();
		
		public_num = 234;
		protected_num = 456;
		
		Parents_ProtectedMethod();
		
		System.out.println("ChildClass childMethod() n = " + n);
	}

}
