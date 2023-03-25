import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int loop = Integer.parseInt(br.readLine());
        int[][] arr = new int[100][100];
        int count = 0;

        for(int i = 0; i < loop; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int startX = Integer.parseInt(st.nextToken());
            int startY = Integer.parseInt(st.nextToken());
            
            //주요로직
            for(int x = startX; x < startX+10; x++){
                for(int y = startY; y < startY+10; y++){
                    if(arr[x][y] == 0){
                        arr[x][y] = 1;
                        count++;
                    }
                }//inner
            }//outer
        }//loop

        System.out.println(count);
    }
}