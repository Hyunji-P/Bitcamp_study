package pkg0922;
//���� �ڵ忡�� result�� ��� ���� ���ΰ���?
//���� �� �׷��� ������ �� �������� ���� ���̸� �޸��忡 �ۼ��Ͽ� �����ϼ���.

public class Test_OperatorEx {
    public static void main(String[] args) {
        int a = 3 - -2, b = 3 ; 
        // a = 3+2 
        int x = ( a >= b ) ? 5 : ( a + 2)  ;
        
        x += ++a;        
        int y = ++a ;     
        y += a + --b  ; 
         
        char ch3 = 'D' ; 
        int z = ch3 >= 'A' && ch3 <= 'Z' ? --y  : x + 2  ;
        
        int result = 0 ;
        result = x > y ? z - y : x + z ;
        
        System.out.println( "result : " + result );
    }
}

/* ���� ������ ���ǽ����� ��Ÿ�� ���ÿ�.
(1) a�� b���� ũ�ų� ����. a >=b
(2) a�� b���� �۰� c���� ũ��. a < b && a>c
(3) a ���ϱ� 3�� 10�� ���� �ʴ�. a+3 != 10
(4) a�� 10���� ũ�ų� b�� ����. a>10 || a == b 
*/