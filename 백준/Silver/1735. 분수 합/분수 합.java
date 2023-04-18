import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        //초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st1.nextToken());
        int b = Integer.parseInt(st1.nextToken());
        int c = Integer.parseInt(st2.nextToken());
        int d = Integer.parseInt(st2.nextToken());

        //로직
        int up = a * d + b * c;
        int down = b * d;
        int gcd = gcd(up,down);

        //출력
        sb.append(up/gcd).append(" ").append(down/gcd);
        System.out.println(sb);
    }

    //최대공약수 구하는 메서드
    public static int gcd(int num1,int num2){
        if(num2 == 0) return num1;
        return gcd(num2, num1 % num2);
    }
}
