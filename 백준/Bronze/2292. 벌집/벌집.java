import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        //초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Integer.parseInt(br.readLine());
        if(n == 1) {System.out.println(1); return;}
        System.out.println((long)Math.ceil((3 + Math.sqrt(12*n-3)) / 6));
    }
}

