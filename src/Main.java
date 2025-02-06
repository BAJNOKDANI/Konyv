public class Main {
    public static void main(String[] args) {
        Konyv k1 = new Konyv("ABA", "Mese1", "Péter", 2008, true);
        Konyv k2 = new Konyv("BAB", "Mese2", "Zéti", 2007, true);

        Olvaso o1 = new Olvaso("1", "Gabi", "gabi@gmail.com");
        Olvaso o2 = new Olvaso("2", "Gabi2", "gabi@gmail.com2");

        Kolcsonzo kolcsonzo=new Kolcsonzo();

        kolcsonzo.konyvHozzaad(k1);
        kolcsonzo.konyvHozzaad(k2);

        kolcsonzo.olvasoHozzaad(o1);
        kolcsonzo.olvasoHozzaad(o2);

        kolcsonzo.konyvKolcsonoz(k1.getAzonosito(), o1.getAzonosito());

        kolcsonzo.konyvKolcsonoz(k1.getAzonosito(), o2.getAzonosito());


    }
}