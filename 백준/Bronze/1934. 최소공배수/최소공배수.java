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

            int max = Math.max(a,b);
            int min = Math.min(a,b);
            int count = 1;
            int res = 0;

            while (true){
                res = max * count;
                if(res % min == 0) break;
                count++;
            }

            sb.append(res).append("\n");
        }

        System.out.println(sb);
    }
}
