public class Mahasiswa extends Elemen {
    private int sks;
    public int jamSibuk;

    public Mahasiswa(String nama, int sks) {
        super(nama);/*super ini adalah tanda adanya DOWNCASTING,dimana 
        constructor class mahasiswa bereferensi pada constructor class 
        induknya yaitu class elemen.begitu juga yg terjadi pada class 
        mahasiswa dan class asdos*/
        jamSibuk = sks * 3;

    }

    public int getJamSibuk() {
        return jamSibuk;

    }

    public void tampilkan() {
        System.out.println(nama 
    + " adalah seorang Mahasiswa dengan jam sibuk" 
    + " " + jamSibuk);
    }

}
/*extends salah satu cara untuk bisa melakukan polymorphisme,
agar suatu class yg diextends bisa mewarisi isi
 method atau property dari induk classnya*/
class Asdos extends Mahasiswa {
    private int jamNgasdos;

    public Asdos
    (String nama, int sks, int jamNgasdos) {
        super(nama, sks);
        jamSibuk = jamSibuk + jamNgasdos;

    }
    
    /*  method getJamsibuk() dan tampilkan()
    adalah salah satu bentuk dari
    pewarisan(POLYMORPHISME) dan ini juga bisa disebut
    UPCASTING,dimana method tampilkan dari
    asdos yg merupakan subclass dari
    superclass mahasiswa mengubah referensi
    isi methodnya sendiri
     */
    public int getJamSibuk() {
        return jamSibuk;
    }

    public void tampilkan() {
        System.out.println(nama + " adalah seorang Asdos dengan jam sibuk" + " " + jamSibuk);
    }
}
