import java.util.LinkedList;
public class likedList {
    public static void main(String[] args){
        LinkedList<Integer> kelas = new LinkedList<>();
        kelas.addFirst(12);
        kelas.addFirst(13);
        kelas.addLast(14);
        kelas.addLast(15);
        for(int Kelas : kelas){
            System.out.println(Kelas);
        }
        
        System.out.println("nomor pertama = " + kelas.getFirst());
        System.out.println("nomor terakhir = " + kelas.getLast());

        kelas.removeFirst();
        kelas.removeLast();
        for(int Kelas : kelas){
            System.out.println(Kelas);
        }
    }
}
