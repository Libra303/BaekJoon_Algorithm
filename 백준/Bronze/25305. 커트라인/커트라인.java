import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        //초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int loop = Integer.parseInt(st.nextToken());
        int k =  Integer.parseInt(st.nextToken());
        int[] arr = new int[loop];

        //로직
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for(int i = 0; i < loop; i++){
            int n = Integer.parseInt(st2.nextToken());
            arr[i] = n;
        }
        Arrays.sort(arr);

        //출력
        System.out.println(arr[loop-k]);

    }
}
