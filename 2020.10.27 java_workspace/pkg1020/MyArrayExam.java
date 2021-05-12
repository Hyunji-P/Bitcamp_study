package pkg1020;

import java.util.Arrays;
import java.util.List;

public class MyArrayExam {

	public static void main(String[] args) {
		String[] arr1 = new String[3];

		Arrays.fill(arr1, "제시카");
		Arrays.fill(arr1, 1, 3, "티파니");

		// 2번째 요소만 "써니"로 채우기.
		Arrays.fill(arr1, 2, 3, "써니");
		printArray(arr1);

		String[] arr2 = { "제시카", "티파니", "써니" };
		String[] arr3 = { "제시카", "티파니", "써니", "효연" };

		System.out.println(Arrays.equals(arr1, arr2));

		boolean bool = Arrays.equals(arr1, arr3);
		System.out.println(bool);

		int idx = Arrays.binarySearch(arr3, "효연");
		System.out.println("효연의 인덱스 : " + idx);

		// 컬렉션 , as : ~로 , arr를 list 로 바꾸겠다
		String[] arr4 = { "김유신", "이순신", "강감찬" };
		List<String> lists = Arrays.asList(arr4);
		System.out.println(lists);

		String[] arr5 = { "김유신", "이순신", "강감찬", "안중근", "윤봉길" };
		System.out.println("배열을 복사하여 새배열 만들기");
		for (int i = 1; i <= 10; i++) {
			// copyOf() : 배열 복사하여 새배열 만들기
			// 배열 요소 개수 초과로 for문을 생성하면 그 다음은 null로 나옴
			String[] arr6 = Arrays.copyOf(arr5, i);
			printArray(arr6);
		}
		System.out.println();
		//copyOfRange(배열 , from , to) : from 에서 to까지 추출 
		String[] arr7 = Arrays.copyOfRange(arr5, 1, 4);
		printArray(arr7);
		
		//오름차순 정렬 
		Arrays.sort(arr5);
		printArray(arr5);
		
		String [] arr8 = {"나","가","아","다","라"};
		Arrays.sort(arr8,1,4); //1부터 3까지만 정렬해라
		printArray(arr8);
		
		//toString() : [,] 
		System.out.println(Arrays.toString(arr5));

	}

	private static void printArray(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println();
	}

}
