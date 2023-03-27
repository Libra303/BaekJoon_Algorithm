import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws Exception {
        //초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while(true){
            //초기화2
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] arr = new int[3];
            arr[0] = Integer.parseInt(st.nextToken());
            if (arr[0] == 0) break;
            arr[1] = Integer.parseInt(st.nextToken());
            arr[2] = Integer.parseInt(st.nextToken());
            Arrays.sort(arr);
            
            //주요로직
            if(arr[0]+arr[1] <= arr[2]){
                sb.append("Invalid\n");
            } else if(arr[0] == arr[1] && arr[1] == arr[2]){
                sb.append("Equilateral\n");
            } else if(arr[0] == arr[1] || arr[0] == arr[1] || arr[1] == arr[2]){
                sb.append("Isosceles\n");
            }else{
                sb.append("Scalene\n");
            }
        }

        //출력
        System.out.println(sb);
    }
}