//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
       /*
            1. 타입
                1) 기본 타입
                정의 : 기본 타입은 산수 및 수학에서 사용하는 데이터이자 값 그 자체이다
                선언 방법 : 저장할 때 용도를 구분하고 표시하기 위해 타입 을 앞에 선언한다

                boolean 타입 : 참이나 거짓 저장
                char 타입 : 문자(한 글자) 저장
                int 타입 : 정수(소수점이 없는 수) 저장
                double 타입 : 실수(소수점이 있는 수) 저장
                String 타입 : 문자열(여러 문자) 저장 (참조 타입)
                
        */

        boolean isL = false;
        char sult = 'H';
        int year = 2025;
        int month = 6;
        
        double latitude = 37.52127220511242;
        double lingitude = 127.0074462890625;
        
        String card = "H8"; // 문자열 참조 타입

    /*
        프로그램 실행 순서
        - 프로그램은 위에서 아래로 순차적 (Sequence)으로 실행된다.
        - 프로그램의 순서를 제어하기 위한 조건문에는 if, switch, 삼항연잔가(?:) 가 있다.
        - 프로그램의 특정 부분을 반복시키는 반복문에는 for, while, do~while 이 있다.
     */
        int v = 100;
        if (v % 2 == 1) {
            System.out.println("짝수");
        }
        else {
            System.out.println("홀수");
        }

        // 삼항 연산자
        int temp = 99;
        temp = (temp % 2 == 1)? temp * 3 + 1 : temp / 2;

        int tot = 0;
        char c = 'A';
        switch (c) {
            case 'A':
                tot = 1;
                break;
            case 'B':
                tot = 2;
                break;
            case 'C':
                tot = 3;
                break;
            case 'D':
                tot = 4;
                break;
            default:
                tot = 5;
                break;
        }

        /*
         반복문
         */

        int s = 0;
        for (int i = 1; i <= 100; i++){
            s = s + i;
        }
        System.out.println(s);

        // 조건이 명확할 때는 while () 을 사용하는 편이 좋다
        int n = 2345;
        int tol = 0;
        while (n > 0) {
            tol = tol + n % 10;
            n = n / 10;
        }
        System.out.println(tol);
    }
    /*
        상수 : 상수는 변수와 달리 값이 한 번 결정되면 변경할 수 없다
    */

    public class SwitchMain{
        public static final int PHYSICAL = 23;
    }



}