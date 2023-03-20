import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int loop = 2 * n - 1;

        for(int i = 1; i <= loop; i++){
            int temp = Math.abs(n-i);
            //빈칸 출력
            for(int j = 0;j < temp;j++){
                sb.append(" ");
            }
            //별 출력
            for(int j = 0; j < loop-2*temp; j++){
                sb.append("*");
            }
            sb.append("\n");
        }

        System.out.println(sb);
        //계산은 많아지지만 for문 최대한 적게 쓰기
    }
}
