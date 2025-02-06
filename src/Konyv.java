public class Konyv {
    private String azonosito;
    private String cim;
    private String szerzo;
    private int kiadasEve;
    private boolean kolcsonozheto;

    public Konyv(String azonosito, String cim, String szerzo, int kiadasEve, boolean kolcsonozheto) {
        this.azonosito = azonosito;
        this.cim = cim;
        this.szerzo = szerzo;
        this.kiadasEve = kiadasEve;
        this.kolcsonozheto = kolcsonozheto;
    }

    public String getAzonosito() {
        return azonosito;
    }

    public void setAzonosito(String azonosito) {
        this.azonosito = azonosito;
    }

    public String getCim() {
        return cim;
    }

    public void setCim(String cim) {
        this.cim = cim;
    }

    public String getSzerzo() {
        return szerzo;
    }

    public void setSzerzo(String szerzo) {
        this.szerzo = szerzo;
    }

    public int getKiadasEve() {
        return kiadasEve;
    }

    public void setKiadasEve(int kiadasEve) {
        this.kiadasEve = kiadasEve;
    }

    public boolean isKolcsonozheto() {
        return kolcsonozheto;
    }

    public void setKolcsonozheto(boolean kolcsonozheto) {
        this.kolcsonozheto = kolcsonozheto;
    }

    @Override
    public String toString() {
        return "Konyv{" +
                "azonosito='" + azonosito + '\'' +
                ", cim='" + cim + '\'' +
                ", szerzo='" + szerzo + '\'' +
                ", kiadasEve=" + kiadasEve +
                ", kolcsonozheto=" + kolcsonozheto +
                '}';
    }
}
