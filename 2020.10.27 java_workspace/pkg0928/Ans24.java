package pkg0928;

import java.util.Scanner;

public class Ans24 {

	public static void main(String[] args) {
		// �迭�� ũ��� ũ�� ��ŭ�� �����͸� �Է� �޾Ƽ�
		// ������ ����� ����ϱ�
		//
		// ũ�� �Է� : 3
		// 1��° �� �Է� : 30.45
		// 2��° �� �Է� : 90.44
		// 3��° �� �Է� : 75.22

		// ��� ���
		// ���� : 200.21
		// ��� : 66.74

		Scanner scan = new Scanner(System.in);

		System.out.println("ũ�� �Է� : ");
		int size = scan.nextInt();// 3 �Է�

		// �迭 ����
		double[] score = new double[size];

		double total = 0.0; // ����
		double average = 0.0; // ���

		for (int i = 0; i < score.length; i++) {
			System.out.println((i + 1) + "��° �� �Է� : ");
			score[i] = scan.nextDouble(); // �Ǽ� �Է�
			total += score[i]; // �ݺ��� ��� �ϸ鼭 �迭�ȿ� �ִ� ���� ������ ���ؾ��� 
			average = total / score.length; // score.length �� �迭 ũ�⸦ ��Ÿ��

		}
		System.out.println("���� : " + total);
		System.out.println("��� : " + average);

	}

}
