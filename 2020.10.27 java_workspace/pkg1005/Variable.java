package pkg1005;

public class Variable {
	static int x ; //static ���� 
	int y = 200;//�ν��Ͻ� ����
	final double pi = 3.14;// ���
	
	void hohoho(String msg) {
		//�Ű����� msg = ��������
		int z; //���� ���� 
		z = 300;//�⺻���� ���� ������ �ݵ�� �ʱ�ȭ �ʿ� 
		System.out.println(z);
		System.out.println(msg);
		
		//pi = 5.14; // ���� 
		System.out.println(5.14);
	}

}
