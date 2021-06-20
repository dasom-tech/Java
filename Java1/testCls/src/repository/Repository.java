package repository;

import java.util.HashMap;
import java.util.Map;

public class Repository {
	
	private final Map<Integer, Member> store = new HashMap<Integer, Member>();
	private int sequence = 0;
	
	public void addMember(Member member) {
		store.put(++sequence, member);
		member.setId(sequence);
	}
	
	public Member findMemberById(Integer id) {
		return store.get(id);
	}
}

class Member {
	private int id;
	private String name;
	
	public Member(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	
}