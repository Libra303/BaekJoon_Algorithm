import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws Exception {
        //초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());
        if(start == 1) start++;

        //로직
        outer :
        for(int i = start; i <= end; i++){
            for(int j = 2; j <= Math.sqrt(i); j++){
                if(i % j == 0) continue outer;
            }
            sb.append(i).append("\n");
        }

        //출력
        System.out.println(sb);
    }

}