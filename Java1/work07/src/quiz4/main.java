package quiz4;

public class main {

	public static void main(String[] args) {
		/*
		Marine ma = new Marine();
		Tank ta = new Tank();
		Dropship dr = new Dropship();
		*/
		
		Unit unit = new Marine();
		
		Unit charUnit[] = new Unit[4];
		
		charUnit[0] = new Tank();
		charUnit[1] = new Dropship();
		charUnit[2] = new Tank();
		charUnit[3] = new Marine();
		
		charUnit[0].move(100, 120);
		charUnit[1].move(200, 150);
		charUnit[2].move(170, 220);
		charUnit[3].move(180, 210);
		
		for (int i = 0; i < charUnit.length; i++) {
			charUnit[i].stop();
		}
		
		for (int i = 0; i < charUnit.length; i++) {
		//	if(부모클래스 instanceof 자식클래스)
			
			if(charUnit[i] instanceof Marine) {
				Marine m = (Marine)charUnit[i];
				m.stimPack();
			}else if(charUnit[i] instanceof Tank) {
				((Tank)charUnit[i]).changeMode();
			}else if(charUnit[i] instanceof Dropship) {
				((Dropship)charUnit[i]).load();
				((Dropship)charUnit[i]).unload();
			}
		}
	}

}
