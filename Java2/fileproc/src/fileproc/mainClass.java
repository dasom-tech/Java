package fileproc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class mainClass {

	public static void main(String[] args) throws Exception {
		// 파일 생성	-> 파일명
		System.out.println("작성할 파일 생성");
		makeFile();
		
		// 파일 쓰기 + 추가 쓰기	-> input 
		writeFile();
		
		// 파일 읽기	-> output
		readfile();
		
		// 파일에 모든 데이터를 String[] 담고 리턴
		
		

	}
	static void makeFile() { 
		String fileStr = "D:\\quiz\\newfile.txt";
		File newfile = new File(fileStr);

		try {

			if(newfile.createNewFile()) {
				System.out.println("파일 생성 성공");
			}else {
				System.out.println("파일 생성 실패");
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	static void writeFile() throws IOException {
		File newfile = new File("D:/quiz/newfile.txt");
		
		FileWriter fw = new FileWriter(newfile, true);		// 파일 object 생성
		BufferedWriter bw = new BufferedWriter(fw); // 한 문장으로 생성
		PrintWriter pw = new PrintWriter(bw);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("작성할 내용을 적으세요");
		String myWord = sc.next();
		
		pw.println(myWord);
				
		pw.close();
		bw.close();
		fw.close();
	}
	static void readfile() {
		File newfile = new File("D:\\quiz\\newfile.txt");

		try {
			FileReader fr = new FileReader(newfile);

			String str = "";

			BufferedReader br = new BufferedReader(fr);

			while((str = br.readLine()) != null) {		// 파일 끝이 아닐때까지
				System.out.println(str);
			}
			br.close();


		} catch (FileNotFoundException e) {
			System.out.println("파일이 없습니다.");
		} catch (IOException e) {
			//	System.out.println("읽어들일 수 없습니다.");
			e.printStackTrace(); //반드시 이렇게 안 써도 됨
		} catch (Exception e) {
			System.out.println("그 외의 예외입니다.");
		}
	}
	// 파일에 모든 데이터를 String[] 담고 리턴
	
	
}
