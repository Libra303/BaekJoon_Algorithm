import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        //초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int num = 0;
        
        //로직
        while(++num <= n){
            int sum = num;
            int temp = num;
            while(temp != 0){
                sum += temp % 10;
                temp /= 10;
            }
            if(sum == n) break;
        }

        System.out.println(num-1 == n ? 0 : num);
    }
}

