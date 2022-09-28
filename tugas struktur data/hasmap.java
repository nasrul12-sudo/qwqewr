import java.util.HashMap;
public class hasmap {
    public static void main(String[] args){
        HashMap<String, Integer> hewan = new HashMap<>();
        hewan.put("kucing", 4);
        hewan.put("ulat", 3);
        hewan.put("semut", 2);
        System.out.println(hewan.get("kucing"));
    }
    
}
