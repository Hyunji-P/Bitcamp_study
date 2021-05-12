package pkg1019;

public class MyDate {
	private int year;
	private int month;
	private int day;

	public MyDate(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	//date에서 만들어진 생성자의 매개변수 값이 동일한지 알아보기 위해 equals 오버라이딩
	@Override
	public boolean equals(Object obj) {//강등
		
		MyDate mydate = (MyDate) obj;
		
		boolean bool = this.year == mydate.year && this.month == mydate.month && this.day == mydate.day;

		return bool;
	}

}
