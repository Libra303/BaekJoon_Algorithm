import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String args[]) throws IOException {
        //초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        List<StringBuilder> list = new ArrayList<>();
        
        for(int i = 0; i < 5; i++){
            //주요 로직
            String str = br.readLine();
            for(int j = 0; j < str.length(); j++){
                if(list.size() <= j) list.add(new StringBuilder());
                list.get(j).append(str.charAt(j));
            }
        }

        //출력
        for(StringBuilder tempSb : list) sb.append(tempSb);
        System.out.println(sb);
    }
}