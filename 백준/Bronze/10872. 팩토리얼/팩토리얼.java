import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws Exception {
        //초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        System.out.println(factorial(n));
    }
    
    //팩토리얼 메소드
    public static int factorial(int n){
        if(n == 0) return 1;
        return n * factorial(n-1);
    }

}
