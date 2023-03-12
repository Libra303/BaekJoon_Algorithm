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

        //공 넣기
        for(int i = 0; i < m; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int startIdx = Integer.parseInt(st.nextToken()) - 1;
            int endIdx = Integer.parseInt(st.nextToken()) - 1;
            int num = Integer.parseInt(st.nextToken());

            for(int j = startIdx; j <= endIdx; j++){
                arr[j] = num;
            }
        }

        //출력
        for(int i : arr){
            sb.append(i+" ");
        }

        System.out.println(sb);
    }
}