import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        //초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        double b = Double.parseDouble(st.nextToken());
        int c = Integer.parseInt(br.readLine());
        int d = Integer.parseInt(br.readLine());
        
        //로직
        //기울기가 더 큰 경우
        if(c < a){
            System.out.println(0);
            return;
        }
        
        //기울기가 같은 경우
        if(c == a){
            System.out.println(b <= 0 ? 1 : 0);
            return;
        }
        
        //그 외 기울기
        int res = b / (c - a) <= d ? 1 : 0;
        System.out.println(res);
    }
}
