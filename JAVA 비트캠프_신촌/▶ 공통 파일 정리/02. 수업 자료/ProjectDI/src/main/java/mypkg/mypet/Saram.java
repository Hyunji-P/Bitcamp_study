package mypkg.mypet;

public class Saram {
	Animal dog ;
	String name ;
	Animal cat ;
	
	public Saram(Animal dog, String name, Animal cat) {
		this.dog = dog ;
		this.name = name ;
		this.cat = cat ;
	}
	@Override
	public String toString() {
		String imsi = "" ;
		imsi += "주인 이름 : " + this.name + " \n" ;
		imsi += "\n" ;
		imsi += this.dog.toString() +  "\n" ;
		imsi += "\n" ;
		imsi += this.cat.toString() +  "\n" ; 
		return imsi ;
	}
}
