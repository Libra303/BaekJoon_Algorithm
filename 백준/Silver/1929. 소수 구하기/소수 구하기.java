import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws Exception {
        //초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int start = Integer.parseInt(st.nextToken());
        if(start == 1) start++;
        int end = Integer.parseInt(st.nextToken());
        
        //로직
        for(int i = start; i <= end; i++){
            if(isPrime(i)) sb.append(i).append("\n");
        }

        //출력
        System.out.println(sb);
    }

    public static boolean isPrime(int n){
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0) return false;
        }
        return true;
    }
}
