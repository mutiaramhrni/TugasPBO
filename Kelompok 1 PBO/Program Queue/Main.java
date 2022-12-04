//Contoh Program Queue

// 1. Masuk Antrian
//  2.Panggil antrian 
//  3.Lihat Data Antrian 
//  4.Kesalahan dalam mengisi Data Antrian 
//  5.Hapus Data Antrian 
//  6.Keluar

import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;
public class Main  {

    public static void main(String[] args) {
        
        //deklarasi variabel
        int menu,id,hapusID;
        String nama,keperluan,hapusNama,hapusKeperluan;
        //deklarasi input
        Scanner input=new Scanner(System.in);
        Scanner in = new Scanner(System.in);
        Scanner str = new Scanner(System.in);
        Scanner rmvN = new Scanner(System.in);
        Scanner rmvID = new Scanner(System.in);
        Scanner rmvK = new Scanner(System.in);
        //deklarasi queue
        Queue<Integer> nomor= new LinkedList<>();
        Queue<String> name= new LinkedList<>();
        Queue<String> perlu= new LinkedList<>();
        

        System.out.println("\n\t\t=======================================================================================");
        System.out.println("\t\t\t\t\t  Selamat datang di Bank Indonesia");
        System.out.println("\t\t=======================================================================================");
        
        do{
            System.out.println("\n\n");
            System.out.println("\t\t\t\t==============================");
            System.out.println("\t\t\t\t\t  PILIH MENU  ");
            System.out.println("\t\t\t\t==============================");
            System.out.println("\t\t\t\t1. Masuk antrian");
            System.out.println("\t\t\t\t------------------------------");
            System.out.println("\t\t\t\t2. Antrian Dipanggil");
            System.out.println("\t\t\t\t------------------------------");
            System.out.println("\t\t\t\t3. Hapus ");
            System.out.println("\t\t\t\t------------------------------");
            System.out.println("\t\t\t\t4. Lihat data antrian");
            System.out.println("\t\t\t\t------------------------------");
            System.out.println("\t\t\t\t5. Keluar");
            System.out.println("\t\t\t\t==============================");
            System.out.print("\t\t\t\t     Pilihan Anda : ");
            menu=input.nextInt();
            System.out.println("\n");
            if(menu==1){
                System.out.println("\t\t\t\t==============================");
                System.out.print("\t\t\t\tMasukan ID        : ");
                id = in.nextInt();
                nomor.add(id);
                System.out.print("\t\t\t\tMasukan nama      : ");
                nama = str.nextLine();
                name.add(nama);
                System.out.print("\t\t\t\tMasukan keperluan : ");
                keperluan = str.nextLine();
                perlu.add(keperluan);

            }else if(menu==2){
                if(nomor.isEmpty()){
                    System.out.println("\t\t\t\tCEK KEMBALI NASABAH ANDA!!");
                }else{
                System.out.println("\t\t\t\tNOTICE!!");
                System.out.println("\t\t\t\tPemanggilan atas nama : "+name.poll());
                nomor.poll();
                perlu.poll();
                }
            }else if(menu==3){
                if(nomor.isEmpty()&&perlu.isEmpty()&&name.isEmpty()){
                    System.out.println("\t\t\t\tDATA KOSONG!!");
                }else{
                System.out.print("\t\t\t\tMasukan ID          : ");
                hapusID = rmvID.nextInt();
                System.out.print("\t\t\t\tMasukan NAMA        : ");
                hapusNama = rmvN.nextLine();
                System.out.print("\t\t\t\tMasukan KEPERLUAN   : ");
                hapusKeperluan = rmvK.nextLine();
                System.out.print("\n");

                    if(name.contains(hapusNama)&&nomor.contains(hapusID)&&perlu.contains(hapusKeperluan)==false){
                        System.out.println("\t\t\t\tDATA TIDAK SESUAI!!");
                    }else if(name.remove(hapusNama)&&nomor.remove(hapusID)&&perlu.remove(hapusKeperluan)){
                        System.out.println("\t\t\t\tDATA BERHASIL DIHAPUS!! ");
                    }
                }
            }else if(menu==4){
                if(nomor.isEmpty()){
                    System.out.println("\t\t\t\tTIDAK ADA NASABAH!!");
                }else{
                    
                    System.out.println("\t\t\t\t==============================");
                    System.out.println("\t\t\t\t         DATA NASABAH");
                    System.out.println("\t\t\t\t==============================");
                    System.out.println("\t\t\t\t|| ID         : "+nomor);
                    System.out.println("\t\t\t\t------------------------------");
                    System.out.println("\t\t\t\t|| NAMA       : "+name);
                    System.out.println("\t\t\t\t------------------------------");
                    System.out.println("\t\t\t\t|| KEPERLUAN  : "+perlu);
                    System.out.println("\t\t\t\t==============================");
                    System.out.println("\t\t\t\t|| NASABAH PERTAMA  : "+name.peek());
                    System.out.println("\t\t\t\t|| TOTAL NASABAH    : "+name.size());

                }
            }else{
                if(menu==5){
                    System.out.println("\n\t\t\t\t\t *Terima Kasih*");
                }
            }
        }while(menu!=5);
    }
}
