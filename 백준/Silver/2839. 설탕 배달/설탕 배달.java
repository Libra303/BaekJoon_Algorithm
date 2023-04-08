import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        //초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int loop = n / 5;

        //로직
        for(int i = loop; i >= 0; i--){
            int sum = i;
            int copyN = n - 5*i;

            sum += copyN / 3;
            copyN %= 3;

            if(copyN == 0){
                System.out.println(sum);
                return;
            }
        }

        System.out.println(-1);
    }
}
