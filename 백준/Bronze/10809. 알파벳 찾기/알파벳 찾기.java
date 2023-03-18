import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String s = br.readLine();
        char c = 'a';

        for(int i = 0; i < 26; i++){
            int idx = s.indexOf(c+i);
            sb.append(idx+" ");
        }

        System.out.println(sb);
    }
}
