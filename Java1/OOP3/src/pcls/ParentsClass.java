package pcls;

public class ParentsClass {
	
	private int private_num;
	public int public_num;
	protected int protected_num;	// 자식 클래스에서만 접근 허용, 외부 접근 차단
	
	public ParentsClass() {
		System.out.println("ParentsClass ParentsClass()");
	}
	public int getPrivate_num() {
		return private_num;
	}

	public void setPrivate_num(int private_num) {
		this.private_num = private_num;
	}
	public void parentsMethod() {
		System.out.println("ParentsClass parentsMethod()");
	}
	
	protected void Parents_ProtectedMethod() {
		System.out.println("ParentsClass Parents_ProtectedMethod()");
	}

}
