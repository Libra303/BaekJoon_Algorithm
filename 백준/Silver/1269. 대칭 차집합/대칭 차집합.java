import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static int[] list;
    public static void main(String[] args) throws Exception {
        //초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        StringTokenizer st3 = new StringTokenizer(br.readLine());
        Set<Integer> set = new HashSet<>();
        int loop1 = Integer.parseInt(st.nextToken());
        int loop2 = Integer.parseInt(st.nextToken());

        for(int i = 0; i < loop1; i++){
            int n = Integer.parseInt(st2.nextToken());
            set.add(n);
        }

        int count = set.size();

        for(int i = 0; i < loop2; i++){
            int n = Integer.parseInt(st3.nextToken());
            if(set.contains(n)){
                count--;
            }else {
                count++;
            }
        }

        System.out.println(count);

    }

}
