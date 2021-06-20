package quiz4;

class Dropship extends Unit{ // 수송선
	void load() { 
		System.out.println("태운다!");
		/* 선택된 대상을 태운다.*/ 
	}
	void unload() { 
		System.out.println("내린다!");
		/* 선택된 대상을 내린다.*/ 
	}
}