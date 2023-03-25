import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        //초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] xArr = new int[3];
        int[] yArr = new int[3];

        for(int i = 0; i < 3; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            xArr[i] = x;
            yArr[i] = y;
        }

        Arrays.sort(xArr);
        Arrays.sort(yArr);

        //출력
        int x = xArr[1] == xArr[0] ? xArr[2] : xArr[0];
        int y = yArr[1] == yArr[0] ? yArr[2] : yArr[0];

        System.out.println(x+" "+y);
    }

}