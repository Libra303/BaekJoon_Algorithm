import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static int[] list;
    public static void main(String[] args) throws Exception {
        //초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int loop = Integer.parseInt(br.readLine());

        for(int i = 0; i < loop; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int gcd = gcd(a,b);

            sb.append(a * b / gcd).append("\n");
        }

        System.out.println(sb);
    }

    public static int gcd(int num1,int num2){
        if(num2 == 0) return num1;
        return gcd(num2, num1 % num2);
    }
}
