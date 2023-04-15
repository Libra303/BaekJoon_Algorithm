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
        Map<String,Integer> map1 = new HashMap<>();
        Map<Integer,String> map2 = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        int loop1 = Integer.parseInt(st.nextToken());
        int loop2 = Integer.parseInt(st.nextToken());
        int count = 1;
        
        //로직1 값 입력받기
        for(int i = 0; i < loop1; i++){
            String s = br.readLine();
            map1.put(s,count);
            map2.put(count,s);
            count++;
        }
        
        //로직2 출력 값 구하기
        for(int i = 0; i < loop2; i++){
            String s = br.readLine();
            if(map1.containsKey(s)){
                sb.append(map1.get(s));
            }else{
                sb.append(map2.get(Integer.parseInt(s)));
            }
            sb.append("\n");
        }

        //출력
        System.out.println(sb);
    }

}