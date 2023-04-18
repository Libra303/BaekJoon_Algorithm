import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static int[] list;
    public static void main(String[] args) throws Exception {
        //초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        Set<String> set = new HashSet<>();
        
        //로직
        for(int i = 0; i < str.length(); i++){
            for(int j = 0; j < str.length() - i ; j++){
                String s = str.substring(j,j+i+1);
                set.add(s);
            }
        }

        System.out.println(set.size());
    }

}
