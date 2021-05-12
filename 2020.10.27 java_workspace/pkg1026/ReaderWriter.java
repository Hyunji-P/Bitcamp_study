package pkg1026;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReaderWriter {

	public static void main(String[] args) {
		String path = "c:\\imsi\\fromfile.txt";
		String pathname = "c:\\imsi\\def.txt";
		
		File dest = new File(path);
		File dest1 = new File(pathname);

		FileReader fr = null;
		BufferedReader br = null;
		BufferedWriter bw = null;

		try {
			// 읽기 → 쓰기
			fr = new FileReader(dest);
			br = new BufferedReader(fr);
			// 쓰기
			bw = new BufferedWriter(new FileWriter(dest1));

			// 읽기 → 쓰기
			String imsi = "";
			while ((imsi = br.readLine()) != null) {
				bw.write(imsi);
				bw.newLine();
			}

			// 쓰기
			imsi = "";
			for (int i = 1; i < 10; i++) {
				imsi = i + " * " + i + " = " + String.valueOf(i * i);
				bw.write(imsi);
				bw.newLine();
			}

			System.out.println("작업 완료");
		} catch (IOException e) {
			System.out.println("데이터 입출력 에러 입니다.");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("나머지 예외 발생");
			e.printStackTrace();
		} finally {
			try {
				if (br != null || bw != null) {
					br.close();
					bw.close();
				}
				if (fr != null) {
					fr.close();

				}

			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}

}
