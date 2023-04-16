import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static int[] list;
    public static void main(String[] args) throws Exception {
        //초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Map<String,Integer> map = new HashMap<>();
        int loop1 = Integer.parseInt(br.readLine());
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int loop2 = Integer.parseInt(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());

        for(int i = 0; i < loop1; i++){
            String s = st1.nextToken();
            if(!map.containsKey(s)){
                map.put(s,1);
            }else {
                map.replace(s,map.get(s)+1);
            }
        }

        for(int i = 0; i < loop2; i++){
            String s = st2.nextToken();
            if(map.containsKey(s)){
                sb.append(map.get(s));
            }else {
                sb.append(0);
            }
            sb.append(" ");
        }

        System.out.println(sb);

    }

}
