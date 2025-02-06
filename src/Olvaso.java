import java.util.ArrayList;
import java.util.Arrays;

public class Olvaso {
    private String azonosito;
    private String nev;
    private  String email;
    private Konyv [] kolcsonzottKonyvek;

    public Olvaso(String azonosito, String nev, String email) {
        this.azonosito = azonosito;
        this.nev = nev;
        this.email = email;
        this.kolcsonzottKonyvek = new Konyv[5];
    }

    public String getAzonosito() {
        return azonosito;
    }

    public void setAzonosito(String azonosito) {
        this.azonosito = azonosito;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Konyv[] getKolcsonzottKonyvek() {
        return kolcsonzottKonyvek;
    }

    public void setKolcsonzottKonyvek(Konyv[] kolcsonzottKonyvek) {
        this.kolcsonzottKonyvek = kolcsonzottKonyvek;
    }

    public void konyvKolcsonoz(Konyv konyv){
        if (konyv.isKolcsonozheto()){
            boolean vanHely=false;
            for (int i = 0; i < kolcsonzottKonyvek.length; i++) {
                  if (kolcsonzottKonyvek[i]==null){
                      kolcsonzottKonyvek[i]=konyv;
                      konyv.setKolcsonozheto(false);
                      i= kolcsonzottKonyvek.length;
                      System.out.println("A köny sikeresen kikölcsönözve.");
                      vanHely=true;
                  }
            }
            if (!vanHely) {
                System.out.println("Nem vehetünk ki több könyvet.");
            }
        }
        else{
            System.out.println("Nem kölcsönözhető a könyv.");
        }
    }

    public void konyvVisszahoz(Konyv konyv){
        for (int i = 0; i < kolcsonzottKonyvek.length; i++) {
            if (konyv.getAzonosito().equals(kolcsonzottKonyvek[i].getAzonosito())){
                kolcsonzottKonyvek[i]=null;
                konyv.setKolcsonozheto(true);
            }
        }

    }

    @Override
    public String toString() {
        return "Olvaso{" +
                "azonosito='" + azonosito + '\'' +
                ", nev='" + nev + '\'' +
                ", email='" + email + '\'' +
                ", kolcsonzottKonyvek=" + Arrays.toString(kolcsonzottKonyvek) +
                '}';
    }
}
