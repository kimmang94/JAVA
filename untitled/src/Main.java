//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
       /*
       산술 연산자
       + : 더하기 ; 덧셈 연산
       - : 빼기 ; 뺼셈 연산
       * : 곱하기 ; 곱셈 연산
       / : 나누기 ; 나눗셈 연산
       % : 나머지 ; 나눗셈의 나머지를 산출하는 연산
        */

        byte v1 = 10;
        byte v2 = 4;
        int v3 = 5;
        long v4 = 10L;

        int result1 = v1 + v2;
        System.out.println("result1 :" + result1);

        long result2 = v1 + v2 - v4;
        System.out.println("result2 :" + result2);

        double result3 = (double)v1 / v2;
        System.out.println("result3 :" + result3);

        int result4 = v1 % v2;
        System.out.println("result4 :" + result4);
    }
}