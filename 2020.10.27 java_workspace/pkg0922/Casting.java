package pkg0922;

public class Casting {

	public static void main(String[] args) {
		// �Ͻ��� ĳ����
		double d = 100;
		System.out.println("d : " + d);

		// ����� ĳ����
		int i = (int) 3.14;
		System.out.println("i : " + i);

		System.out.println(14 / 5); // int / int = int
		// (double)14/5--->����� ĳ���� 14.0 / 5 ---> �Ǽ��� ������ ������ ���� .���� ,�Ͻ��� ĳ���� 14.0 / 5.0
		System.out.println((double) 14 / 5);
		// (double)(14/5) ---> (double)(2) --> 2.0
		System.out.println((double) (14 / 5));

		int kor = 50, eng = 60, math = 80;
		int total = 0;
		double average = 0.0;

		total = kor + eng + math;
		// average = total / 3 ; // �Ͻ��� ����ȯ 63 --> 63.0
		average = (double) total / 3; // ����� ����ȯ

		System.out.println("���� : " + total);
		System.out.println("��� : " + average);
		
		//���ڿ� ����ȯ 
		char ch1 = 'c' ;
		char ch2 = 'a' ;
		
		boolean bool = ch1 > ch2 ; 
		System.out.println(bool);
		
		int result = ch1 - ch2 + 3 ; 
		System.out.println(result);
		
		char ch3 = 'c';
		// ���� �����ڸ� ����Ͽ� ch3�� �빮�� ���� �ҹ��� ���� �Ǵ��ϴ� ���α׷� 
		
		String str = ch3 >= 'a' && ch3 <= 'z'? "�ҹ���" : "�빮��" ; // ���� �̹� result ������ �������־��⿡ ������ �����̸��� ����ϸ� ���� 
		System.out.println(str);
		
		
		
	}

}
