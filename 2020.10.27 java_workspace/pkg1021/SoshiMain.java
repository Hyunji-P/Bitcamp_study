package pkg1021;

public class SoshiMain {

	public static void main(String[] args) {
		String[] soshi = { "수영", "효연", "유리" };
		String name = "김철수";

		// false 이면 소시 멤버가 아니라고 가정
		boolean isMember = false; // flag 변수(맞는지 아닌지 판단하는 변수)

		try {
			for (int i = 0; i < soshi.length; i++) {
				if (soshi[i].equals(name)) {
					isMember = true;
					break; // 값을 찾으면 뒤에 배열은 비교할 필요 없음
				}
			}
			if (isMember == true) {
				System.out.println(name + "은 소녀시대 멤버가 맞아요.");
			} else {// 소시멤버가 아니면 사용자 정의 예외발생,throw 로 넘기려고 함
				String message = name + "은 소녀시대 멤버가 아니에요";

				// 1회용 객체를 만들어서 throw에 넘겨 준다
				throw new GirlsException(message);
				// new GirlsException(message) - 1번(객체를 안만들고 바로 생성자 호출)
				// throw new GirlsException(message) - 2번(물건 던지기)
				// catch절로 이동 - 3번(사건사고가 발생)
			}

		} catch (GirlsException ex) {
			System.out.println(ex.getMessage());
			System.out.println(ex.toString());
			System.out.println();
			ex.printStackTrace();//메소드 내부에서 toString() 호출

		}

	}

}
