import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        //초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int loop = Integer.parseInt(br.readLine());
        int[] arr = new int[loop];
        
        //로직
        for(int i = 0; i < loop; i++){
            int n = Integer.parseInt(br.readLine());
            arr[i] = n;
        }
        Arrays.sort(arr);

        //출력
        for(int i : arr){
            sb.append(i+"\n");
        }
        System.out.println(sb);

    }
}
