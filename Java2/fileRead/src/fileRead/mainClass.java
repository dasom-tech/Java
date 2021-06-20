package fileRead;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class mainClass {

	public static void main(String[] args) {
		
		// file read
		
		File file = new File("D:\\tmp\\test.txt");
		//File file = new File("D:\\tmp\\newfile.txt");
		//	 instance, object
		
		try {
			FileReader fr = new FileReader(file);
			
			/*
			String str = "";
			
			int c = fr.read();	//한 문자씩 읽는다
			while(c != -1) {	//-1 == 파일의 끝
				System.out.println((char)c);
				str += (char)c;
				c = fr.read();
			}
			System.out.println(str);
			*/
			
			String str = "";
			// 문장으로 읽는다			Buffer == 저장공간
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

}
