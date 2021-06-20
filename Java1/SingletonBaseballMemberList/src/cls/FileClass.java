package cls;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.List;
import java.util.Scanner;

import dto.Batter;
import dto.Human;
import dto.Pitcher;
import file.DataProc;
import single.SingletonClass;


public class FileClass {
	Scanner sc = new Scanner(System.in);
	
	private List<Human> list = null;
	private DataProc dataProc;
	private int memberNumber;
	private static File file;

	SingletonClass si = SingletonClass.getInstance();


	public void dataproc() {
		list = si.list;
	}

	public void dataSave() {
		list = si.list;
		dataProc = new DataProc("baseballTeam");
		dataProc.createFile();	
		// 1001-홍길동-24-180.0-20-1-0.01

		String arrStr[] = new String[list.size()];
		for (int i = 0; i < list.size(); i++) {
			Human h = list.get(i);
			arrStr[i] = h.toString();
		}

		DataProc.saveData(arrStr);		
	}

	public void dataLoad() {
		
		String filename = "baseballTeam";
		file = new File("D:\\tmp\\" + filename + ".txt");
		list = si.list;

		String str = "";

		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			while((str = br.readLine()) != null) {

				String data[] = str.split("-");
				int pos = Integer.parseInt(data[0]);

				if(pos < 2000) {
					list.add( new Pitcher(
							Integer.parseInt(data[0]), 	// 번호
							data[1], 	// 이름
							Integer.parseInt(data[2]), 	// 나이
							Double.parseDouble(data[3]), // 신장
							Integer.parseInt(data[4]), 	// 승
							Integer.parseInt(data[5]), 	// 패
							Double.parseDouble(data[6]) ) );	// 방어율
				}
				else {
					list.add( new Batter(
							Integer.parseInt(data[0]), 	// 번호
							data[1], 	// 이름
							Integer.parseInt(data[2]), 	// 나이
							Double.parseDouble(data[3]), // 신장
							Integer.parseInt(data[4]), 	// 타수
							Integer.parseInt(data[5]), 	// 안타 수
							Double.parseDouble(data[6]) ) );	// 타율				
				}			
			}
			br.close();
			
		} catch (Exception e) {			
			e.printStackTrace();
		}
	}

}