package pcls;

public class ParentsClass /*extends Object*/{//기본 상속이 Object
	
	private int pnumber;
	
	public ParentsClass() {
		System.out.println("ParentsClass ParentsClass()");
	}
	
	public ParentsClass(int pnumber) {
		super();
		this.pnumber = pnumber;
		System.out.println("ParentsClass ParentsClass(int pnumber)");
	}

}
