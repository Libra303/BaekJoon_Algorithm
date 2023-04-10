import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        //초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int loop = Integer.parseInt(br.readLine());
        List<Ob> list = new ArrayList<>();

        for(int i = 0; i < loop; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            list.add(new Ob(x,y));
        }

        //정렬
        list.sort(Comparator.comparing(Ob::getX).thenComparing(Ob::getY));


        //출력
        for(Ob b : list){
            sb.append(b.getX()+" "+b.getY()+"\n");
        }
        System.out.println(sb);

    }
}

class Ob{
    int x;
    int y;

    public Ob(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}

