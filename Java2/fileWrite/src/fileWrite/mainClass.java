package fileWrite;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class mainClass {

	public static void main(String[] args) throws Exception{
		
		// file write 읽기는 파일이 있어야 하지만 쓰기는 파일이 없으면 만들어서 쓴다.
		File file = new File("D:/tmp/test.txt");
		
		/*
		// 한 문자씩 기입
		FileWriter fw = new FileWriter(file);
		fw.write("hello" + "\n");
		fw.close();		// 매우 중요!!!!!!
		*/
		
		/*
		// 추가 쓰기(저장하고 실행할 때마다 추가됨)
		FileWriter fw = new FileWriter(file, true);
		fw.write("hello" + "\n");
		fw.close();
		*/
		
		// 문장을 추가로 쓰기
		FileWriter fw = new FileWriter(file, true);		// 파일 object 생성
		BufferedWriter bw = new BufferedWriter(fw); // 한 문장으로 생성
		PrintWriter pw = new PrintWriter(bw);
		
		pw.print("안녕 ");
		pw.println("하이하이");
		pw.println("건강하세요");
		
		pw.close();
		bw.close();
		fw.close();

	}

}
