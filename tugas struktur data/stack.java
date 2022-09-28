import java.util.Stack;
public class stack {
    public static void main(String[] args){
        Stack<String> nama = new Stack<>();
        nama.push("erna");
        nama.push("sasa");
        nama.push("alice");
        nama.push("dea");
        System.out.println(nama.pop());
        System.out.println(nama.pop());
    }
}
