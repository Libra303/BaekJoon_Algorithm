import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static int[] list;
    public static void main(String[] args) throws Exception {
        //초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int loop1 = Integer.parseInt(br.readLine());
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int loop2 = Integer.parseInt(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        //list와 map중 map 이용법
        Map<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i < loop1; i++){
            int n = Integer.parseInt(st1.nextToken());
            map.put(n,0);
        }

        for(int i = 0; i < loop2; i++){
            int n = Integer.parseInt(st2.nextToken());
            if(map.containsKey(n)){
                sb.append(1);
            }else {
                sb.append(0);
            }
            sb.append(" ");
        }

        System.out.println(sb);

    }

}
