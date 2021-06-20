package work06MyTv2;

public class main {

	public static void main(String[] args) {
		MyTv2 t = new MyTv2(); 
		
		t.setChannel(10);   
		System.out.println("CH:"+t.getChannel());  
		
		t.setVolume(20);   
		System.out.println("VOL:"+t.getVolume()); 

	}

}
