import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException {
        //초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = 0,row = 1, col = 1;

        for(int i = 0; i < 9; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < 9; j++){
               int n = Integer.parseInt(st.nextToken());
               if(max < n){
                   max = n; row = i+1; col = j+1;
               }
            }
        }
        System.out.println(max+"\n"+row+" "+col);

    }
}