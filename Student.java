package ba.unsa.etf.rpr.t4;

import java.util.Date;

public class Student {
    private String ime;
    private String prezime;
    private Date datumRodjenja;
    private int brojIndeksa;
    private PlanStudija planStudija;

    public Student(String ime, String prezime, Date datumRodjenja, int brojIndeksa, PlanStudija planStudija) {}

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public Date getDatumRodjenja() {
        return datumRodjenja;
    }

    public void setDatumRodjenja(Date datumRodjenja) {
        this.datumRodjenja = datumRodjenja;
    }

    public int getBrojIndeksa() {
        return brojIndeksa;
    }

    public void setBrojIndeksa(int brojIndeksa) {
        this.brojIndeksa = brojIndeksa;
    }

    public PlanStudija getPlanStudija() {
        return planStudija;
    }

    public void setPlanStudija(PlanStudija planStudija) {
        this.planStudija = planStudija;
    }

    public boolean jeLiUpisan() {
        return true;
    }
}
