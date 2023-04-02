import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        //초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] arr = new int[5];
        int sum = 0;
        
        //로직
        for(int i = 0; i < 5; i++){
            int n = Integer.parseInt(br.readLine());
            arr[i] = n;
            sum += n;
        }
        Arrays.sort(arr);
        sb.append(sum / 5 +"\n");
        sb.append(arr[2]);

        System.out.println(sb);

    }
}
