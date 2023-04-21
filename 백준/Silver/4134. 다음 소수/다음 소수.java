import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws Exception {
        //초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int loop = Integer.parseInt(br.readLine());

        //로직
        for(int i = 0; i < loop; i++){
            long n = Long.parseLong(br.readLine());
            sb.append(getPrime(n)).append("\n");
        }

        //출력
        System.out.println(sb);
    }
    
    //소수 구하는 재귀함수
    public static long getPrime(long n){
        //2보다 작거나 같은 경우
        if(n <= 2) return 2;

        //소수인지 판별
        for(long i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0) return getPrime(n+1);
        }
        return n;
    }
}
