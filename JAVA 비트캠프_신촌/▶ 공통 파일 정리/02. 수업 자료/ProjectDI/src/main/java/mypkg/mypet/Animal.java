package mypkg.mypet;

public class Animal {
	private String type ;
	private String name ;

	public Animal(String type, String name) {
		this.type = type ;
		this.name = name ;
	}

	public String getInfo(){
		String imsi = "" ;
		imsi += "���� : " + this.type + " \n" ;
		imsi += "�̸� : " + this.name + " \n" ;
		return imsi ;
	}
	
	public Animal() {
	
	}

	public void setType(String type) {		
		this.type = type ;
	}

	public void setName(String name) {
		this.name = name ;		
	}

	public void setAge(int i) {		
		
	}
}