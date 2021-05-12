package execute_test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import bean.Member;
import dao.MemberDao;

public class B12_MainTrimIf1 {

	public static void main(String[] args) {
		System.out.println("동적 sql trim과 if구문 사용하기");

		Scanner scan = new Scanner(System.in);

		System.out.println("숫자 정수를 입력하세요.");
		System.out.println("모든 사원 조회(1)");
		System.out.println("남자들만 조회(2)");
		System.out.println("남자 중에서 나이가 40이상인 사람만 조회(3);");
		System.out.println("나이가 40이상인 사람만 조회(4)");

		int menu = scan.nextInt();

		Map<String, Object> map = new HashMap<String, Object>();
		String gender = "";
		int age = 0;

		if (menu == 1) {
			// 모든 데이터 조회 ==> 조건 없음

		} else if (menu == 2) {
			gender = "남자";

			map.put("gender", gender);

		} else if (menu == 3) {
			gender = "남자";
			age = 40;

			map.put("gender", gender);
			map.put("age", age);

		} else if(menu == 4){
			age = 40;

			map.put("age", age);

		}else {
			System.out.println("정수 1부터 4까지만 입력 가능합니다.");
			System.exit(0);
		}

		MemberDao dao = new MemberDao();

		List<Member> lists = dao.TrimIfCondition(map);

		System.out.println("ID\t이름\t나이\t성별");

		for (Member member : lists) {
			String imsi = "";
			imsi += member.getId() + "\t";
			imsi += member.getName() + "\t";
			imsi += member.getAge() + "\t";
			imsi += member.getGender() + "\t";

			System.out.println(imsi);
		}

	}

}
