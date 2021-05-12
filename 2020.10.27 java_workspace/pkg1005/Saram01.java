package pkg1005;
//사람의 정보를 나타내기 위하여 필요한 정보를 나열해 보도록 합니다.

//이름/키/몸무게/취미/혈액형 등이 존재합니다.
//이러한 정보들을 클래스를 이용하여 출력하는 프로그램을 작성하시오.
//
//철수와 영희 두 사람이 존재한다고 가정합니다.
//
//Saram01.java
//SaramMain01.java
//
//
//철수에 대한 정보
//국적(nationality) : 대한 민국
//이름(name) : 김철수
//키(height) : 172.5
//몸무게(weight) : 72.5
//취미(hobby) : 당구
//혈액형(blood) : AB

public class Saram01 {
	String nationality;
	String name;
	double height;
	double weight;
	String hobby;
	String blood;

	void show() {
		System.out.println(name + "님에 대한 정보");
		System.out.println("국적  : " + nationality);
		System.out.println("이름  : " + name);
		System.out.println("키  : " + height);
		System.out.println("몸무게  : " + weight);
		System.out.println("취미  : " + hobby);
		System.out.println("혈액형  : " + blood);
	}

}
