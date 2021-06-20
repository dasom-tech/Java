package dao;

import java.util.ArrayList;
import java.util.List;

import dto.Batter;
import dto.Human;
import dto.Pitcher;

public class MemberDao {

	private List<Human> list;
	private int memberNum;
	
	public MemberDao() {
		list = new ArrayList<Human>();
		
		//memberNum = list.get(list.size() - 1).getNumber();
		memberNum = 1000;
		
		if(memberNum >= 2000) {
			memberNum = memberNum - 1000;
		}
		memberNum += 1;
	}
	
	public boolean insert(Human h) {
		
		if(h instanceof Pitcher) {
			h.setNumber(memberNum);
		}else if(h instanceof Batter) {
			h.setNumber(memberNum + 1000);
		}
		
		boolean b = list.add(h);
		
		for (Human hu : list) {
			System.out.println(hu.toString());
		}
		memberNum++;
		
		return b;
	}

	public List<Human> getList() {
		return list;
	}

	public void setList(List<Human> list) {
		this.list = list;
	}

	public boolean search(String msg) {
		// TODO Auto-generated method stub
		return false;
	}
	

}
