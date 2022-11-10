public class Dosen extends Elemen {
    public Dosen(String name, int jumlahHariKerja) {
        super(name);
        jamSibuk = jumlahHariKerja * 8;
    }

    public int getJamSibuk() {
        return jamSibuk;
    }

    public void menampilkan() {
        System.out.println(name + " merupakan seorang dosen dengan jam sibuk " + jamSibuk);
    }
}