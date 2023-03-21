import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder(br.readLine());
        
        //StringBuilder의 revers()사용
        System.out.println(sb.toString().equals(sb.reverse().toString())? 1 : 0);
        
//        사용 안하고 하기===================================================================
//        String str = sb.toString();
//        int n = 1;
//        for(int i = 0; i < str.length() / 2; i ++){
//            if(str.charAt(i) != str.charAt(str.length()-1-i)){
//                n = 0;
//                break;
//            }
//        }
//        System.out.println(n);
    }
}