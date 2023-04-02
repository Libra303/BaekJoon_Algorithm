import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        //초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int up = Integer.parseInt(st.nextToken());
        int down = Integer.parseInt(st.nextToken());
        int height = Integer.parseInt(st.nextToken());
        
        //로직
        int day = (int) Math.ceil((double)(height - up) / (up - down) + 1);
        System.out.println(day);
    }
}
