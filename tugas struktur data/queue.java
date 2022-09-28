import java.util.PriorityQueue;
public class queue {
    public static void main(String[] args){
        String name;
        PriorityQueue<String> nama = new PriorityQueue<>();

        nama.offer("alice");
        nama.offer("daman");
        nama.offer("teguh");
        nama.offer("paijo");

        System.out.println("antrian pertama = " + nama.peek() +"\n");

        System.out.println("antrian:");
        for(String Nama : nama){
            System.out.println(Nama);
        }
        
    }
    
}
