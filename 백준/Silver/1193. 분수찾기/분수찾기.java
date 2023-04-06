import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        //초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int x = 1, y = 1, count = 0, sum = 0;

        for(int i = 1;sum < n;i++){
            sum = (i*(i+1))/2;
            count++;
        }

        int temp = sum - n;
        if(count % 2 == 0){
            //짝
            x = count - temp;
            y += temp;
        }else {
            //홀
            x += temp;
            y = count - temp;
        }
        

        System.out.println(x+"/"+ y);
    }
}

