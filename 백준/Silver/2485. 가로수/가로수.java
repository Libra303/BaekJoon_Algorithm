import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws Exception {
        //초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<Integer> set = new HashSet<>();
        int loop = Integer.parseInt(br.readLine());
        int[] arr = new int[loop-1];

        //간격들 구하기
        int pre = Integer.parseInt(br.readLine());
        for(int i = 0; i < loop-1; i++){
            int post = Integer.parseInt(br.readLine());
            int interval = post - pre;
            set.add(interval);
            arr[i] = interval;
            pre = post;
        }

        //간격들의 최대 공약수 구하기
        Iterator<Integer> iter = set.iterator();
        int gcd = iter.next();
        while (iter.hasNext()){
            gcd = getGcd(gcd,iter.next());
        }

        //필요한 나무 구하기
        int count = 0;
        for(int i : arr){
           count += i / gcd - 1;
        }

        //출력
        System.out.println(count);
    }

    
    //최대공약수 구하는 재귀함수
    public static int getGcd(int num1, int num2){
        if(num2 == 0) return num1;
        return getGcd(num2,num1 % num2);
    }
}
