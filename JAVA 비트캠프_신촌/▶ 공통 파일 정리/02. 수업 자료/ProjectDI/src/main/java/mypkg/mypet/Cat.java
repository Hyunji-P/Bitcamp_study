package mypkg.mypet;

public class Cat extends Animal{
	private int age  ;
	
	public void setAge(int age) {		
		this.age = age ;
//		System.out.println("ddd");
	}
	
	@Override
	public String toString() {
		String imsi = "" ;
		imsi += super.getInfo() ;
		imsi += "³ªÀÌ : " + this.age + "" ; 
		return imsi ;
	}
}
