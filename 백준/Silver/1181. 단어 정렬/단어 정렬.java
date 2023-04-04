import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        //초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        List<VO> arr = new ArrayList<>();
        List<String> list = new ArrayList<>();
        int loop = Integer.parseInt(br.readLine());

        //로직
        for(int i = 0; i < loop; i++){
            VO vo = new VO(br.readLine());
            //중복제거
            if(!list.contains(vo.getStr())){
                arr.add(vo);
                list.add(vo.getStr());
            }
        }
        //정렬
        arr.sort(Comparator.comparing(VO::getLength).thenComparing(VO::getStr));
        
        //출력
        for(VO vo : arr){sb.append(vo.getStr()).append("\n");}
        System.out.println(sb);

    }
}

class VO{
    private int length;
    private String str;

    public VO(String str) {
        this.length = str.length();
        this.str = str;
    }

    public int getLength() {
        return length;
    }

    public String getStr() {
        return str;
    }
}