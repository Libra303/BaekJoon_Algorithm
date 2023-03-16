import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(bf.readLine());
        int[] arr = new int[n];

        for(int i = 0; i < arr.length; i++){
            arr[i] = Integer.parseInt(bf.readLine());
        }

        Arrays.sort(arr);

        for(int i : arr){
            sb.append(i+"\n");
        }
        System.out.println(sb);

    }
}