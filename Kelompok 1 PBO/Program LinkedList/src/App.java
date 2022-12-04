import java.util.LinkedList;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("\n--------------- CONTOH PROGRAM LINKED LIST --------------\n");
        //deklarasi awal linked list
        LinkedList<String> mobil = new LinkedList<String>();
        System.out.println("isi linked list awal : "+mobil);
        //add
        mobil.add("Lamborghini");
        mobil.add("BMW");
        System.out.println("isi linked list setelah method add : " + mobil);
        //addFirst
        mobil.addFirst("Toyota");
        mobil.addFirst("Ferrari");
        System.out.println("isi linked list setelah method addFirst : " + mobil);
        //addLast
        mobil.addLast("Suzuki");
        System.out.println("isi linked list setelah method addLast : "+ mobil);
        //removeFirst
        mobil.removeFirst();
        System.out.println("isi linked list setelah method removeFirst : "+mobil);
        //removeLast
        mobil.removeLast();
        System.out.println("isi linked list setelag method removeLast : "+mobil);
        //getFirst dan getLast
        System.out.println("node pertama linked list berisi : "+mobil.getFirst());
        System.out.println("node terakhir linked list berisi : "+ mobil.getLast());
        System.out.println("\n");
    }
}
