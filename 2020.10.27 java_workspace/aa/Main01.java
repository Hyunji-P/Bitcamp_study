package aa;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Scanner;
import java.util.Set;

public class Main01 {
	private static Manager01 mgr01 = new Manager01();

	public static void main(String[] args) {
		String pathname = "c:\\imsi\\menu.txt";
		Properties prop = null;
		String menu = null;

		try {
			prop = new Properties();
			prop.load(new FileReader(new File(pathname)));
			menu = prop.toString();

		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println(menu);
			int menusu = scan.nextInt();

			switch (menusu) {
			case 1:
				SelectAll01();
				break;

			case 2:
				SelectAll02();
				break;

			case 3:
				SelectAll03();
				break;

			case 4:
				Insert();
				break;

			case 5:
				SelectOne();
				break;

			case 6:
				Update();
				break;

			case 7:
				Delete();
				break;

			case 8: {
				FileSave();
				break;
			}
			case 9: {
				AgegGrouping();
				break;
			}
			case 10: {
				Religion();
				break;
			}

			case 0: {
				System.out.println("프로그램 종료");
				System.exit(0);// 빠져나가는 메소드
			}
			default:
				System.out.println("하하");
				break;
			}

		}

	}

	private static void SelectAll01() {
		List<Welfare> lists = mgr01.SelectAll();
		Display(lists);

	}

	private static void SelectAll02() {
		// 성별로 구별해서 읽기
		Scanner scan = new Scanner(System.in);
		System.out.println("검색 모드 : (1) 남자 , (2) 여자");
		int su = scan.nextInt();

		List<Welfare> lists = mgr01.SelectAll(su);
		Display(lists);

	}

	private static void SelectAll03() {
		// 페이징 처리를 하여 데이터를 추출 한다.
		Scanner scan = new Scanner(System.in);
		System.out.println("총 몇페이지 볼건가요?");
		int pageNumber = scan.nextInt();

		System.out.println("그러면 몇개씩 볼건가요?");
		int pageSize = scan.nextInt();

		int beginRow = (pageNumber - 1) * pageSize + 1;
		int endRow = pageNumber * pageSize;

		List<Welfare> lists = mgr01.SelectAll(beginRow, endRow);
		Display(lists);

	}

	private static void Insert() {
		// 데이터 1건을 추가한다.
		Scanner scan = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = scan.next();

		System.out.println("성별 : ");
		String gender = scan.next();

		Welfare wel = new Welfare(); // 빈클래스에 새로 만든 데이터를 넣어줘야함
		wel.setName(name);
		wel.setGender(gender);
		wel.setAge(25);
		wel.setAgeg("청년");
		wel.setArea("인천");
		wel.setIncome(40);
		wel.setJob("비트캠프 학생");
		wel.setMarriage("미혼");
		wel.setReligion("없음");

		int cnt = -1;
		cnt = mgr01.Insert(wel);

		if (cnt == 1) {
			System.out.println("추가 되었습니다.");
		} else {
			System.out.println("추가 실패 입니다.");
		}

	}

	private static void SelectOne() {
		// 특정 한명만 읽기
		Scanner scan = new Scanner(System.in);
		System.out.print("찾을 이름 : ");
		String name = scan.next();

		Welfare wel = mgr01.SelectOne(name);
		if (wel == null) {
			System.out.println("찾을 수 없습니다.");
		} else {
			Display(wel);// Welfare에서 wel객체에 대한 메소드
		}

	}

	private static void Display(Welfare wel) {
		// 1행에 대한 정보를 출력해 준다.

		String name = wel.getName();
		String gender = wel.getGender();
		int age = wel.getAge();
		String ageg = wel.getAgeg();
		String marriage = wel.getMarriage();
		String religion = wel.getReligion();
		double income = wel.getIncome();
		String job = wel.getJob();
		String area = wel.getArea();

		String imsi = name + "\t";
		imsi += gender + "\t";
		imsi += age + "\t";
		imsi += ageg + "\t";
		imsi += marriage + "\t";
		imsi += religion + "\t";
		imsi += income + "\t";
		imsi += job + "\t";
		imsi += area + "\t";

		System.out.println(imsi);

	}

	private static void Update() {
		// 1건에 대해 수정한다.

		Scanner scan = new Scanner(System.in);
		System.out.print("수정할 이름 : ");
		String name = scan.next();

		System.out.print("수정할 성별 : ");
		String gender = scan.next();

		Welfare wel = new Welfare();
		wel.setName(name);
		wel.setGender(gender);
		wel.setAge(100);
		wel.setAgeg("청년");
		wel.setArea("경기도");
		wel.setIncome(1000);
		wel.setJob("학생");
		wel.setMarriage("미혼");
		wel.setReligion("없음");

		int cnt = -1;
		cnt = mgr01.Update(wel);

		if (cnt == 1) {
			System.out.println("수정 성공");
		} else {
			System.out.println("수정 실패");

		}

	}

	private static void Delete() {
		// 1건에 대해서 삭제한다.
		Scanner scan = new Scanner(System.in);
		System.out.print("삭제 할 이름 입력 : ");
		String name = scan.next();

		int cnt = mgr01.Delete(name);

		if (cnt == 1) {
			System.out.println("삭제 성공");
		} else {
			System.out.println("삭제 실패");
		}

	}

	private static void FileSave() {
		// 해당 컬렉션을 파일로 저장한다.
		mgr01.FileSave();

	}

	private static void AgegGrouping() {
		// 연령대별로 소득의 총합과 갯수를 반환해준다
		Map<String, List<Object>> maps = mgr01.AgegGrouping();
		
		Set<String> keyset = maps.keySet();
		for (String key : keyset) {
			List<Object> value = maps.get(key);
			String imsi = key + " : " + value.get(0) + "/" + value.get(1);
			System.out.println(imsi);
		}

	}

	private static void Religion() {
		// 종교 유무의 개수들을 반환해준다.
		
		Map<String, Integer> maps = mgr01.Religion();
		
		Set<String> keyset = maps.keySet();
		for(String key : keyset) {
			Integer value = maps.get(key);
			String imsi = key + " : " + value;
			System.out.println(imsi);
		}
		
		

	}

	// 보여주기
	private static void Display(List<Welfare> lists) {// List<Welfare> lists 컬렉션에서 보여주는 메소드
		for (Welfare wel : lists) {
			String name = wel.getName();
			String gender = wel.getGender();
			int age = wel.getAge();
			String ageg = wel.getAgeg();
			String marriage = wel.getMarriage();
			String religion = wel.getReligion();
			double income = wel.getIncome();
			String job = wel.getJob();
			String area = wel.getArea();

			String imsi = name + "\t";
			imsi += gender + "\t";
			imsi += age + "\t";
			imsi += ageg + "\t";
			imsi += marriage + "\t";
			imsi += religion + "\t";
			imsi += income + "\t";
			imsi += job + "\t";
			imsi += area + "\t";
			System.out.println(imsi);
		}

	}

}
