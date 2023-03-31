import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws Exception {
        //초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String num = st.nextToken();
        int jin = Integer.parseInt(st.nextToken());
        int sum = 0;
        
        //로직
        for(int i = 0; i < num.length(); i++){
            char c = num.charAt(i);
            int temp = c < 'A'? c - 48 : c - 55;
            sum += temp * Math.pow(jin,num.length()-1-i);
        }
        
        //출력
        System.out.println(sum);
    }
}
