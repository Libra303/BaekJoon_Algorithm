import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        //초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb  = new StringBuilder();
        long a = Integer.parseInt(st.nextToken());
        long b = Integer.parseInt(st.nextToken());
        long c = Integer.parseInt(st.nextToken());
        long d = Integer.parseInt(st.nextToken());
        long e = Integer.parseInt(st.nextToken());
        long f = Integer.parseInt(st.nextToken());
        
        //로직
        long x = (b*f-c*e)/(b*d-a*e);
        long y = (c*d-a*f)/(b*d-a*e);

        //출력
        sb.append(x).append(" ").append(y);
        System.out.println(sb);

    }
}

