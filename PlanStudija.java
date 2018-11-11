package ba.unsa.etf.rpr.t4;

import java.util.Set;

public class PlanStudija {
    private int trenutniSemestar;
    private int trenutnaGodina;
    private int trenutniCiklus;
    private Set<String> obavezniPredmeti;
    private Set<String> izborniPredmeti;

    public PlanStudija(int trenutniSemestar, int trenutnaGodina, int trenutniCiklus, Set<String> obavezniPredmeti, Set<String> izborniPredmeti) {
        this.trenutniSemestar = trenutniSemestar;
        this.trenutnaGodina = trenutnaGodina;
        this.trenutniCiklus = trenutniCiklus;
        this.obavezniPredmeti = obavezniPredmeti;
        this.izborniPredmeti = izborniPredmeti;
    }

    public int getTrenutnaGodina() {
        return trenutnaGodina;
    }

    public void setTrenutnaGodina(int trenutnaGodina) {
        this.trenutnaGodina = trenutnaGodina;
    }

    public int getTrenutniSemestar() {
        return trenutniSemestar;
    }

    public void setTrenutniSemestar(int trenutniSemestar) {
        this.trenutniSemestar = trenutniSemestar;
    }

    public int getTrenutniCiklus() {
        return trenutniCiklus;
    }

    public void setTrenutniCiklus(int trenutniCiklus) {
        this.trenutniCiklus = trenutniCiklus;
    }

    public Set<String> getObavezniPredmeti() {
        return obavezniPredmeti;
    }

    public void setObavezniPredmeti(Set<String> obavezniPredmeti) {
        this.obavezniPredmeti = obavezniPredmeti;
    }

    public Set<String> getIzborniPredmeti() {
        return izborniPredmeti;
    }

    public void setIzborniPredmeti(Set<String> izborniPredmeti) {
        this.izborniPredmeti = izborniPredmeti;
    }

    public void dodajIzborniPredmet(String izborniPredmet) throws IllegalArgumentException {
        for(String x : izborniPredmeti) {
            if(x.equals(izborniPredmet)) throw new IllegalArgumentException("Predmet vec postoji!");
        }
        izborniPredmeti.add(izborniPredmet);
    }

    public void dodajObavezniPredmet(String obavezniPredmet) throws IllegalArgumentException {
        for(String x : obavezniPredmeti) {
            if(x.equals(obavezniPredmet)) throw new IllegalArgumentException("Predmet vec postoji!");
        }
        izborniPredmeti.add(obavezniPredmet);
    }
}
