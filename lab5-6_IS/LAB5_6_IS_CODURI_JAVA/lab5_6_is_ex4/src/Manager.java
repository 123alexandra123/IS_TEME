import java.util.*;

public class Manager extends Angajat{
    private List<Angajat> echipaManager;
    private String dataDeCandEManager;

    public Manager(String nume, String prenume, String dataNastere, String dataAngajare, List<Angajat> echipaManager, String dataDeCandEManager) {
        super(nume, prenume, dataNastere, dataAngajare);
        this.echipaManager = echipaManager;
        this.dataDeCandEManager = dataDeCandEManager;
    }

    public List<Angajat> getEchipaManager() {
        return echipaManager;
    }

    public void setEchipaManager(List<Angajat> echipaManager) {
        this.echipaManager = echipaManager;
    }

    public String getDataDeCandEManager() {
        return dataDeCandEManager;
    }

    public void setDataDeCandEManager(String dataDeCandEManager) {
        this.dataDeCandEManager = dataDeCandEManager;
    }

    @Override
    public String toString() {
        return "Manager{" +
               "nume: " + getNume() + ", " +
                "prenume: " + getPrenume() + ", " +
                "dataNastere: " + getDataNastere() + ", " +
                "dataAngajare: " + getDataAngajare() + ", " +
                "echipaManager: " + echipaManager + ", " +
                "dataDeCandEManager: " + dataDeCandEManager +
                '}';
    }

}
