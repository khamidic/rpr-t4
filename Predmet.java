package ba.unsa.etf.rpr.t4;

public class Predmet {
    private String nazivPredmeta;
    private int ECTS;
    private String zaduzeniProfesor;
    private int brojStudenata;
    private Student[] studenti;

    public Predmet(String nazivPredmeta, int ECTS, String zaduzeniProfesor, int brojStudenata, Student[] studenti) {
        this.nazivPredmeta = nazivPredmeta;
        this.ECTS = ECTS;
        this.zaduzeniProfesor = zaduzeniProfesor;
        this.brojStudenata = brojStudenata;
        this.studenti = studenti;
    }

    public String getNazivPredmeta() {
        return nazivPredmeta;
    }

    public void setNazivPredmeta(String nazivPredmeta) {
        this.nazivPredmeta = nazivPredmeta;
    }

    public int getECTS() {
        return ECTS;
    }

    public void setECTS(int ECTS) {
        this.ECTS = ECTS;
    }

    public String getZaduzeniProfesor() {
        return zaduzeniProfesor;
    }

    public void setZaduzeniProfesor(String zaduzeniProfesor) {
        this.zaduzeniProfesor = zaduzeniProfesor;
    }

    public int getBrojStudenata() {
        return brojStudenata;
    }

    public void setBrojStudenata(int brojStudenata) {
        this.brojStudenata = brojStudenata;
    }

    public Student[] getStudenti() {
        return studenti;
    }

    public void setStudenti(Student[] studenti) {
        this.studenti = studenti;
    }

    public void upisiStudenta(Student student) {}

    public void upisiStudente(Student[] studenti) {}

}
