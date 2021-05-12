package pkg0928;

public class Array05 {

	public static void main(String[] args) {
		// *알고리즘*
		// 요소가 5개인 배열에서 값이 가장 큰 값을 구하세요.
		// 0번째 요소를 최대라고 가정한다.
		// 반복문을 사용하여 현재 최대값과 i번째 요소들의 값을 비교한다.
		// i번째 요소의 값이 최대 값보다 크면 최대 값을 바꿉니다.

		double[] arr = { 0.5, 0.3, 0.2, 0.8, 0.4 }; // 문자열일때는 ""

		double max = arr[0];
		double min = arr[0];

		for (int i = 1; i < arr.length; i++) { // 0번째가 최대값으로 지정했기때문에 1번째부터 비교한다.
			if (max < arr[i]) {
				max = arr[i];
			} else if(min > arr[i]){
				min = arr[i];
			}

		}
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);

	}

}
