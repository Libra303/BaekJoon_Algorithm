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
        List<VO> list = new ArrayList<>();
        int loop = Integer.parseInt(br.readLine());
        int idx = 0;
        
        //로직
        for(int i = 0; i < loop; i++){
            VO vo = new VO(idx++,br.readLine());
            list.add(vo);
        }
        list.sort(Comparator.comparing(VO::getAge).thenComparing(VO::getIdx));
        
        //출력
        for(VO vo : list){sb.append(vo.getFull()).append("\n");}
        System.out.println(sb);

    }
}

class VO{
    private int idx;
    private int age;
    private String full;

    public VO(int idx,String full) {
        StringTokenizer st = new StringTokenizer(full);
        this.age = Integer.parseInt(st.nextToken());
        this.full = full;
        this.idx = idx;
    }

    public int getIdx() {
        return idx;
    }

    public int getAge() {
        return age;
    }

    public String getFull() {
        return full;
    }

}