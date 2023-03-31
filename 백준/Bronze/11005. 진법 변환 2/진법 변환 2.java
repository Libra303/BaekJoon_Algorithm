import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws Exception {
        //초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int num = Integer.parseInt(st.nextToken());
        int jin = Integer.parseInt(st.nextToken());

        //로직
        while(true){
            int quotient = num / jin;
            int remainder = num % jin;

            if(remainder > 9){
                sb.insert(0,(char)(remainder+55));
            }else{
                sb.insert(0,remainder);
            }

            if(quotient == 0) break;
            num = quotient;
        }
        
        //출력
        System.out.println(sb);
    }
}
