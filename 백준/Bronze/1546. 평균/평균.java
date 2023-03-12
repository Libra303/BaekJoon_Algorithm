import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int max = 0;
        int sum = 0;
        
        //최댓값, 모든값의 합 구하기
        for(int i = 0; i < n; i++){
            int score = Integer.parseInt(st.nextToken());
            if(max < score) max = score;
            sum += score;
        }

        //평균구하기
        double avg = (sum * 100.0) / (n * max);

        System.out.println(avg);
    }
}
