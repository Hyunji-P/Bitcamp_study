package pkg0922;
//다음 코드에서 result의 결과 값은 얼마인가요?
//또한 왜 그렇게 나오는 지 변수들의 값의 추이를 메모장에 작성하여 설명하세요.

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

/* 다음 문장을 조건식으로 나타내 보시오.
(1) a는 b보다 크거나 같다. a >=b
(2) a는 b보다 작고 c보다 크다. a < b && a>c
(3) a 더하기 3은 10과 같지 않다. a+3 != 10
(4) a는 10보다 크거나 b와 같다. a>10 || a == b 
*/