package pkg1019;

public class MyDateMain {

	public static void main(String[] args) {
		MyDate date1 = new MyDate(2020,10,19);
		MyDate date2 = new MyDate(2020,10,19);

		
		if(date1.equals(date2)) {//승급
			System.out.println("동일함");
		}else {
			System.out.println("동일하지 않음");
		}
	}

}
