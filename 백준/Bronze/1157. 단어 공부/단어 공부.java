import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        
        //초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine().toUpperCase();
        Map<Character,Integer> map = new HashMap<>();
        
        //Map에 값 넣기
        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            int n = map.containsKey(c) ? map.get(c)+1 : 1;
            map.put(c,n);
        }
        
        //많이 사용된 알파벳 찾기
        int maxCount = 0;
        char maxChar = ' ';

        for(char c : map.keySet()){
            int temp = map.get(c);
            if(maxCount < temp){
                maxChar = c;
                maxCount = temp;
            } else if (maxCount == temp) {
                maxChar = '?';
            }
        }
        System.out.println(maxChar);
    }
}
