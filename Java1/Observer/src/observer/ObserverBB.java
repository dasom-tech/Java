package observer;

import java.util.Observable;
import java.util.Observer;

public class ObserverBB implements Observer{

	@Override
	public void update(Observable o, Object arg) {
		
		String str = (String)arg;
		System.out.println("감시자 BB입니다. 통지 받았음: " + str);
		
	}

}
