package pkg1026;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class BufferedReader02 {

	public static void main(String[] args) {
		InputStream in = null; // 1. 키보드로 무언가를 넣으면 바이트로 바뀜

		// 브릿지 스트림 : 문자열을 바이트로 또는 바이트를 문자열로 변환해주는 스트림
		// InputStreamReader : 2. 바이트 → 문자열
		InputStreamReader isr = null;
		// BufferedReader : 3. Reader 클래스의 효율성을 높이기 위하여 지원해주는 보조 스트림
		BufferedReader br = null;

		try {
			// Stream open
			in = System.in;
			// in → 키보드 참조
			isr = new InputStreamReader(in);
			// isr → in참조
			br = new BufferedReader(isr);
			// br → isr 참조
			System.out.print("밑변 입력 : ");
			double width = Double.parseDouble(br.readLine()); // readLine() : 한줄을 단위로 읽어 들인다.

			System.out.print("높이 입력 : ");
			double height = Double.parseDouble(br.readLine()); // readLine() : 한줄을 단위로 읽어 들인다.

			double area = width * height / 2.0;
			System.out.println("면적 : " + area);

			System.out.println("작업 완료");

		} catch (IOException e) { // 파일을 읽거나 쓸때 예외 발생 , readLine() 하면 throws 하기때문에 반드시 작성해줘야함 
			System.out.println("데이터 입출력에 문제가 있습니다.");
			e.printStackTrace();
		} catch (NumberFormatException e) {
			System.out.println("잘못된 숫자 형식입니다.");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("기타 예외 발생");
			e.printStackTrace();

		} finally {
			// Stream close ← not null(의미가 있는 데이터)
			try {
				if (br != null) {
					br.close();
				}

				if (isr != null) {
					isr.close();
				}

			} catch (Exception e2) {
				// TODO: handle exception
			}

		}
	}

}
