import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

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
        //list.sort(Comparator.comparing(Ob::getX).thenComparing(Ob::getY));
        Collections.sort(list, new Comparator<Ob>() {
            @Override
            public int compare(Ob o1, Ob o2) {
                if (o1.x == o2.x) {
                    return o1.y - o2.y;
                }
                return o1.x - o2.x;
            }
        });

        //출력
        for(Ob b : list){
            sb.append(b.x+" "+b.y+"\n");
        }
        System.out.println(sb);

    }
}

class Ob{
    public int x;
    public int y;

    public Ob(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

