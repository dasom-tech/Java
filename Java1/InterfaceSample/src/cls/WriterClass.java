package cls;

import inter.WriteMode;

public class WriterClass {
	
	public void writer_method(WriteMode wm) {
		
		wm.write();
		
		if(wm instanceof Ballpen) {
			((Ballpen)wm).erase();
		}else {
			((Pencil)wm).delete();
		}
	}

}
