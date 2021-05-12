package pkg1022;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Test_LottoTest {

	public static void main(String[] args) {
		Set<Object> lotto = new HashSet<Object>();
		Random rand = new Random();
		int secondsu = 0;

		while (lotto.size() < 7) {
			int su = rand.nextInt(45) + 1;

			// 2등 번호를 제거해야하는데 set 순서에 상관이 없게 바구니에 담기므로
			// 어떤 번호가 2등 번호 인지 알수가 없음
			// 따라서 , 그냥 마지막에 담기는 번호를 2등번호라고 선언
			if (lotto.size() == 6) {
				secondsu = su;
			}
			lotto.add(su);

		}
		lotto.remove(secondsu);
		// 정렬을 할수 있도록 toArray() 메소드 사용

		System.out.print("로또 번호 : ");
		Object[] obj = lotto.toArray();
		Arrays.sort(obj);

		// 참조 자료형 : 클래스 , 인터페이스 , 배열 --> toString() 하면 주소값이 나옴
		// 해결 방법 : for문으로 해서 1개씩 나오게 출력

		for (Object item : obj) {
			System.out.print(item + "  ");
		}
		System.out.println("/  2등 : " + secondsu);

	}

}
