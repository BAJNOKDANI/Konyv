import java.util.ArrayList;

public class Kolcsonzo {
    ArrayList<Konyv> konyvek=new ArrayList<>();
    ArrayList<Olvaso> olvasok= new ArrayList<>();

    public void konyvHozzaad(Konyv konyv){
        konyvek.add(konyv);
    }
    public void olvasoHozzaad(Olvaso olvaso){
        olvasok.add(olvaso);
    }
    public void konyvKolcsonoz(String konyvAzonosito, String olvasoAzonosito){
        for (int i = 0; i < konyvek.size(); i++) {
            if (konyvek.get(i).getAzonosito().equals(konyvAzonosito)){
                if (konyvek.get(i).isKolcsonozheto()){
                    for (int j = 0; j < olvasok.size(); j++) {
                        if (olvasok.get(j).getAzonosito().equals(olvasoAzonosito)){
                            olvasok.get(j).konyvKolcsonoz(konyvek.get(i));
                        }
                    }
                }
            }
        }
    }
}
