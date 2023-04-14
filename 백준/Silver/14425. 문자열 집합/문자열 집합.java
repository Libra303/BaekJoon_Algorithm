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
        StringTokenizer st = new StringTokenizer(br.readLine());
        int loop1 = Integer.parseInt(st.nextToken());
        int loop2 = Integer.parseInt(st.nextToken());
        Map<String,Integer> map = new HashMap<>();

        for(int i = 0; i < loop1; i++){
            String str = br.readLine();
            map.put(str,0);
        }

        int count = 0;
        for(int i = 0; i < loop2; i++){
            String str = br.readLine();
            if(map.containsKey(str)) count++;
        }

        System.out.println(count);

    }

}
