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

        //순서 바꾸기 로직
        for(int i = 0; i < m; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int startIdx = Integer.parseInt(st.nextToken()) - 1;
            int endIdx = Integer.parseInt(st.nextToken()) - 1;
            int loop = (endIdx - startIdx + 1) / 2;
            
            //여기서 역순으로
            int temp = 0;
            for(int j = 0; j < loop; j++){
                temp = arr[startIdx + j];
                arr[startIdx + j] = arr[endIdx - j];
                arr[endIdx - j] = temp;
            }
        }

        //출력
        for(int i : arr){
            sb.append(i+" ");
        }

        System.out.println(sb);
    }
}