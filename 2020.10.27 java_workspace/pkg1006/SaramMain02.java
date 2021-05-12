package pkg1006;

public class SaramMain02 {

	public static void main(String[] args) {
		// getter , setter을 사용하여 프로그래밍

		Saram02 hee = new Saram02();

		hee.setName("영희");
		hee.setHeight(165.4);
		hee.setWeight(58.7);
		hee.setHobby("게임");
		hee.setBlood("O형");
		hee.setBool(false);

		showData(hee);
	}

	private static void showData(Saram02 human) {
		//다음 인물이 들어올 수 있기때문에 포괄적으로 human으로 적는게 나음
		//private은 동일 클래스 내부에서만 사용가능하기때문에  
		//이 클래스 안에서만 showData() 메소드를 수정할 수 있도록 private으로 걸어둠
		//외부 접근은 막는 용도임 
		
		// showData(hee); 메소드출력해보기
		System.out.println(human.getName() + "님의 정보");
		System.out.println("이름  : " + human.getName());
		System.out.println("키  : " + human.getHeight());
		System.out.println("몸무게  : " + human.getWeight());
		System.out.println("취미  : " + human.getHobby());
		System.out.println("혈액형  : " + human.getBlood());
		System.out.println("참, 거짓  : " + human.getBool());

	}

}
