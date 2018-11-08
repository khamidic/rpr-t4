package ba.unsa.etf.rpr.t4;

public class Semestar {
    private int ciklus;
    private int semestar;
    private int brojPredmeta;
    private Predmet[] obavezniPredmeti;
    private Predmet[] izbroniPredmeti;

    public Semestar(int ciklus, int semestar, int brojPredmeta, Predmet[] obavezniPredmeti, Predmet[] izbroniPredmeti) {
        this.ciklus = ciklus;
        this.semestar = semestar;
        this.brojPredmeta = brojPredmeta;
        this.obavezniPredmeti = obavezniPredmeti;
        this.izbroniPredmeti = izbroniPredmeti;
    }

    public int getCiklus() {
        return ciklus;
    }

    public void setCiklus(int ciklus) {
        this.ciklus = ciklus;
    }

    public int getSemestar() {
        return semestar;
    }

    public void setSemestar(int semestar) {
        this.semestar = semestar;
    }

    public int getBrojPredmeta() {
        return brojPredmeta;
    }

    public void setBrojPredmeta(int brojPredmeta) {
        this.brojPredmeta = brojPredmeta;
    }

    public Predmet[] getObavezniPredmeti() {
        return obavezniPredmeti;
    }

    public void setObavezniPredmeti(Predmet[] obavezniPredmeti) {
        this.obavezniPredmeti = obavezniPredmeti;
    }

    public Predmet[] getIzbroniPredmeti() {
        return izbroniPredmeti;
    }

    public void setIzbroniPredmeti(Predmet[] izbroniPredmeti) {
        this.izbroniPredmeti = izbroniPredmeti;
    }

    public void dodajIzborni(Predmet izborni) {}

    public void dodajIzborne(Predmet izborni[]) {}

    public void dodajObavezni(Predmet obavezni) {}

    public void dodajObavezne(Predmet obavezni[]) {}
}
