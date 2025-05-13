import java.util.*;
public class Departament {

    private String nume;
    private Manager seful;
    private List<Birou> birouri;
    private List<Angajat> angajati;

    public Departament(String nume, Manager seful, List<Birou> birouri, List<Angajat> angajati) {
        this.nume = nume;
        this.seful = seful;
        this.birouri = birouri;
        this.angajati = angajati;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public Manager getSeful() {
        return seful;
    }

    public void setSeful(Manager seful) {
        this.seful = seful;
    }

    public List<Birou> getBirouri() {
        return birouri;
    }

    public void setBirouri(List<Birou> birouri) {
        this.birouri = birouri;
    }

    public List<Angajat> getAngajati() {
        return angajati;
    }

    public void setAngajati(List<Angajat> angajati) {
        this.angajati = angajati;
    }

    @Override
    public String toString() {
        return "Departament{" +
                "nume='" + nume + '\'' +
                ", seful=" + seful +
                ", birouri=" + birouri +
                ", angajati=" + angajati +
                '}';
    }
}
