package pkg1023;

public class Dosirak {
	//is a 관계 ---> ex) 모든 사람은 동물 입니다.
	//has a 관계 ---> Saram saram , ex) 도시락안에 사람이 포함되어있다. 
	private Saram saram; // 사람 객체
	private String dname; // 도시락 이름
	private int price;// 단가
	private String[] banchan; // = new String[3]; // 반찬종류 배열 , 배열은 참조되기 때문에 굳이 안적어도됨

	public Dosirak(Saram saram, String dname, int price, String[] banchan) {
		this.saram = saram;
		this.dname = dname;
		this.price = price;
		this.banchan = banchan;

	}

	public Saram getSaram() {
		return saram;
	}

	public String getDname() {
		return dname;
	}

	public int getPrice() {
		return price;
	}

	public String[] getBanchan() {
		return banchan;
	}

}
