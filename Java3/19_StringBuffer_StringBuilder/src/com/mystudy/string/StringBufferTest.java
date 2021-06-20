package com.mystudy.string;

public class StringBufferTest {

	public static void main(String[] args) {
		String str = new String("Hello Java!!!");
		System.out.println(str);
		str = str + " 반갑습니다";
		System.out.println(str);
		System.out.println(str.replace("a", "o"));
		System.out.println("replace 후: " + str);
		System.out.println("-------------->> StringBuffer");
		
		//StringBuffer 객체 생성
		StringBuffer sb = new StringBuffer("Hello Java!!!");
		System.out.println(sb);
		System.out.println(sb.toString());
		System.out.println("sb.capacity() : " + sb.capacity());
		
		
		sb.append(" 반갑습니다");
		System.out.println(sb.toString());
		System.out.println("sb.capacity() : " + sb.capacity());
		
		System.out.println(">> delete(), insert() ------");
		System.out.println("sb.delete(0, 6) : " + sb.delete(0, 6)); //0부터 6이전까지 삭제   //자기 자신 리턴
		System.out.println(sb.toString());
		//System.out.println(sb); 위와 같음
		sb.insert(0, "Hello ");			//자기 자신 리턴
		System.out.println("sb.insert(0, \"Hello \") 실행후 : " + sb);
		System.out.println("sb.length() : " + sb.length());
		System.out.println("sb.capacity() : " + sb.capacity());
		
		System.out.println("-------new StringBuffer(100)-------");
		StringBuffer sb2 = new StringBuffer(100);
		System.out.println("sb2.length() : " + sb2.length());
		System.out.println("sb2.capacity() : " + sb2.capacity());
		sb2.append("안녕하세요. 반갑습니다!!!");
		System.out.println(sb2);
		System.out.println("sb2.length() : " + sb2.length());
		System.out.println("sb2.capacity() : " + sb2.capacity());
		sb2.trimToSize();
		System.out.println("sb2.length() : " + sb2.length());
		System.out.println("sb2.capacity() : " + sb2.capacity());
		sb2.append("자바 공부중").append("입니다");
		System.out.println("sb2.length() : " + sb2.length());
		System.out.println("sb2.capacity() : " + sb2.capacity());
		
		System.out.println("--------------------");
		sb2.trimToSize();
		System.out.println("sb2 : " + sb2);
		sb2.setLength(3);
		System.out.println("sb2 : " + sb2 + "-");
		System.out.println("sb2.length() : " + sb2.length());
		System.out.println("sb2.capacity() : " + sb2.capacity());

	}

}
