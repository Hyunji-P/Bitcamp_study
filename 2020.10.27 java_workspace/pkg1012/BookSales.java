package pkg1012;
//�Է� ���� 

//ǰ�� : �ڹ�
//���� : 2
//�ܰ� : 30000

//ǰ�� : JSP
//���� : 4
//�ܰ� : 20000

//������ : 15%

//��� ����
//�� �Ǹ� �Ǽ� : 6
//1��° ����
//�ڹ� : 51000.0��
//2��° ����
//JSP : 68000.0��

public class BookSales {

	public static void main(String[] args) {
		Sales[] mybook = new Sales[2]; // �迭 ����

		Book.discount = 0.15;

		for (int i = 0; i < mybook.length; i++) {
			mybook[i] = new Sales(); // ��ü ����
		}

		System.out.println("�� �Ǹ� �� �� : " + Book.count);

		for (int i = 0; i < mybook.length; i++) {
			mybook[i].Display();
		}

	}

}
