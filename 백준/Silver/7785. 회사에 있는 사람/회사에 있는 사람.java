import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static int[] list;
    public static void main(String[] args) throws Exception {
        //초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int loop = Integer.parseInt(br.readLine());
        
        //순서때문에 TreeMap이용 reverseOrder로 내림차순
        Map<String,Integer> map = new TreeMap<>(Collections.reverseOrder());

        //로직
        for(int i = 0; i < loop; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            if(map.containsKey(name)){
                map.remove(name);
            }else {
                map.put(name,0);
            }
        }

        //출력
        for(String s : map.keySet()){
            sb.append(s).append("\n");
        }
        System.out.println(sb);

    }

}
