import java.util.*;
public class Angajat {

    private String nume;
    private String prenume;
    private String dataNastere;
    private String dataAngajare;

    public Angajat(String nume, String prenume, String dataNastere, String dataAngajare) {
        this.nume = nume;
        this.prenume = prenume;
        this.dataNastere = dataNastere;
        this.dataAngajare = dataAngajare;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public String getDataNastere() {
        return dataNastere;
    }

    public void setDataNastere(String dataNastere) {
        this.dataNastere = dataNastere;
    }

    public String getDataAngajare() {
        return dataAngajare;
    }

    public void setDataAngajare(String dataAngajare) {
        this.dataAngajare = dataAngajare;
    }

    @Override
    public String toString() {
        return "Angajat{" +
                "nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                ", dataNastere='" + dataNastere + '\'' +
                ", dataAngajare='" + dataAngajare + '\'' +
                '}';
    }

}
