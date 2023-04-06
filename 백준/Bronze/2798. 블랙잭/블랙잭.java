import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        //초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int loop = Integer.parseInt(st.nextToken());
        int num = Integer.parseInt(st.nextToken());
        int[] arr = new int[loop];
        int max = 0;

        for(int i = 0; i < loop; i++){
            arr[i] = Integer.parseInt(st2.nextToken());
        }

        //로직
        for(int i = 0; i < loop-2; i++){
            for(int j = i+1; j < loop-1; j++){
                for(int k = j+1; k < loop; k++){
                    int sum = arr[i]+arr[j]+arr[k];
                    if(sum <= num && sum > max)  max = sum;
                }
            }
        }

        //출력
        System.out.println(max);
    }
}

