import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        //초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = br.readLine();
        int[] arr = new int[str.length()];

        //로직
        for(int i = 0; i < str.length(); i++){
            arr[i] = str.charAt(i) - 48;
        }
        Arrays.sort(arr);

        //출력
        for(int i = str.length()-1; i >= 0; i--){
            sb.append(arr[i]);
        }
        System.out.println(sb);



    }
}

