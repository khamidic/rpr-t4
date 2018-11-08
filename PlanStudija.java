package ba.unsa.etf.rpr.t4;

public class PlanStudija {
    private int trenutniSemestar;
    private Predmet[] obavezniPredmeti;
    private Predmet[] izborniPredmeti;

    public PlanStudija(int trenutniSemestar, Predmet[] obavezniPredmeti, Predmet[] izborniPredmeti) {
        this.trenutniSemestar = trenutniSemestar;
        this.obavezniPredmeti = obavezniPredmeti;
        this.izborniPredmeti = izborniPredmeti;
    }

    public int getTrenutniSemestar() {
        return trenutniSemestar;
    }

    public void setTrenutniSemestar(int trenutniSemestar) {
        this.trenutniSemestar = trenutniSemestar;
    }

    public Predmet[] getObavezniPredmeti() {
        return obavezniPredmeti;
    }

    public void setObavezniPredmeti(Predmet[] obavezniPredmeti) {
        this.obavezniPredmeti = obavezniPredmeti;
    }

    public Predmet[] getIzborniPredmeti() {
        return izborniPredmeti;
    }

    public void setIzborniPredmeti(Predmet[] izborniPredmeti) {
        this.izborniPredmeti = izborniPredmeti;
    }
}
