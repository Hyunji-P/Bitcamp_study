package execute_test;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;

import dao.MemberDao;

public class B09_MainSQL {

	public static void main(String[] args) {
		System.out.println("동적 SQL 사용하기");

		MemberDao dao = new MemberDao();

		System.out.println("ID\t이름\t나이\t성멸\t구분");

		List<HashMap<String, Object>> maplists = dao.SelectSQL();

		for (HashMap<String, Object> map : maplists) {
			String id = (String) map.get("ID");
			String name = (String) map.get("NAME");
			BigDecimal age = (BigDecimal) map.get("AGE");
			String gender = (String) map.get("GENDER");
			String result = (String) map.get("RESULT");

			String imsi = "";
			imsi += id + "\t";
			imsi += name + "\t";
			imsi += age + "\t";
			imsi += gender + "\t";
			imsi += result + "\t";

			System.out.println(imsi);
		}

	}

}
