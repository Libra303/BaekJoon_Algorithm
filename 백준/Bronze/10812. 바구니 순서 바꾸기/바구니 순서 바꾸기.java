import java.io.*;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        
        //초기화1
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        LinkedList<Integer> list = new LinkedList<>();
        for(int i = 1; i <= n; i++) list.add(i);
        
        
        for(int i = 0; i < m; i++){
            //초기화2
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int startIdx = Integer.parseInt(st2.nextToken()) - 1;
            int endIdx = Integer.parseInt(st2.nextToken()) - 1;
            int midIdx = Integer.parseInt(st2.nextToken()) - 1;
            
            //주요로직
            LinkedList<Integer> tempList = new LinkedList<>(list.subList(startIdx,midIdx));
            list.removeAll(tempList);
            list.addAll(endIdx+1-tempList.size(),tempList);
        }

        //출력
        for(int i = 0; i < list.size(); i++)
            sb.append(list.get(i)+" ");
        System.out.println(sb);
    }
}
