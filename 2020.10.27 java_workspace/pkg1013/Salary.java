package pkg1013;

//생성자 : 1개 , 매개변수 : 0개
public class Salary {
	private int salay = 3000;// 급여
	private String department;// 부서이름
	private String name; // 사원 이름

	public Salary() {
		//안전하게 하나 만들어둔다. 
		//why? 서브클래스의 모든 생성자는 super() 매개변수가 없는 생성자가 숨겨져 있음
		//자바는 다 상속이기 때문에 사용하던 안하던 습관적으로 작성해두는 게 좋을 듯
	}

	public Salary(String name, int salary, String department) {
		this.name = name;
		this.salay = salary;
		this.department = department;
	}

	public Salary(String name, String department) {
		this.name = name;
		this.department = department;
	}

	public void Display() {
		int bae = 0;
		if (this.department.equals("영업") || this.department.equals("판매")) {
			bae = 15;
		} else {
			bae = 12;
		}

		String imsi = this.name + "(" + this.department + ")";
		imsi += ", 급여 : " + this.salay;
		imsi += ", 연봉 : " + (bae * this.salay);
		System.out.println(imsi);

	}

}
