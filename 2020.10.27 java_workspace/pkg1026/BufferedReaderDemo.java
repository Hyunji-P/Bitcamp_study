package pkg1026;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class BufferedReaderDemo {

	public static void main(String[] args) {
		// 경로 구분자는 \\으로 표현한다.(/ 슬래시는 한개)
		String pathname = "c:\\imsi\\jumsu.txt";

		File source = null;
		FileReader fr = null;
		// 보조 클래스도 주로 사용함
		BufferedReader br = null;

		try {
			// Stream Open 개념이 아님
			source = new File(pathname);
			// exists() : 존재하는지를 나타내는 메소드
			System.out.println(source.exists());

			// FileReader의 매개변수 File 이고 source 객체가 File이니 값을 넣어준다.
			// new FileReader(source) 사용하려면 강제로 예외처리 해야함
			// Stream Open 개념 , fr과 br은 Stream 유형
			fr = new FileReader(source);
			br = new BufferedReader(fr);

			String imsi = "";
			while ((imsi = br.readLine()) != null) {
				System.out.println(imsi);
			}

			System.out.println("작업 완료");

		} catch (FileNotFoundException e) {
			System.out.println("파일이 존재하지 않습니다.");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("기타 예외 발생");
			e.printStackTrace();
		} finally {
			try {
				// fr은 가장먼저 생성되었지만 소멸은 가장 나중에 되어야함
				// 왜? br → fr을 참조하고 fr → source를 참조함
				// 그런데 , fr이 먼저 닫혀 버리면 참조를 아예 못하게 되어버려 NullPointerException 발생
				if (br != null) {
					br.close();
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
