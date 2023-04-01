import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws Exception {
        //초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = {25, 10, 5};
        StringBuilder sb = new StringBuilder();
        int loop = Integer.parseInt(br.readLine());

        //로직
        for(int i = 0; i < loop; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int money = Integer.parseInt(st.nextToken());
            for(int coin : arr){
                sb.append(money / coin+ " ");
                money %= coin;
            }
            sb.append(money+ "\n");
        }

        //출력
        System.out.println(sb);
    }
}
