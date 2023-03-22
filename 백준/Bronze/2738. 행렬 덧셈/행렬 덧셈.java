import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException {
        //초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int row = Integer.parseInt(st.nextToken());
        int col = Integer.parseInt(st.nextToken());

        int[][] arr = new int[row][col];

        for(int i = 0; i < row; i++){
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            for(int j = 0; j < col; j++){
                arr[i][j] += Integer.parseInt(st2.nextToken());
            }
        }

        for(int i = 0; i < row; i++){
            StringTokenizer st3 = new StringTokenizer(br.readLine());
            for(int j = 0; j < col; j++){
                sb.append(arr[i][j]+Integer.parseInt(st3.nextToken())+" ");
            }
            sb.append("\n");
        }

        System.out.println(sb);

    }
}