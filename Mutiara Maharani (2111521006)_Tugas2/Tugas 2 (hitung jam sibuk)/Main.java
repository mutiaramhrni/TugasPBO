public class Main {
    public static void main(String[] args) {

        Asdos fairuzikun = new Asdos("Fairuzikun", 22, 7);
        Dosen Raja = new Dosen("Raja OP damanik", 5);
        Asdos Angel = new Asdos("Angel-chan", 20, 4);
        Mahasiswa Firman = new Mahasiswa("Firman", 20);
        Mahasiswa Nid = new Mahasiswa("Nid to Pass this sem", 23);
        Dosen Nivotko = new Dosen("Nivotko", 3);
        fairuzikun.tampilkan();
        Raja.tampilkan();
        Angel.tampilkan();
        Firman.tampilkan();
        Nid.tampilkan();
        Nivotko.tampilkan();

        int total = fairuzikun.jamSibuk + Raja.jamSibuk + Angel.jamSibuk + Firman.jamSibuk
                + Nid.jamSibuk + Nivotko.jamSibuk;

        System.out.println("Total jam sibuk elemen fasilkom adalah " + total);

    }
}



