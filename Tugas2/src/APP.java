public class APP {
  public static void main(String[] args) {
      Asdos a = new Asdos("Fairuzikun", 24, 1);
      Elemen b = new Dosen("Raja OP Damanik", 5);/*upcasting karena objek b
      merupakan objek baru dengan tipe data Elemen pada class Dosen.*/
      Asdos c = new Asdos("Angel-chan", 20, 4);
      Mahasiswa d = new Mahasiswa("Firman", 20);
      Elemen e = new Mahasiswa("Nid to pass this sem", 23);/*upcasting karena objek e
      merupakan objek baru dengan tipe data Elemen pada class Mahasiswa.*/
      Dosen f = new Dosen("Nivotko", 3);  
        
      a.JamSibuk();
      b.JamSibuk();
      c.JamSibuk();
      d.JamSibuk();
      e.JamSibuk();
      f.JamSibuk();
      
      int totalJamSibuk = a.getJamSibuk()+b.getJamSibuk()+c.getJamSibuk()+d.getJamSibuk()
      +e.getJamSibuk()+f.getJamSibuk();
      System.out.println("Total jam sibuk elemen Fasilkom adalah "+ totalJamSibuk);
    }
}