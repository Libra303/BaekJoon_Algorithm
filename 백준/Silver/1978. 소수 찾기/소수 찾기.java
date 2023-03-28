import java.io.*;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws Exception {
        //초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int loop = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int count = 0;
        
        //로직
        outer:
        for(int i = 0; i < loop; i++){
            int n = Integer.parseInt(st.nextToken());
            if(n == 1) continue outer;
            for(int j = 2; j <= Math.sqrt(n); j++){
                if(n % j == 0) continue outer;
            }
            count++;
        }

        System.out.println(count);
    }
}