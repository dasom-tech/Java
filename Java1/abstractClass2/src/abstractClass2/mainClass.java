package abstractClass2;

import Write.Ballpen;
import Write.Pencil;
import Write.Writer;

public class mainClass {
	public static void main(String[] args) {
		
		//Writer w = new Ballpen();
		Writer w = new Pencil();

		MyClass cls = new MyClass(w);

		cls.method();
	}
}

	 
