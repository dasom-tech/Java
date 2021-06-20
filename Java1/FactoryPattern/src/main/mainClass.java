package main;

import java.util.ArrayList;
import java.util.List;

import animal.Animal;
import animal.Cat;
import animal.Cow;
import animal.Dog;
import factory.AnimalFactory;

public class mainClass {

	public static void main(String[] args) {
		/*
		 	Singleton Pattern
		 	- 중심이 되는 데이터 관리 template(list, map)을 중심으로
		 	     어느 클래스에서나 접근이 용이하게 하기 위한 패턴
		 	  instance(object)가 한 개임을 의미
		 	  
		 	Factory(공장) Pattern
		 	- 원하는 형태의 object를 생성하기 위한 패턴
		 	
		 	interface		동물
		 	class		고양이, 강아지, 황소
		 	
		 	Animal animal1 = new Cat();
		 	Animal animal2 = new Dog();
		 	Animal animal3 = new Cow();
		 	
		 	
		 */
		/*
		Animal ani1 = AnimalFactory.create("강아지");
		Animal ani2 = AnimalFactory.create("고양이");
		Animal ani3 = AnimalFactory.create("소");
		
		ani1.printDescript();
		ani2.printDescript();
		ani3.printDescript();
		
		((Cat)ani2).catMethod();
		*/
		
		List<Animal> list = new ArrayList<Animal>();
		
		String arrStr[] = {"소", "고양이", "소", "강아지", "강아지", "강아지"};
		
		for (int i = 0; i < arrStr.length; i++) {
			Animal a = AnimalFactory.create(arrStr[i]);
			list.add(a);
		}
		
		for (int i = 0; i < list.size(); i++) {
			Animal an = list.get(i);
			an.printDescript();
			
			if(an instanceof Cat) {
				Cat c = (Cat)an;
				c.CatMethod();
			}else if(an instanceof Dog) {
				((Dog)an).dogMethod();
			}else if(an instanceof Cow) {
				((Cow)an).cowMethod();
			}
		}

	}

}
