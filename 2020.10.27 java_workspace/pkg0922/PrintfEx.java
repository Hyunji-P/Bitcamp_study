package pkg0922;

public class PrintfEx {
	// main �޼ҵ�� program start point
	// �����Ϸ��� �ݵ�� �����ؾ��Ѵ�!
	public static void main(String[] args) {
		
		//�ڸ��� ���� ������
		double d = 12.3456789;
		System.out.println("�Ǽ� 1 : " + d);
		System.out.printf("�Ǽ� 2 : [%6.2f]\n" , d);
		//[%6.2f] ��ü 6�ڸ� , �Ҽ��� 2�ڸ����� ǥ�� 
		//�ڸ��� Ȯ���Ҷ��� �Ҽ����� �����Ѵ�. 
		//printf : ������ �ڸ��� �ݿø� 
		
		System.out.printf("�Ǽ� 3 : [%.3f]\n" , d);
		//[%.3f] �Ҽ��� �Ʒ� 3�ڸ����� ǥ�� 
		
		System.out.printf("�Ǽ� 4 : [%f]\n" , d);
		
		//[   12.345678]
		System.out.printf("�Ǽ� 5 : [%11.6f]\n" , d);
		
		int i = 65;
		char ch = 'a';
		
		System.out.printf("���� : [%d] , ����  : [%c]\n" , i , ch);
		// i �� %d ���� , ch �� %c ���� 
		
		System.out.printf("���� : [%4d] , ����  : [%2c]\n" , i , ch);
		//[%4d] 4�ڸ� Ȯ�� �� ���� ���� 
		
		System.out.printf("���� : [%-4d] , ����  : [%-2c]\n" , i , ch);
		//[%-4d] 4�ڸ� Ȯ�� �� ���� ���� 
	
		
		//�� ��ȯ 
		System.out.printf("�Ǽ� 6 : [%f]\n" , (double)i); // i�� ���� , �����Ϸ��� �κ��� �Ǽ��̱⶧���� ���� ����ȯ 
		System.out.printf("���� : [%d]\n" , (int)d); // d�� �Ǽ� , �����Ϸ��� �κ��� �����̱⶧���� ���� ����ȯ 
		

	}
}
