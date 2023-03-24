import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException {
        //초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        List<Integer> list = new ArrayList<>();
        int num = Integer.parseInt(st.nextToken());
        int idx = Integer.parseInt(st.nextToken());

        //리스트에 약수 넣기
        list.add(1);
        for(int i = 2; i <= num; i++){
            if(list.size() >= idx) break;
            if(num % i == 0) list.add(i);
        }

        //출력
        if(list.size() < idx){
            System.out.println(0);
        }else {
            System.out.println(list.get(idx-1));
        }
    }
}