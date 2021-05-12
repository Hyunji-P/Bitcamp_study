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
				System.out.println("���α׷� ����");
				System.exit(0);// ���������� �޼ҵ�
			}
			default:
				System.out.println("����");
				break;
			}

		}

	}

	private static void SelectAll01() {
		List<Welfare> lists = mgr01.SelectAll();
		Display(lists);

	}

	private static void SelectAll02() {
		// ������ �����ؼ� �б�
		Scanner scan = new Scanner(System.in);
		System.out.println("�˻� ��� : (1) ���� , (2) ����");
		int su = scan.nextInt();

		List<Welfare> lists = mgr01.SelectAll(su);
		Display(lists);

	}

	private static void SelectAll03() {
		// ����¡ ó���� �Ͽ� �����͸� ���� �Ѵ�.
		Scanner scan = new Scanner(System.in);
		System.out.println("�� �������� ���ǰ���?");
		int pageNumber = scan.nextInt();

		System.out.println("�׷��� ��� ���ǰ���?");
		int pageSize = scan.nextInt();

		int beginRow = (pageNumber - 1) * pageSize + 1;
		int endRow = pageNumber * pageSize;

		List<Welfare> lists = mgr01.SelectAll(beginRow, endRow);
		Display(lists);

	}

	private static void Insert() {
		// ������ 1���� �߰��Ѵ�.
		Scanner scan = new Scanner(System.in);
		System.out.print("�̸� : ");
		String name = scan.next();

		System.out.println("���� : ");
		String gender = scan.next();

		Welfare wel = new Welfare(); // ��Ŭ������ ���� ���� �����͸� �־������
		wel.setName(name);
		wel.setGender(gender);
		wel.setAge(25);
		wel.setAgeg("û��");
		wel.setArea("��õ");
		wel.setIncome(40);
		wel.setJob("��Ʈķ�� �л�");
		wel.setMarriage("��ȥ");
		wel.setReligion("����");

		int cnt = -1;
		cnt = mgr01.Insert(wel);

		if (cnt == 1) {
			System.out.println("�߰� �Ǿ����ϴ�.");
		} else {
			System.out.println("�߰� ���� �Դϴ�.");
		}

	}

	private static void SelectOne() {
		// Ư�� �Ѹ� �б�
		Scanner scan = new Scanner(System.in);
		System.out.print("ã�� �̸� : ");
		String name = scan.next();

		Welfare wel = mgr01.SelectOne(name);
		if (wel == null) {
			System.out.println("ã�� �� �����ϴ�.");
		} else {
			Display(wel);// Welfare���� wel��ü�� ���� �޼ҵ�
		}

	}

	private static void Display(Welfare wel) {
		// 1�࿡ ���� ������ ����� �ش�.

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
		// 1�ǿ� ���� �����Ѵ�.

		Scanner scan = new Scanner(System.in);
		System.out.print("������ �̸� : ");
		String name = scan.next();

		System.out.print("������ ���� : ");
		String gender = scan.next();

		Welfare wel = new Welfare();
		wel.setName(name);
		wel.setGender(gender);
		wel.setAge(100);
		wel.setAgeg("û��");
		wel.setArea("��⵵");
		wel.setIncome(1000);
		wel.setJob("�л�");
		wel.setMarriage("��ȥ");
		wel.setReligion("����");

		int cnt = -1;
		cnt = mgr01.Update(wel);

		if (cnt == 1) {
			System.out.println("���� ����");
		} else {
			System.out.println("���� ����");

		}

	}

	private static void Delete() {
		// 1�ǿ� ���ؼ� �����Ѵ�.
		Scanner scan = new Scanner(System.in);
		System.out.print("���� �� �̸� �Է� : ");
		String name = scan.next();

		int cnt = mgr01.Delete(name);

		if (cnt == 1) {
			System.out.println("���� ����");
		} else {
			System.out.println("���� ����");
		}

	}

	private static void FileSave() {
		// �ش� �÷����� ���Ϸ� �����Ѵ�.
		mgr01.FileSave();

	}

	private static void AgegGrouping() {
		// ���ɴ뺰�� �ҵ��� ���հ� ������ ��ȯ���ش�
		Map<String, List<Object>> maps = mgr01.AgegGrouping();
		
		Set<String> keyset = maps.keySet();
		for (String key : keyset) {
			List<Object> value = maps.get(key);
			String imsi = key + " : " + value.get(0) + "/" + value.get(1);
			System.out.println(imsi);
		}

	}

	private static void Religion() {
		// ���� ������ �������� ��ȯ���ش�.
		
		Map<String, Integer> maps = mgr01.Religion();
		
		Set<String> keyset = maps.keySet();
		for(String key : keyset) {
			Integer value = maps.get(key);
			String imsi = key + " : " + value;
			System.out.println(imsi);
		}
		
		

	}

	// �����ֱ�
	private static void Display(List<Welfare> lists) {// List<Welfare> lists �÷��ǿ��� �����ִ� �޼ҵ�
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
