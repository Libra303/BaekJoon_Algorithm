import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int loop = Integer.parseInt(st.nextToken());
            String s = st.nextToken();

            for(int j = 0; j < s.length(); j++){
                for(int k = 0; k < loop; k++){
                    sb.append(s.charAt(j));
                }
            }
            sb.append("\n");
        }

        System.out.println(sb);

    }
}
