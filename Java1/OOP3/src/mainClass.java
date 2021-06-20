import cls.ChildClass;
import pcls.ParentsClass;

public class mainClass {

	public static void main(String[] args) {
		/*
		 	은닉성: 접근 지정자를 통해서 외부로부터 접근을 차단, 허용해주는 것을 의미
		 		  private(변수), public(메소드)
		 	
		 	상속성: 부모 클래스(super)에서 기능을 상속하는 것을 의미
		 		    추가 기입을 할 수 있다(오버라이드Over Ride)
		 		    
		 		    
		 		    
		 	
		 	다형성: 상속 후에 여러 형태의 자식 클래스를 제작
		 	
			 	 	 	부모	직사각형
			 	 자식 	정사각형	마름모	삼각형
		 	 	 		
		 
		 */
		
		ChildClass cc = new ChildClass();
		cc.parentsMethod();
		cc.childMethod();
		
		cc.public_num = 345;
		System.out.println(cc.public_num);
		//cc.protected_num = 567; 에러.자식에서만 사용
		//cc.Parents_ProtectedMethod(); 에러.자식에서만 사용
		
		ParentsClass pc = new ParentsClass();
		

	}

}
