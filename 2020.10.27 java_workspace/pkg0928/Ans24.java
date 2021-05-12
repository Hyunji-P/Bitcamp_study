package pkg0928;

import java.util.Scanner;

public class Ans24 {

	public static void main(String[] args) {
		// 배열의 크기와 크기 만큼의 데이터를 입력 받아서
		// 총점과 평균을 출력하기
		//
		// 크기 입력 : 3
		// 1번째 값 입력 : 30.45
		// 2번째 값 입력 : 90.44
		// 3번째 값 입력 : 75.22

		// 출력 결과
		// 총점 : 200.21
		// 평균 : 66.74

		Scanner scan = new Scanner(System.in);

		System.out.println("크기 입력 : ");
		int size = scan.nextInt();// 3 입력

		// 배열 선언
		double[] score = new double[size];

		double total = 0.0; // 총점
		double average = 0.0; // 평균

		for (int i = 0; i < score.length; i++) {
			System.out.println((i + 1) + "번째 수 입력 : ");
			score[i] = scan.nextDouble(); // 실수 입력
			total += score[i]; // 반복을 계속 하면서 배열안에 있는 값의 총점을 구해야함 
			average = total / score.length; // score.length 는 배열 크기를 나타냄

		}
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + average);

	}

}
