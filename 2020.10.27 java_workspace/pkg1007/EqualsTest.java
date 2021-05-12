package pkg1007;

public class EqualsTest {

	public static void main(String[] args) {
		String str = "java";
		String str1 = new String("JAVA");
		String str2 = new String("java");

		if(str1 == str2){//참조 비교
			System.out.println("참조 동일");
		}else {
			System.out.println("참조 다름");
		}
		
		if(str1.equals(str2)){//값 비교
			System.out.println("값 동일");
		}else {
			System.out.println("값 다름");
		}
		
		if(str1.equalsIgnoreCase(str2)){//값 비교 
			System.out.println("값 동일");
		}else {
			System.out.println("값 다름");
		}

	}

}
