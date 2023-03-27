import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        //초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int loop = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int minX = Integer.parseInt(st.nextToken());
        int minY = Integer.parseInt(st.nextToken());
        int maxX = minX;
        int maxY = minY;

        for(int i = 1; i < loop; i++){
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st2.nextToken());
            int y = Integer.parseInt(st2.nextToken());
            
            //주요로직
            if(x < minX){
                minX = x;
            } else if (maxX < x) {
                maxX = x;
            }

            if(y < minY){
                minY = y;
            } else if (maxY < y) {
                maxY = y;
            }

        }

        //출력
        int width = Math.abs(maxX-minX)*Math.abs(maxY-minY);
        System.out.println(width);
    }
}