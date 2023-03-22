import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        //초기화
        String str = new BufferedReader(new InputStreamReader(System.in)).readLine();
        String[] arr = {"c=","c-","dz=","d-","lj","nj","s=","z="};
        for(String s : arr){
            //배열속에 해당하는 알파벳을 치환하고 길이를 출력하면 되는 간단한 문제
            str = str.replace(s,"0");
        }
        System.out.println(str.length());
    }
}