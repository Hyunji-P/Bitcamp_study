package pkg1027;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;

public class JumsuStream {

	public static void main(String[] args) {
		String pathname01 = "c:\\imsi\\jumsu.txt";
		File source = new File(pathname01);

		String pathname02 = "c:\\imsi\\result.txt";
		File destination = new File(pathname02);

		FileReader fr = null;
		BufferedReader br = null;

		FileWriter fw = null;
		BufferedWriter bw = null;

		try {
			fr = new FileReader(source);
			br = new BufferedReader(fr); // 매개변수 : Reader(수퍼) ← fr : FileReader(서브) - 승급

			fw = new FileWriter(destination);
			bw = new BufferedWriter(fw); // 승급

			String imsi = "";
			while ((imsi = br.readLine()) != null) {
				String result = makeStr(imsi);
				bw.write(result);
				bw.newLine();
			}

			System.out.println("작업 완료");
		} catch (FileNotFoundException e) {
			System.out.println("파일이 존재하지 않습니다.");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("입출력 예외 발생");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("기타 나머지 예외 발생");
			e.printStackTrace();
		} finally {
			try {
				if (br != null) {
					br.close();
				}
				if (fr != null) {
					fr.close();
				}

				if (bw != null) {
					bw.close();
				}
				if (fw != null) {
					fw.close();
				}

			} catch (Exception e2) {
				System.out.println("마감 작업에서 문제가 발생하였습니다.");
				e2.printStackTrace();

			}
		}

	}

	private static String makeStr(String imsi) {
		String[] arr = imsi.split(",");
		String name = arr[0];
		double kor = Double.parseDouble(arr[1]);
		double eng = Double.parseDouble(arr[2]);
		double math = Double.parseDouble(arr[3]);
		double _total = kor + eng + math; // 중간단계의 변수 : _(언더바)
		double _average = _total / 3.0;

		String pattern = "###.00";
		DecimalFormat df = new DecimalFormat(pattern);

		String total = df.format(_total);
		String average = df.format(_average);

		String gender = arr[4].equalsIgnoreCase("M") ? "남자" : "여자";

		String result = name + "/" + gender + "/" + total + "/" + average;
		return result;
	}

}
