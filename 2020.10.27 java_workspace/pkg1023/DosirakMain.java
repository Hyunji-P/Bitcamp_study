package pkg1023;

import java.util.ArrayList;
import java.util.List;

public class DosirakMain {

	public static void main(String[] args) {
		Saram soo = new Saram("김철수", "마포 공덕동");

		String[] banchan1 = new String[] { "고급 어묵", "김치", "단호박 샐러드" };
		//생성자 호출 
		Dosirak dosirak1 = new Dosirak(soo, "매화도시락", 10000, banchan1);

		List<Dosirak> lists = new ArrayList<Dosirak>();
		lists.add(dosirak1);
		
		
		lists.add(new Dosirak(
				new Saram("박영희","용산 도원동"),
				"진달래도시락",
				7000,
				new String[] {"계란 후리이","김","마른 멸치"}));
		
		DosirakHtml html = new DosirakHtml(lists);
		html.Delivery();

	}

}
