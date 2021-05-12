package mypkg.mypet;

public class Dog extends Animal{
	private String bark ;
	
	public Dog(String type, String name, String bark) {
		super( type, name) ;
		this.bark = bark ;
	}
	
	@Override
	public String toString() {
		String imsi = "" ;
		imsi += super.getInfo() ;
		imsi += "¢�� ��� : " + this.bark + "" ;		
		return imsi ;
	}
}