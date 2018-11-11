package ba.unsa.etf.rpr.t4;

import java.util.Set;

public class PlanStudija {
    private int brojGodinaStudiranja;
    private int trenutnaGodina;
    private int trenutniCiklus;
    private Set<Predmet> obavezniPredmeti;
    private Set<Predmet> izborniPredmeti;
    private Set<Predmet> polozeniPredmeti;

    public PlanStudija(int brojGodinaStudiranja, int trenutnaGodina, int trenutniCiklus, Set<Predmet> obavezniPredmeti, Set<Predmet> izborniPredmeti) {
        this.trenutnaGodina = trenutnaGodina;
        this.trenutniCiklus = trenutniCiklus;
        this.obavezniPredmeti = obavezniPredmeti;
        this.izborniPredmeti = izborniPredmeti;
        this.brojGodinaStudiranja = brojGodinaStudiranja;
    }

    public int getBrojGodinaStudiranja() {
        return brojGodinaStudiranja;
    }

    public void setBrojGodinaStudiranja(int brojGodinaStudiranja) {
        this.brojGodinaStudiranja = brojGodinaStudiranja;
    }

    public Set<Predmet> getPolozeniPredmeti() {
        return polozeniPredmeti;
    }

    public void setPolozeniPredmeti(Set<Predmet> polozeniPredmeti) {
        this.polozeniPredmeti = polozeniPredmeti;
    }

    public int getTrenutnaGodina() {
        return trenutnaGodina;
    }

    public void setTrenutnaGodina(int trenutnaGodina) {
        this.trenutnaGodina = trenutnaGodina;
    }

    public int getTrenutniCiklus() {
        return trenutniCiklus;
    }

    public void setTrenutniCiklus(int trenutniCiklus) {
        this.trenutniCiklus = trenutniCiklus;
    }

    public Set<Predmet> getObavezniPredmeti() {
        return obavezniPredmeti;
    }

    public void setObavezniPredmeti(Set<Predmet> obavezniPredmeti) {
        this.obavezniPredmeti = obavezniPredmeti;
    }

    public Set<Predmet> getIzborniPredmeti() {
        return izborniPredmeti;
    }

    public void setIzborniPredmeti(Set<Predmet> izborniPredmeti) {
        this.izborniPredmeti = izborniPredmeti;
    }

    public void dodajIzborniPredmet(Predmet izborniPredmet) throws IllegalArgumentException {
        for(Predmet x : izborniPredmeti) {
            if(x.getNazivPredmeta().equals(izborniPredmet.getNazivPredmeta())) throw new IllegalArgumentException("Predmet vec postoji!");
        }
        izborniPredmeti.add(izborniPredmet);
    }

    public void dodajObavezniPredmet(Predmet obavezniPredmet) throws IllegalArgumentException {
        for(Predmet x : obavezniPredmeti) {
            if(x.getNazivPredmeta().equals(obavezniPredmet.getNazivPredmeta())) throw new IllegalArgumentException("Predmet vec postoji!");
        }
        izborniPredmeti.add(obavezniPredmet);
    }

    public void upisiNaSljSemestar() throws IllegalAccessError {
        int ectsKrediti = 0;
        for(Predmet x : polozeniPredmeti) {
            if(x.getGodina() == trenutnaGodina) ectsKrediti += x.getECTS();
        }
        if(ectsKrediti != 60) throw new IllegalAccessError("Ne moze se upisati na slj godinu!");
        if(trenutnaGodina == brojGodinaStudiranja) throw new IllegalAccessError("Student je zavrsio " + trenutniCiklus + ". ciklus!");
        trenutnaGodina++;
    }

    public void upisiNaSljCiklus() throws IllegalAccessError {
        int ectsKrediti = 0;
        for(Predmet x : polozeniPredmeti) {
            ectsKrediti += x.getECTS();
        }
        if(ectsKrediti % brojGodinaStudiranja != 0) throw new IllegalAccessError("Ne moze se upisati na slj ciklus!");
        if(trenutniCiklus == 3) throw new IllegalAccessError("Student je vec Doktorirao");
        trenutniCiklus++;
    }

}
