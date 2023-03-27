import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws Exception {
        //초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true){
            //초기화2
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            if(n == -1) break;
            Set<Integer> set = new TreeSet<>();
            set.add(1);
            int sum = 1;
            
            //약수찾기
            for(int i = 2; i <= Math.sqrt(n); i++){
                if(n % i == 0){
                    set.add(i);
                    set.add(n/i);
                    sum += i + n/i;
                }
            }
            
            //출력부분
            if(sum == n){
                sb.append(n+" =");
                for(int i : set) sb.append(" "+i+" +");
                sb.deleteCharAt(sb.length()-1);
                sb.append("\n");
            }else{
                sb.append(n+" is NOT perfect.\n");
            }
        }
        System.out.println(sb);

    }
}