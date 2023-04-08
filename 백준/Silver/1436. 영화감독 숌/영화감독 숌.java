import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        //초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int num = 666;
        int count = 1;

        //로직
        while(count <= n){
            if(isDevil(num)) count++;
            num++;
        }
        System.out.println(num-1);
    }

    //종말수판별
    public static boolean isDevil(int num){
        String str = num+"";
        String str2 = str.replace("666","");
        if(str2.length() <= str.length()-3){
            return true;
        }else {
            return false;
        }
    }
}
