import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int temp1,temp2;
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        temp1 = x <= w-x ? x : w-x;
        temp2 = y <= h-y ? y : h-y;

        System.out.println(temp1 <= temp2 ? temp1 : temp2);
    }
}