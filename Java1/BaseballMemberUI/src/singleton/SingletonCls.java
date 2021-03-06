package singleton;

import dao.MemberDao;

public class SingletonCls extends MemberDao {
	
	private static SingletonCls cls = null;	
	public MemberDao dao = null;
	
	private SingletonCls() {
		dao = new MemberDao();
	}

	
	public static SingletonCls getInstance() {
		if(cls == null) {
			cls = new SingletonCls();
		}
		return cls;
	}

}
