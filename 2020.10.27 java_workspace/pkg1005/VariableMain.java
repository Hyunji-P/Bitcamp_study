package pkg1005;

public class VariableMain {

	public static void main(String[] args) {
		Variable obj = new Variable();
		
		System.out.println(Variable.x);
		System.out.println(obj.y);
		System.out.println("abcd");
		obj.hohoho("안녕");//메소드 호출 , 초기값 = "안녕"
	}

}
