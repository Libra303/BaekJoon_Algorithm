import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        //초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int num = Integer.parseInt(br.readLine());
        if(num == 1) return;
        
        
        //로직
        for(int i = 2; i <= num; i++){
            while(true){
                if(num % i == 0){
                    sb.append(i).append("\n");
                    num /= i;
                }else {
                    break;
                }
            }//while
        }

        System.out.println(sb);
    }
}