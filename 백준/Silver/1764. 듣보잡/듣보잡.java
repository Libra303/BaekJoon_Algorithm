import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static int[] list;
    public static void main(String[] args) throws Exception {
        //초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        Map<String,Integer> map = new HashMap<>();
        int loop1 = Integer.parseInt(st.nextToken());
        int loop2 = Integer.parseInt(st.nextToken());

        for(int i = 0; i < loop1; i++){
            map.put(br.readLine(),0);
        }

        List<String> arr = new ArrayList<>();
        for(int i = 0; i < loop2; i++){
            String s = br.readLine();
            if(map.containsKey(s)){
                arr.add(s);
            }
        }

        Collections.sort(arr);

        sb.append(arr.size());
        for(int i = 0; i < arr.size(); i++){
            sb.append("\n").append(arr.get(i));
        }

        System.out.println(sb);
    }

}
