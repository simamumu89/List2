import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> List = new ArrayList<>();
        List.add("田中");
        List.add("鈴木");
        List.add("佐藤");
        List.add("大谷");

        for (String li : List){
            System.out.println(li);
        }
    }
}