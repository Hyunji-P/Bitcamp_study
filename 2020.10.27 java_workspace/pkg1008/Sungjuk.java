package pkg1008;

import java.util.Scanner;

public class Sungjuk {

	private int finalexam;
	private int midexam;
	private int reportexam;
	private int attendance;
	private double sungjuk;
	private String hakjum;
	private String comment;

	Scanner scan;

	public Sungjuk() {// 호출 순서 적어주기
		this.scan = new Scanner(System.in);
		this.InputDate();
		this.calcSungjuk();
		this.Hak();
		this.getHakjum();
	}

	public Sungjuk(int finalexam, int midexam, int reportexam, int attendance) {
		this.finalexam = finalexam;
		this.midexam = midexam;
		this.reportexam = reportexam;
		this.attendance = attendance;
		this.calcSungjuk();
		this.Hak();
		this.getHakjum();
	}

	public void InputDate() {// Scanner 데이터 입력 메소드

		System.out.print("기말 고사 점수: ");
		this.finalexam = scan.nextInt();

		System.out.print("중간 고사 점수: ");
		this.midexam = scan.nextInt();

		System.out.print("리포트 점수: ");
		this.reportexam = scan.nextInt();

		System.out.print("출석 점수: ");
		this.attendance = scan.nextInt();

		this.calcSungjuk();

	}

	private double calcSungjuk() {// 성적 구하는 메소드
		this.sungjuk = 0.3 * (this.finalexam + this.midexam) + 0.2 * (this.reportexam + this.attendance);

		return this.sungjuk;
	}

	private String Hak() {// 학점 구하는 메소드
		if (this.sungjuk >= 90) {
			this.hakjum = "A";

		} else if (this.sungjuk >= 80) {
			this.hakjum = "B";

		} else if (this.sungjuk >= 70) {
			this.hakjum = "C";

		} else if (this.sungjuk >= 60) {
			this.hakjum = "D";

		} else {
			this.hakjum = "F";
		}

		return this.hakjum;

	}

	private String getHakjum() {// 학점 코멘트 메소드

		if (this.hakjum == "A" || this.hakjum == "B") {
			this.comment = "excellent";
		} else if (this.hakjum == "C" || this.hakjum == "D") {
			this.comment = "good";
		} else if (this.hakjum == "F") {
			this.comment = "poor";
		}

		return this.comment;

	}

	public void Display() { // 출력 메소드
		System.out.println("============================");
		System.out.printf("성적=%.2f\n", this.calcSungjuk());
		System.out.println("학점=" + this.Hak());
		System.out.println("평가=" + this.getHakjum());
		System.out.println();
	}

}
