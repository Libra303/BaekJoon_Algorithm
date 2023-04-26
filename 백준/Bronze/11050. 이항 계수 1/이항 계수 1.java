import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws Exception {
        //초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int loop = k;

        int sum = 1;
        int temp = 1;
        for(int i = 0; i < loop; i++,n--,k--){
            sum *= n;
            temp *= k;
        }

        System.out.println(sum/temp);

    }
}
