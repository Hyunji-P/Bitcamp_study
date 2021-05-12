package pkg1022;

import java.util.HashSet;
import java.util.Set;

public class MySet {
	public static void main(String[] args) {
		// ex) 집합 --> 벤다이어그램에 중복된 숫자는 넣을 필요가 없음
		Set<Object> set = new HashSet<Object>();

		// 승급
		set.add("제시카");// String -> Object
		set.add(123);// int -> Integer -> Object(박싱)
		set.add(false);
		set.add("제시카");

		set.clear();// 전체 요소 제거

		// 순서가 없음
		set.add("제시카");
		set.add("티파니");
		set.add("수영");
		set.add("효연");

		// contains() : 데이터가 많을 때 찾음 , 컨테이너 박스에서 찾는 역할
		System.out.println(set.contains("써니"));
		System.out.println(set.contains("수영"));

		System.out.println(set.remove("티파니"));

		// 문제) "유리"가 있는지 확인하고 , 없으면 추가하세요.
		if (!set.contains("유리")) {// ! : not
			set.add("유리");
		}

		// set.toString() : 대괄호 , 콤마로 구분
		System.out.println(set);

		// 중복 허락 X
		System.out.println("요소 크기 : " + set.size());

		//컬렉션 Map 
		Set<Integer> aaa = new HashSet<Integer>();

		//이쪽에 숫자만 담는다고 하자 
		//< > 안에 코딩하는 기법을 제너릭(Generic) 기법이라고 함
		//특정 타입만 받으려고 바리게이트 치는 역할 
		//사전의 오류를 방지하기 위해 사용함
//		aaa.add("가나다");
		aaa.add(100);
//		aaa.add(12.35);
	}

}
