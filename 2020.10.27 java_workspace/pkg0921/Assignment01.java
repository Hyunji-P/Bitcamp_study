package pkg0921;

public class Assignment01 {

	public static void main(String[] args) {
		int x = 5; // x�� 5��� ���ڸ� �����Ѷ�.
					// = ��ȣ�� ���� �Ҵ� / �����ϴ� �����̴�.
					// = ��ȣ�� ����(assignment)�����ڶ�� �Ѵ�.

		// x = x + 3; ���� x�� ���� 3�� ���Ͻÿ�. (����)
		x += 3;
		System.out.println("x : " + x);

		x *= 4;
		System.out.println("x : " + x);

		x %= 5;
		System.out.println("x : " + x);

		x -= 1;
		System.out.println("x : " + x);

		x += 7;
		System.out.println("x : " + x);

		// ����) ���� ���� �����ڸ� �̿��Ͽ� 1���� 10������ ������ 55�� total ������ �����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		int total = 0;

		for (int i = 1; i <= 10; i++) {
			total += i;
		} 
		
		/*total +=1;
		  total +=2;
		  total +=3;
		  total +=4;
		  total +=5;
		  total +=6;
		  total +=7;
		  total +=8;
		  total +=9;
		  total +=10;*/
		
		System.out.println("total : " + total);
		

	}

}
