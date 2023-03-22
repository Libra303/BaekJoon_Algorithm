import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException {
        //초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int outLoop = Integer.parseInt(br.readLine());

        for(int i = 0; i < outLoop; i++){
            //초기화
            StringTokenizer st = new StringTokenizer(br.readLine());
            int inLoop = Integer.parseInt(st.nextToken());
            int[] arr = new int[inLoop];
            double sum = 0;
            double avg = 0;
            int count = 0;
            double percent = 0;

            //모든 점수 합 및 배열에 점수 넣기
            for(int j = 0; j < inLoop; j++){
                int n = Integer.parseInt(st.nextToken());
                arr[j] = n;
                sum += n;
            }//innerFor
            
            //평균 구하기
            avg = sum / inLoop;
    
            //평균 넘는 비유 구하기
            for(int j = 0; j < inLoop; j++){
                if(avg < arr[j]) count++;
            }
            percent = count * 100.0 / inLoop;
            sb.append(String.format("%.3f",percent));
            sb.append("%\n");
        }//outerFor

        System.out.println(sb);

    }
}