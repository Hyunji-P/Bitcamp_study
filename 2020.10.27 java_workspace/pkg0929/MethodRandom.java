package pkg0929;
//a이상 b미만의 임의의 난수(랜덤 값) 생성하기 (단, a와 b는 정수) 

//random(하한값, 상한값) 메소드를 이용하여 5이상 9미만의 임의의 정수를 10개만 만들어 보세요.

public class MethodRandom {

	public static void main(String[] args) {
//		for (int i = 1; i < 101; i++) {
//			System.out.println(Math.random());
//		}

		int low = 5; // 하한값
		int high = 9; // 상한값
		for (int i = 0; i < 11; i++) {
			int imsi = random(low, high);
			System.out.println(imsi);
		}//for문을 random메소드 안으로 넣어도 되지만 반환타입은 void 여야함 
		 //why ? 메소드 자체 내에서 반복적으로 출력이 되어야하기 때문임 

	}

	static int random(int low, int high) {
		int result = (int) ((high - low) * Math.random() + low);
		return result;
	}

}
