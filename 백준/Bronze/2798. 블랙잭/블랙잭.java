import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        //초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int loop = Integer.parseInt(st.nextToken());
        int num = Integer.parseInt(st.nextToken());
        int[] arr = new int[loop];
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < loop; i++){
            arr[i] = Integer.parseInt(st2.nextToken());
        }
        Arrays.sort(arr);

        //로직
        for(int i = 0; i < loop-2; i++){
            for(int j = i+1; j < loop-1; j++){
                for(int k = j+1; k < loop; k++){
                    int temp = arr[i]+arr[j]+arr[k];
                    if(temp <= num){
                        list.add(temp);
                    }else {
                        break;
                    }
                }
            }
        }
        Collections.sort(list);

        //출력
        System.out.println(list.get(list.size()-1));
    }
}

