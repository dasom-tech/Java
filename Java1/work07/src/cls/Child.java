package cls;

class Child extends Parent {
	int x = 3000;
	Child() {
		this(1000);
	}
	Child(int x) {
		this.x = x;
	}
	@Override
	public String toString() {
		return "Child [x=" + x + "]";
	}
}


