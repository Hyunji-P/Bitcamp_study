package pkg0929;
//총합 구하기 

//1부터 10까지의 총합을 구하여 출력하는 메소드 sum 작성
//단 , 값을 반환하지 않고 메소드 내부에서 출력하도록 한다.

//hap 메소드 : sum  메소드와 동일한 역할을 수행하고 반환해주는 메소드 

public class MethodSum {

	public static void main(String[] args) {
		int su = 10;
		int result = hap(su);//반환타입이 있기 때문에 대입이 필요함
		System.out.println("결과 01 : " + result);
		sum(su);//반환타입이 없기 때문에 왼쪽에 대입할 필요 없음 
		//System.out.println("결과 01 : " + sum(su)); - 반환 타입이 없기때문에 오류가 남
		//										     - 대입할 값이 없고 무엇을 출력해야되는지 모름

	}
    //반환타입 없음 - void 이기 때문에 return값이 없음
	static void sum(int x) {
		int result = 0;
		for (int i = 1; i <= x; i++) {
			result += i;

		}
		System.out.println("결과 02 : " + result);//return 값이 없기 때문에 자체 내에서 출력
	}
    //반환타입 존재
	static int hap(int x) {
		int result = 0;
		for (int i = 1; i <= x; i++) {
			result += i;

		}
		return result;
	}

}
