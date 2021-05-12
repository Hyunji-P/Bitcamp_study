package aa;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Manager01 {
	private static double total_sum; // ����ġ�� ������ ��� �ҵ��� ����
	private static double missing; // ����ġ ������ �Ǽ�

	private List<Welfare> wels = null;

	public Manager01() {
		wels = new ArrayList<Welfare>();
		this.FillData();

		System.out.println("�� �ҵ� �� :" + Manager01.total_sum);
		System.out.println("����ġ ���� :" + Manager01.missing);
		System.out.println("������ ���� :" + this.wels.size());

		this.FillNaN();

	}

	private void FillNaN() {
		// �ҵ� �÷��� ���� ����ġ�� ��� ������ ��ü���ش�.
		double bunja = Manager01.total_sum;
		double bunmo = this.wels.size() - Manager01.missing;
		double average = bunja / bunmo;

		System.out.println(average);

		for (Welfare wel : wels) {
			if (wel.getIncome() == 0) {
				wel.setIncome(average);
			}
		}

	}

	public List<Welfare> SelectAll() {

		return wels;
	}

	public List<Welfare> SelectAll(int su) {
		// �ش� ���ڿ� �´� ������ ��ȸ�Ͽ� ��ȯ�Ѵ�..
		// ����Ʈ �ڷᱸ���� �����Ѵ�..
		// Ȯ�� for�� �̿��Ͽ� , �ش� ���ǿ� �´� ������ ã�� ����.
		// ����Ʈ �ڷᱸ���� �߰� �Ѵ�..
		// ��ȯ�Ѵ�..

		// ���ڴ� ���ڳ��� , ���ڴ� ���ڳ��� ���� ����Ʈ �ڷᱸ�� ����
		List<Welfare> sublist = new ArrayList<Welfare>();

		for (Welfare wel : wels) {
			if (su == 1) { // 1������ ������
				if (wel.getGender().equals("����")) {
					sublist.add(wel); // sublist �� �������� �ش��ϴ� ��ü ��� �߰�
				}
			} else { // ����
				if (wel.getGender().equals("����")) {
					sublist.add(wel);

				}

			}
		}

		return sublist;
	}

	public List<Welfare> SelectAll(int beginRow, int endRow) {
		// Ư�� �������� ���� ����� ��ȸ�Ͽ� ��ȯ�Ѵ�.
		// ����Ʈ �ڷᱸ���� �����Ѵ�.
		// �Ϲ� for���� ����Ͽ� beginRow - 1 ���� endRow -1 ���� �����Ѵ�
		// �ڷᱸ���� 0��°���� ������
		// ��ȯ�Ѵ�.
		List<Welfare> sublist = new ArrayList<Welfare>();

		for (int i = beginRow - 1; i < endRow; i++) {
			sublist.add(this.wels.get(i));
		}

		return sublist;
	}

	public int Insert(Welfare welfare) {
		boolean bool = this.wels.add(welfare);
		if (bool) {
			return 1;
		} else {
			return 0;
		}
	}

	public Welfare SelectOne(String name) {
		// �ش� �̸��� �´� bean ��ü�� ��ȯ�Ѵ�.
		// bean ��ü ���� �Ѵ�
		// Ȯ�� for���� ����Ͽ�
		// �ش� �̸��� ��ġ�ϴ� ���� ã�Ƽ� , ��ü�� �����Ѵ�.
		// ã���� break �������� ���� ������.
		// �� ��ü�� ��ȯ�Ѵ�.

		Welfare bean = null;

		for (Welfare wel : this.wels) {
			if (wel.getName().equals(name)) {
				// bean.getName() ���� ���� null����
				bean = wel;
				// wel�� �����ϴ°� bean�� �����ض�

			}
		}
		return bean;
	}

	public int Update(Welfare bean) {
		// �ش� �����Ϳ� ���Ͽ� �����Ѵ�.
		// �⺻Ű�� ����� ���� �� ���� , �ʼ� ������ �÷��� ���Ѵ�.
		// Ű��Ű�� ������ �Ǹ� �ȵȴ�.

		// Ȯ�� for���� �̿��Ͽ�
		// �ܼ� ��ü wel�� �̸��� �Ű����� bean��ü�� �̸��� ������
		// ��� �÷����� setter�� �̿��Ͽ� ġȯ�ϵ��� �Ѵ�.
		// ����� ��ȯ
		for (Welfare wel : this.wels) {
			if (wel.getName().equals(bean.getName())) {
				// �̸��� �⺻Ű���� ġȯ�ϸ� �ȵ�
				wel.setAge(bean.getAge());
				wel.setAgeg(bean.getAgeg());
				wel.setArea(bean.getArea());
				wel.setGender(bean.getGender());
				wel.setIncome(bean.getIncome());
				wel.setJob(bean.getJob());
				wel.setMarriage(bean.getMarriage());
				wel.setReligion(bean.getReligion());

			}
		}

		return 1;
	}

	public int Delete(String name) {

		for (Welfare wel : wels) {
			if (wel.getName().equals(name)) {
				wels.remove(wel);
				break;
			}
		}

		return 1;
	}

	public void FileSave() {
		// �ش� �÷����� ���Ϸ� �����Ѵ�.

		// �����̸� �߰� , "������" �� ���� , "��������" �� ����
		String pathname = "c:\\imsi\\���������ͳ�.csv";

		BufferedWriter bw = null;

		try {
			bw = new BufferedWriter(new FileWriter(new File(pathname)));

			for (Welfare wel : wels) {
				bw.write(wel.toString());
				bw.newLine();
			}
			System.out.println("����Ǿ����ϴ�.");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (bw != null) {
					bw.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}

	private void FillData() {
		BufferedReader br = null;
		String pathname = "c:\\imsi\\����������Result.txt";

		try {
			br = new BufferedReader(new FileReader(new File(pathname)));
			String imsi = "";
			while ((imsi = br.readLine()) != null) {
				this.Make(imsi);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null) {
					br.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}

	private void Make(String bean) {
		String check = "name,";
		if (bean.indexOf(check) == 0) {
			return;
		}

		String[] arr = bean.split(",");

		Welfare wel = new Welfare();
		wel.setName(arr[0]);
		wel.setGender(arr[1]);
		wel.setAge(Integer.parseInt(arr[2]));
		wel.setAgeg(arr[3]);
		wel.setMarriage(arr[4]);
		wel.setReligion(arr[5]);
		wel.setJob(arr[7]);
		wel.setArea(arr[8]);

		// ���ڰ� �ƴ� ����ġ�� ���� �� ���� �߻�
		try {
			wel.setIncome(Integer.parseInt(arr[6]));

			Manager01.total_sum += Double.parseDouble(arr[6]);

		} catch (NumberFormatException e) {
			wel.setIncome(0);
			Manager01.missing += 1.0;

		} catch (Exception e) {
			System.out.println("�ٸ� ���� �߻�");
			e.printStackTrace();
		}
		this.wels.add(wel);

	}

	public Map<String, Integer> Religion() {
		// ���� ������ �������� ��ȯ���ش�.
		// Ȯ�� for���� ����Ͽ�
		// ���� �÷��� key�� �Ͽ� �ʰ�ü�� ������ش�.

		Map<String, Integer> mymap = new HashMap<String, Integer>();

		for (Welfare wel : wels) {
			String religion = wel.getReligion();

			if (mymap.containsKey(religion)) {
				mymap.put(religion, mymap.get(religion) + 1);
			} else {
				mymap.put(religion, 1);

			}

		}
		return mymap;
	}

	public Map<String, List<Object>> AgegGrouping() {
		Map<String, List<Object>> mymap = new HashMap<String, List<Object>>();

		for (Welfare wel : wels) {
			String ageg = wel.getAgeg();

			if (mymap.containsKey(ageg)) {
				List<Object> mylist = mymap.get(ageg);
				
				mylist.set(0, (double)mylist.get(0) + wel.getIncome());
				mylist.set(1, (Integer)mylist.get(1) + 1);

			} else {
				List<Object> mylist = new ArrayList<Object>();
				mylist.add(wel.getIncome()); // 0��°�� ��
				mylist.add(1); // 1��°�� ��
				mymap.put(ageg, mylist);

			}

		}

		return mymap;
	}
}
