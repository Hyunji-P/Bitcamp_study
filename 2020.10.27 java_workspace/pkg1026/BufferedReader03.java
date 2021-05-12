package pkg1026;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReader03 {

	public static void main(String[] args) {
		BufferedReader br = null;

		try {
			//br 객체 Stream open
			// 1. System.in → InputStreamReader 매개변수로 들어감
			// 2. new InputStreamReader(System.in) → BufferedReader 매개변수로 들어감
			br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("정수 한개를 입력하세요");
			int first = Integer.parseInt(br.readLine());

			System.out.println("정수 한개를 입력하세요");
			int second = Integer.parseInt(br.readLine());

			int result = Math.max(first, second);

			System.out.println("입력하신 숫자 중 큰 수는 \'" + result + "\' 입니다.");
		} catch (IOException e) {
			System.out.println("데이터 입출력에 문제가 발생했습니다.");
			e.printStackTrace();
		} catch (NumberFormatException e) {
			System.out.println("잘못된 숫자 형식 입니다.");
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null) {
					br.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}

		}

	}

}
