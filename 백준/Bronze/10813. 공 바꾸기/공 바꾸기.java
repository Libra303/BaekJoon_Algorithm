import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        //초기값
        StringTokenizer initSt = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(initSt.nextToken());
        int m = Integer.parseInt(initSt.nextToken());
        
        //배열만들기
        int[] arr = new int[n];
        for(int i = 0; i < n ; i++){
            arr[i] = i+1;
        }
        
        //교환
        int temp = 0;
        for(int i = 0; i < m; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken()) - 1;
            int b = Integer.parseInt(st.nextToken()) - 1;

            temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
        }
        
        //출력
        for(int i : arr){
            sb.append(i+" ");
        }

        System.out.println(sb);
    }
}
