package pkg1026;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {

	public static void main(String[] args) {
		String pathname = "c:\\imsi\\abct.txt";
		File dest = new File(pathname);

		// 1.정의
		FileWriter fw = null;
		BufferedWriter bw = null;

		try {
			// 2. 객체 생성 (열기 개념)
			fw = new FileWriter(dest);
			bw = new BufferedWriter(fw);

			bw.write("강감찬,호호,10,abc");
			bw.newLine();// 엔터키
			bw.write("을지문덕,크크,20,def");
			bw.newLine();
			// 입력 후 imsi 폴더 확인

			for (int i = 1; i < 101; i++) {
				bw.write(String.valueOf(i * i));//매개변수가 String 이여서 값을 변환해줘야함 
				bw.newLine();//파일에 출력
			}

			System.out.println("작업 완료"); //모니터에 출력 
		} catch (IOException e) {
			System.out.println("입출력 예외 발생");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("기타 예외 발생");
			e.printStackTrace();
		} finally {
			try {
				// 닫는 개념
				if (bw != null) {
					bw.close();
				}

				if (fw != null) {
					fw.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}

}
