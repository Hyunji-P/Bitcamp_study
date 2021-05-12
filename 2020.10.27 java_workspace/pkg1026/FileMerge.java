package pkg1026;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileMerge {

	public static void main(String[] args) {
		String pathname01 = "c:\\imsi\\myid.txt";
		String pathname02 = "c:\\imsi\\text.txt";
		String pathname03 = "c:\\imsi\\result.txt";

		
		File fi01 = new File(pathname01);
		File fi02 = new File(pathname02);
		File fi03 = new File(pathname03);

		FileReader fr01 = null, fr02 = null;
		BufferedReader br01 = null, br02 = null;

		BufferedWriter bw = null;

		try {
			fr01 = new FileReader(fi01);
			fr02 = new FileReader(fi02);

			br01 = new BufferedReader(fr01);
			br02 = new BufferedReader(fr02);

			bw = new BufferedWriter(new FileWriter(fi03));

			String imsi = "";
			while ((imsi = br01.readLine()) != null) {
				bw.write(imsi);
				bw.newLine();

			}

			imsi = "";
			while ((imsi = br02.readLine()) != null) {
				bw.write(imsi);
				bw.newLine();

			}

			System.out.println("작업 완료");

		} catch (IOException e) {
			System.out.println("데이터 입출력 예외 발생!");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("나머지 예외 발생!");
			e.printStackTrace();
		} finally {
			try {
				if (bw != null || br01 != null || br02 != null) {
					bw.close();
					br01.close();
					br02.close();
				}

				if (fr01 != null || fr02 != null) {
					fr01.close();
					fr02.close();
				}

			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
