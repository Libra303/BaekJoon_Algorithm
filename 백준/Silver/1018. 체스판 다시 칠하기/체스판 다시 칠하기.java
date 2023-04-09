import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        //초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int h = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int min = 64;
        ob[][] arr = new ob[h][w-7];
        
        //값 입력 받으면서 배열에 추가
        for(int i = 0; i < h; i++){
            String str = br.readLine();
            for(int j = 0; j <= w-8; j++){
                arr[i][j] = new ob(str.substring(0+j,8+j));
            }
        }
        
        //로직
        for(int i = 0; i <= h-8; i++){
            for(int j = 0; j <= w-8; j++){
                int count = getCount(i,j,arr);
                if(count < min) min = count;
            }
        }

        //출력
        System.out.println(min);
    }
    
    //다시 칠해야하는 최솟값 구하기
    public static int getCount(int h,int w, ob[][] arr){
        int startB = 0;
        int startW = 0;
        for(int i = 0; i < 8; i++){
            int idx = i + h;

            if(idx % 2 == 0){
                startB += arr[idx][w].startB;
                startW += arr[idx][w].startW;
            }else {
                startB += arr[idx][w].startW;
                startW += arr[idx][w].startB;
            }

        }
        return startB > startW ? startW : startB;
    }

}

class ob {
    public int startB;
    public int startW;

    public ob(String str) {
        char[] arrB = {'B','W','B','W','B','W','B','W'};
        char[] arrW = {'W','B','W','B','W','B','W','B'};

        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if(arrB[i] != c) startB++;
            if(arrW[i] != c) startW++;
        }
    }
}
