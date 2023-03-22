import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String args[]) throws IOException {
        //초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Character> list = new ArrayList<>();
        int loop = Integer.parseInt(br.readLine());
        int count = 0;

        outer:for (int i = 0; i < loop; i++) {
            String str = br.readLine();
            for (int j = 1; j < str.length(); j++) {
                if (str.charAt(j - 1) != str.charAt(j) && str.indexOf(str.charAt(j)) != j) {
                        continue outer;
                }
            }//for
            count++;
        }
        System.out.println(count);
    }
}