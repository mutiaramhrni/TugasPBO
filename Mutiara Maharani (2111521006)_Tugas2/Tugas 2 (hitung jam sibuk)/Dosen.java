
/*extends salah satu cara untuk bisa melakukan polymorphisme,
agar suatu class yg diextends bisa mewarisi isi
 method atau property dari induk classnya*/
public class Dosen extends Elemen{
    public int jamSibuk;
    private int jumlahHariKerja;
    public Dosen(String nama, int jumlahHariKerja) {
        super(nama);
        jamSibuk = jumlahHariKerja * 8;
        
    }

    public void tampilkan(){
        System.out.println(
            nama + " adalah seorang dosen dengan jam sibuk"
             + " " + jamSibuk);
    }
    public int getJamSibuk(){
        return jamSibuk;
    }
}

