import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        //초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int loop = Integer.parseInt(br.readLine());
        int[][] arr = new int[loop][2];

        //값 입력받기
        for(int i = 0; i < loop; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            int x= Integer.parseInt(st.nextToken());
            int y= Integer.parseInt(st.nextToken());

            arr[i][0] = x;
            arr[i][1] = y;
        }

        //정렬
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[1] == o2[1]) return o1[0] - o2[0];
                return o1[1] - o2[1];
            }
        });

        //출력
        for(int i = 0; i < loop; i++){
            sb.append(arr[i][0]+" "+arr[i][1]+"\n");
        }
        System.out.println(sb);
    }
}
