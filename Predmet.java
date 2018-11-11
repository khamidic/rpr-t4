package ba.unsa.etf.rpr.t4;

import java.util.Set;

public class Predmet {
    private String nazivPredmeta;
    private int ECTS;
    private int ciklus;
    private int godina;
    private String zaduzeniProfesor;
    private int brojStudenata;
    private Set<Student> studenti;

    public Predmet(String nazivPredmeta, int ECTS, int ciklus, int godina, String zaduzeniProfesor, int brojStudenata, Set<Student> studenti) {
        this.nazivPredmeta = nazivPredmeta;
        this.ECTS = ECTS;
        this.ciklus = ciklus;
        this.godina = godina;
        this.zaduzeniProfesor = zaduzeniProfesor;
        this.brojStudenata = brojStudenata;
        this.studenti = studenti;
    }

    public int getCiklus() {
        return ciklus;
    }

    public void setCiklus(int ciklus) throws IllegalArgumentException {
        if(ciklus > 3) throw new IllegalArgumentException("Nije ispravan ciklus!");
        this.ciklus = ciklus;
    }

    public int getGodina() {
        return godina;
    }

    public void setGodina(int godina) throws IllegalArgumentException {
        this.godina = godina;
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

    public Set<Student> getStudenti() {
        return studenti;
    }

    public void setStudenti(Set<Student> studenti) {
        this.studenti = studenti;
    }

    public void upisiStudenta(Student student) throws IllegalArgumentException {
        for(Student x : studenti) {
            if(x.getBrojIndeksa() == student.getBrojIndeksa()) throw new IllegalArgumentException("Student vec upisan na predmet!");
        }
        studenti.add(student);
    }

    public void upisiStudente(Student[] studentarija) {
        for(int i = 0; i < studentarija.length; i++) {
            if(studenti.contains(studentarija[i])) throw new IllegalArgumentException("Student sa indeksom (" + studentarija[i].getBrojIndeksa() + ") je vec upisan!");
        }
        for(int i = 0; i < studentarija.length; i++) this.studenti.add(studentarija[i]);
    }

}
