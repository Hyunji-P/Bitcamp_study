package execute;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;

import dao.MemberDao;

public class A08_Main1JoinGet3Way {

	public static void main(String[] args) {
		System.out.println("다중 조인하기");
		MemberDao dao = new MemberDao();
		String imsi = "이름\t과일명\t단가\t수량\t총판매액";
		System.out.println(imsi);

		// 테이블이 2개 이상 , 3개 이상이기때문에 키 , 값 형태인 map 으로 접근
		// 숫자, 문자가 섞여있기 때문에 Object 로 처리
		List<HashMap<String, Object>> maplists = dao.JoinGet3Way();

		for (HashMap<String, Object> map : maplists) {
			// 주의 사항으로 모든 컬럼이 대문자로 설정이 된다.
			String name = (String) map.get("NAME");
			String pname = (String) map.get("PNAME");

			// 숫자형은 Integer 클래스를 사용하는 것이 아닌 BigDecimal 클래스를 사용해야함
			BigDecimal price = (BigDecimal) map.get("PRICE");
			BigDecimal qty = (BigDecimal) map.get("QTY");
			BigDecimal amount = (BigDecimal) map.get("AMOUNT");

//			Integer price = (Integer)map.get("PRICE");
//			Integer qty = (Integer)map.get("QTY");
//			Integer amount = (Integer)map.get("AMOUNT");

			String temp = "";
			temp += name + "\t" + pname + "\t" + price + "\t" + qty + "\t" + amount + "\t";
			System.out.println(temp);
		}

	}

}
