package main;

public class mainClass {
	public static void main(String[] args) {
		
		Node node1 =  new Node(111);
		Node node2 = new Node(new Integer(222)); //위에 숫자만 넣은것과 동일
		
		node1.makeLeftSubTree(node2);
		
		Node node3 =  new Node(333);
		
		// node2.makeRightSubTree(node3); 아래와 같음.
		node1.getLeftSubTree().makeRightSubTree(node3);
		// 노드2의 right와 노드3 주소 동일함 확인.
		System.out.println(node1.getLeftSubTree());
		System.out.println(node2.getRightSubTree());
		System.out.println(node3);
	}

}
