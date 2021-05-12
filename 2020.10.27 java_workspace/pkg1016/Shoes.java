package pkg1016;

public class Shoes {
	String name; // 이름
	int size; // 사이즈
	// int type; // 신발의 유형 (무한대)
	ShoesType ShoesType;// 신발의 유형 (제한성)
	ShoesTypeName shoesTypeName; // 한글 이름이 들어간 Enum 타입

	public Shoes(String name, int size, ShoesType shoesType) {
		super();
		this.name = name;
		this.size = size;
		ShoesType = shoesType;
	}

	public Shoes(String name, int size, ShoesTypeName shoesTypeName) {
		super();
		this.name = name;
		this.size = size;
		this.shoesTypeName = shoesTypeName;
	}

	public void Display() {
		System.out.println("신발 이름 : " + this.name);
		System.out.println("신발 크기 : " + this.size);
		// 만약 , 배열로서 숫자로 지정하면 숫자가 뭐에 해당하는지 찾기때문에 어려움
		System.out.println("신발 유형 : " + this.ShoesType);
	}

	public void Display2() {
		System.out.println("신발 이름 : " + this.name);
		System.out.println("신발 크기 : " + this.size);
		System.out.println("신발 유형 : " + this.shoesTypeName);
		//getter 로 가져와야 정한 한글이름이 나옴
		System.out.println("신발 종류 : " + this.shoesTypeName.getName());
	}

}
