package pkg0922;

//���� �ҽ� �ڵ忡 ���� ����� ���ڵ����� �����غ�����.
public class Test_PlusMinus02 {
	    public static void main(String[] args) {
	        int a = 5, b= 10, c ;     
	        // a=6 , b = 11
	        c =    ++a     +     ++b ;
	        // c = 6+11
	        
	        System.out.println("a : " + a);
	        System.out.println("b : " + b);
	        System.out.println("c : " + c);
	        
	        
	        // a = a + ++c +15;
	        // c = 18
	        // a = 6 + 18 + 15 = 39
	        // b = 12
	        // a = 38
	        // b = 11
	        // c = 49
	        a += ++c + 15 ;
	        b = 12 ;

	        c =    --a     +     --b ;

	        System.out.println("a : " + a);
	        System.out.println("b : " + b);
	        System.out.println("c : " + c);
	    }
	}


