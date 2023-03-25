import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        //초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        if(n == 1) n++;
        int sum = 0;
        int min = 0;
        
        //주요 로직
        outer:
        for(int i = n; i <= m; i++){
            for(int j = 2; j <= Math.sqrt(i); j++){
                if(i % j == 0) continue outer;
            }
            if(min == 0) min = i;
            sum += i;
        }

        //출력
        if(sum == 0){
            sb.append(-1);
        }else {
            sb.append(sum+"\n");
            sb.append(min);
        }
        System.out.println(sb);
    }
}