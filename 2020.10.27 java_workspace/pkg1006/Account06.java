package pkg1006;

public class Account06 {

	private String name; // 1번 null
	private int age;// 0

//	public void setName(String name) {//2번
//		name = name;//name 두개 다 지역변수 
//	}

	public void setName(String name) {
		this.name = name;
	}
	//① name = ② name 이라고 하면 
	//① 가장 가까운 지역내에서 변수를 찾음 → 지역내에서 사용한다고 인식/ 지역변수
	//값이 변한게 없음 따라서 , 0
	
	//① this.name = ②name 이라고 하면 
	//this는 우리 클래스 안에서 자기자신을 지칭하는 인스턴스 변수를 찾아감
	
	

	public void setAge(int age) {
		this.age = age;
	}

	private void hello(String msg) {//현재 이 클래스에서만 사용
		System.out.println(msg);
	}

	void Display() {
		System.out.println("이름 : " + this.name);
		System.out.println("나이 : " + this.age);
		this.hello("야호");//나 자신과 동급인 hello를 불러와라
		hello("야호");//this라는 키워드가 이미 만들어져있기 때문에
					// 암시적으로 this 를 지칭함
	}
}
