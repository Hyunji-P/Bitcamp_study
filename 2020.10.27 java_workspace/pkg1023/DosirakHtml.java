package pkg1023;

import java.text.DecimalFormat;
import java.util.List;

public class DosirakHtml {
	private List<Dosirak> lists;
	DecimalFormat df;

	public DosirakHtml() {
	}

	public DosirakHtml(List<Dosirak> lists) {
		String pattern = "###,###.00";
		df = new DecimalFormat(pattern);

		this.lists = lists;
	}

	public void Delivery() {
		System.out.println("[���ö� �ֹ� ����]");
		System.out.println("����/�����/���ö��̸�/�ܰ�/����1/����2/����3");
		System.out.println("----------------------------------------------------------");

		for (Dosirak dosirak : lists) {
			//�ٸ� ��� !! - toString() 
            //System.out.println(dosirak);
			//dosirak�� �»����� ���� Dosirak Ŭ������ ���⿡ toString() �޼ҵ尡 ���� ---> ǥ�����Ǹ� ���� Dosirak Ŭ������ �������̵����� �ڱ� ����� ������ �ٲ� 
			String imsi = dosirak.getSaram().getName() + "/";
			imsi += dosirak.getSaram().getAddress() + "/";
			imsi += dosirak.getDname() + "/";
			imsi += df.format(dosirak.getPrice()) + "/";

			//�迭�� ���� �ڷ����̿��� toString() �ϸ� ������ �ּҸ� ������ --> for�������� ��� 
			int cnt = 0; // ��� �ݺ� �ߴ��� Ƚ�� üũ
			for (String banchan : dosirak.getBanchan()) {
				cnt++;
				if (cnt == dosirak.getBanchan().length) {
					imsi += banchan;
				} else {
					imsi += banchan + "/";
				}

			}

			System.out.println(imsi);
			//��� �ٸ���� : 1��° substring , 2��° : �Ϲ� for
//			System.out.println(imsi.substring(0,imsi.length()-1));

		}

	}

}
