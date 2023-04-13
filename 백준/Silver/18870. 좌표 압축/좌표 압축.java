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
        StringTokenizer st = new StringTokenizer(br.readLine());
        Map<Integer,Integer> map = new HashMap<>();
        int[] arr = new int[loop];

        for(int i = 0; i < loop; i++){
            int n = Integer.parseInt(st.nextToken());
            arr[i] = n;
        }

        int[] arr2 = arr.clone();
        Arrays.sort(arr2);
        int count = 0;
        for(int i : arr2){
            if(!map.containsKey(i)){
                map.put(i,count++);
            }
        }

        //출력
        for(int i : arr) {
            sb.append(map.get(i)+" ");
        }
        System.out.println(sb);

    }

}
