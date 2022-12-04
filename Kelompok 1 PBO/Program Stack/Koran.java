import java.util.Scanner;

public class Koran {

        String [] arr;
        int top;
        int max;

        Koran (int size){
            arr = new String [size];
            max = size;
            top = -1;
        }
        public void push(String x) {
             if (!isFull()) {
                arr[++top] = x;
                System.out.println(x);
            }else{
                System.out.println("Kapasitas full");
            }
        }
        public int pop() {
            if (isEmpty()) {
              System.out.println("Stack Kosong");
            }
            return top--;
        }
        public int size() {
            return top + 1;
        }
        public Boolean isEmpty() {
            return top == -1;
        }
        public Boolean isFull() {
            return top == max-1;
        }
        public void tampil() {
            for (int i = 0; i <= top; i++) {
              System.out.println(arr[i]);
            }
        }

    public static void main(String[] args) {
        Koran stack = new Koran(5);
        Scanner input = new Scanner(System.in);
        boolean next = !stack.isFull();

        while (next){        
            System.out.println("Tambahkan koran(y/t)?");
            String simpan = input.next();
            switch(simpan){
                case "y":
                    System.out.println("Masukkan Koran: ");
                    String nama = input.next();
                    stack.push(nama.toString());
                    break;
                case "t":
                    next = false;
                    System.out.println("\nIsi: ");
                    stack.tampil();
                    System.out.println("Kapasitas terpakai: "+stack.size());
                    break;
                default:
                    System.out.println("Coba lagi");
            }
        }
        stack.pop();
        System.out.println("\nSetelah diambil: ");
        stack.tampil();
        System.out.println("Kapasitas terpakai setelah diambil: "+stack.size());
        System.out.println("\nApakah kotak kosong? "+stack.isEmpty());
        System.out.println("Apakah kotak penuh? "+stack.isFull());
    }
}
