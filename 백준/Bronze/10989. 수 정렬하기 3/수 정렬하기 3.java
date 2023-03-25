import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        //초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int loop = Integer.parseInt(br.readLine());
        int[] arr = new int[loop];

        //값 넣기
        for(int i = 0; i < loop; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        //정렬
        Arrays.sort(arr);

        //출력
        for(int i : arr){
            sb.append(i);
            sb.append("\n");
        }
        System.out.println(sb);
    }
}