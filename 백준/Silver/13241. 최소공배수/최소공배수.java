import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int[] list;
    public static void main(String[] args) throws Exception {
        //초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long num1 = Long.parseLong(st.nextToken());
        long num2 = Long.parseLong(st.nextToken());

        //최소공배수 : 두 수의 곱 나누기 최대공약수
        long res = num1 * num2 / gcd(num1,num2);

        System.out.println(res);
    }

    //최대공약수 구하는 메서드
    public static long gcd(long num1,long num2){
        if(num2 == 0) return num1;
        return gcd(num2, num1 % num2);
    }
}
