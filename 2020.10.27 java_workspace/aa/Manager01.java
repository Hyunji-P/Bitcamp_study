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
	private static double total_sum; // 결측치를 제외한 모든 소득의 총합
	private static double missing; // 결측치 데이터 건수

	private List<Welfare> wels = null;

	public Manager01() {
		wels = new ArrayList<Welfare>();
		this.FillData();

		System.out.println("총 소득 합 :" + Manager01.total_sum);
		System.out.println("결측치 개수 :" + Manager01.missing);
		System.out.println("데이터 개수 :" + this.wels.size());

		this.FillNaN();

	}

	private void FillNaN() {
		// 소득 컬럼에 대한 결측치를 평균 값으로 대체해준다.
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
		// 해당 숫자에 맞는 성별만 조회하여 반환한다..
		// 리스트 자료구조를 정의한다..
		// 확장 for를 이용하여 , 해당 조건에 맞는 성별을 찾아 낸다.
		// 리스트 자료구조에 추가 한다..
		// 반환한다..

		// 남자는 남자끼리 , 여자는 여자끼리 담을 리스트 자료구조 정의
		List<Welfare> sublist = new ArrayList<Welfare>();

		for (Welfare wel : wels) {
			if (su == 1) { // 1번으로 들어오고
				if (wel.getGender().equals("남자")) {
					sublist.add(wel); // sublist 에 남자으로 해당하는 객체 모두 추가
				}
			} else { // 여자
				if (wel.getGender().equals("여자")) {
					sublist.add(wel);

				}

			}
		}

		return sublist;
	}

	public List<Welfare> SelectAll(int beginRow, int endRow) {
		// 특정 페이지에 대한 목록을 조회하여 반환한다.
		// 리스트 자료구조를 정의한다.
		// 일반 for문을 사용하여 beginRow - 1 부터 endRow -1 까지 추출한다
		// 자료구조는 0번째부터 시작함
		// 반환한다.
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
		// 해당 이름에 맞는 bean 객체를 반환한다.
		// bean 객체 생성 한다
		// 확장 for문을 사용하여
		// 해당 이름과 일치하는 행을 찾아서 , 빈객체에 대입한다.
		// 찾으면 break 구문으로 빠져 나간다.
		// 빈 객체를 반환한다.

		Welfare bean = null;

		for (Welfare wel : this.wels) {
			if (wel.getName().equals(name)) {
				// bean.getName() 에는 아직 null값임
				bean = wel;
				// wel이 참조하는걸 bean도 참조해라

			}
		}
		return bean;
	}

	public int Update(Welfare bean) {
		// 해당 데이터에 대하여 수정한다.
		// 기본키는 절대로 같을 수 없고 , 필수 사항인 컬럼을 말한다.
		// 키본키는 변경이 되면 안된다.

		// 확장 for문을 이용하여
		// 단수 객체 wel의 이름과 매개변수 bean객체의 이름과 같으면
		// 모든 컬럼들을 setter을 이용하여 치환하도록 한다.
		// 결과값 반환
		for (Welfare wel : this.wels) {
			if (wel.getName().equals(bean.getName())) {
				// 이름은 기본키여서 치환하면 안됨
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
		// 해당 컬렉션을 파일로 저장한다.

		// 본인이름 추가 , "김유신" 행 삭제 , "선덕여왕" 행 수정
		String pathname = "c:\\imsi\\복지데이터끝.csv";

		BufferedWriter bw = null;

		try {
			bw = new BufferedWriter(new FileWriter(new File(pathname)));

			for (Welfare wel : wels) {
				bw.write(wel.toString());
				bw.newLine();
			}
			System.out.println("저장되었습니다.");
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
		String pathname = "c:\\imsi\\복지데이터Result.txt";

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

		// 숫자가 아닌 결측치가 있을 때 예외 발생
		try {
			wel.setIncome(Integer.parseInt(arr[6]));

			Manager01.total_sum += Double.parseDouble(arr[6]);

		} catch (NumberFormatException e) {
			wel.setIncome(0);
			Manager01.missing += 1.0;

		} catch (Exception e) {
			System.out.println("다른 예외 발생");
			e.printStackTrace();
		}
		this.wels.add(wel);

	}

	public Map<String, Integer> Religion() {
		// 종교 유무의 개수들을 반환해준다.
		// 확장 for문을 사용하여
		// 종교 컬럼을 key로 하여 맵객체를 만들어준다.

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
				mylist.add(wel.getIncome()); // 0번째에 들어감
				mylist.add(1); // 1번째에 들어감
				mymap.put(ageg, mylist);

			}

		}

		return mymap;
	}
}
