public class Elemen {
    public String name;
    public int jamSibuk;

    public Elemen(String name) {
        /*
         * Consturctor superclass merupakan suatu bentuk dari DOWNCASTING,
         * dikarenakan ia adalah referensi bagi subclassnya.Yang manasuper class dibuatkan constructor,
         * maka subclass juga harus dibuatkan constructornya,jika tidak maka akan terjadi error
         */
        this.name = name;
    }

    public String getName() {
        return null;
    }

    public int getJamSibuk() {
        return 0;
    }

    public void JamSibuk() {
    }
}