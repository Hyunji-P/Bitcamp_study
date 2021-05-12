package pkg0925;

public class ArrayEx02 {
	// 배열
	public static void main(String[] args) {
		int[] arr = new int[5];

//		arr[0] = 5;
//		arr[1] = 4;
//		arr[2] = 3;
//		arr[3] = 2;
//		arr[4] = 1;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr.length - i; // 위에 식과 동일
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "]=" + arr[i]);
		}

		// arr2 : 2 4 6 8
		System.out.println("결과 : ");
		int[] arr2 = new int[4]; 

		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = 2*i + 2;// +=로 표기하면 오해할 수 있음 , 붙이지 말기 
							  // 배열 값이 0으로 다 셋팅되어 있어 누적 개념이 아님 
							  // total 같은 경우 값이 셋팅되지 않았기 때문에 누적개념이 됨 
			System.out.println("arr[" + i + "]=" + arr2[i]);

		}

	}

}
