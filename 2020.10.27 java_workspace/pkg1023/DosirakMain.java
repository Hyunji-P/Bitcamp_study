package pkg1023;

import java.util.ArrayList;
import java.util.List;

public class DosirakMain {

	public static void main(String[] args) {
		Saram soo = new Saram("��ö��", "���� ������");

		String[] banchan1 = new String[] { "��� �", "��ġ", "��ȣ�� ������" };
		//������ ȣ�� 
		Dosirak dosirak1 = new Dosirak(soo, "��ȭ���ö�", 10000, banchan1);

		List<Dosirak> lists = new ArrayList<Dosirak>();
		lists.add(dosirak1);
		
		
		lists.add(new Dosirak(
				new Saram("�ڿ���","��� ������"),
				"���޷����ö�",
				7000,
				new String[] {"��� �ĸ���","��","���� ��ġ"}));
		
		DosirakHtml html = new DosirakHtml(lists);
		html.Delivery();

	}

}
