package execute;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.HashMap;
import java.util.List;

import dao.MemberDao;

public class Main06_MultiJoin {

	public static void main(String[] args) {
		System.out.println("다중 조인 하기");

		MemberDao dao = new MemberDao();
		System.out.println("이름\t나이\t방이름\t예약시작날\t예약마지막날");
		List<HashMap<String, Object>> maplists = dao.SelectJoinData();

		for (HashMap<String, Object> map : maplists) {
			String name = (String) map.get("NAME");
			BigDecimal age = (BigDecimal) map.get("AGE");
			String bname = (String) map.get("BNAME");
			Timestamp startdate = (Timestamp) map.get("STARTDATE");
			Timestamp enddate = (Timestamp) map.get("ENDDATE");

			String result = "";
			result += name + "\t";
			result += age + "\t";
			result += bname + "\t";
			result += startdate + "\t";
			result += enddate + "\t";

			System.out.println(result);
		}

	}

}
