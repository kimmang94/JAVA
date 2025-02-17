//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
       /*
        오버플로우
        언더플로우
        */

        byte var1 = 125;
        for (int i = 0; i < 5; i++)
        {
            var1++;
            System.out.println("var1 : "+ var1);
        }

        System.out.println("==================");

        byte var2 = -125;
        for (int i = 0; i < 5; i++)
        {
            var2--;
            System.out.println("var2 : " + var2);
        }
    }
}