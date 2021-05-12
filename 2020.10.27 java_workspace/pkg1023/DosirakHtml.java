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
		System.out.println("[도시락 주문 내역]");
		System.out.println("고객명/배송지/도시락이름/단가/반찬1/반찬2/반찬3");
		System.out.println("----------------------------------------------------------");

		for (Dosirak dosirak : lists) {
			//다른 방법 !! - toString() 
            //System.out.println(dosirak);
			//dosirak의 태생으로 가면 Dosirak 클래스고 여기에 toString() 메소드가 없음 ---> 표준정의를 위해 Dosirak 클래스에 오버라이딩으로 자기 맘대로 내용을 바꿈 
			String imsi = dosirak.getSaram().getName() + "/";
			imsi += dosirak.getSaram().getAddress() + "/";
			imsi += dosirak.getDname() + "/";
			imsi += df.format(dosirak.getPrice()) + "/";

			//배열은 참조 자료형이여서 toString() 하면 참조값 주소를 보여줌 --> for문장으로 출력 
			int cnt = 0; // 몇번 반복 했는지 횟수 체크
			for (String banchan : dosirak.getBanchan()) {
				cnt++;
				if (cnt == dosirak.getBanchan().length) {
					imsi += banchan;
				} else {
					imsi += banchan + "/";
				}

			}

			System.out.println(imsi);
			//출력 다른방법 : 1번째 substring , 2번째 : 일반 for
//			System.out.println(imsi.substring(0,imsi.length()-1));

		}

	}

}
