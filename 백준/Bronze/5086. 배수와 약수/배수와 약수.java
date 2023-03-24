import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException {
        //초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while(true){
            //초기화
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if(a == b) break;
            
            //주요로직
            if(a % b == 0){
                sb.append("multiple\n");
            } else if (b % a == 0) {
                sb.append("factor\n");
            }else{
                sb.append("neither\n");
            }
        }

        //출력
        System.out.println(sb);
    }
}