package pkg1019;

public class MathEx {

	public static void main(String[] args) {
		double d1 = -12.3456;
		double d2 = 34.56;

		System.out.println("���밪 : " + Math.abs(d1));

		double result = Math.abs(-11.22);
		System.out.println(result);

		System.out.println("���� : " + Math.PI);
		System.out.println("���Ϸ� ��� : " + Math.E);

		// cb : ť��(��ü)
		System.out.println("2�� 3�±� : " + Math.cbrt(8));
		System.out.println("�ø� : " + Math.ceil(d1));
		System.out.println("���� : " + Math.floor(d1));
		System.out.println("ū�� : " + Math.max(12, 15));
		System.out.println("������ : " + Math.min(10, 20));
		System.out.println("2�� 10�� : " + Math.pow(2, 10));

		System.out.println("���� : " + Math.random());
		System.out.println("�ݿø� : " + Math.round(12.59));
		System.out.println("��ȣ �� : " + Math.signum(-12.3));
		System.out.println("��Ʈ : " + Math.sqrt(16));

		// ����) �ﰢ�� �κ��� ���� 3 , 4 ��� �� �� ���� �亯�� ����? 5.0
		// ���� �� ���� 13.0�̰� , ª�� ���� 5.0�̶�� �Ҷ� ������ ���� ����?
		result = 0.0;
		result = Math.sqrt(Math.pow(3, 2.0) + Math.pow(4, 2.0));

		System.out.println("���� �� ���� ���� : " + result);
		
		result = 0.0;
		//���۷��� ����Ʈ ���� Math.Ŭ���� �� pow �޼ҵ� �����̶� ���� �� �� !! 
		result = Math.sqrt(Math.pow(13.0, 2.0) - Math.pow(5.0, 2.0));
		
		System.out.println("������ ���� ���� : " + result);

		

	}

}