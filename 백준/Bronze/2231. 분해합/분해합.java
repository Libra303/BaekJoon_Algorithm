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
            String str = num+"";
            for(int i = 0; i < str.length(); i++){
                sum += str.charAt(i) - 48;
            }
            if(sum == n) break;
        }

        System.out.println(num-1 == n ? 0 : num);
    }
}

