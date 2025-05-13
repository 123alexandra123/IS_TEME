import java.util.*;

public class Companie {

    private String nume;
    private Manager seful;
    private String dataInfiintarii;
    private List<Departament> departamente;

    public Companie(String nume, Manager seful, String dataInfiintarii, List<Departament> departamente) {
        this.nume = nume;
        this.seful = seful;
        this.dataInfiintarii = dataInfiintarii;
        this.departamente = departamente;
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

    public String getDataInfiintarii() {
        return dataInfiintarii;
    }

    public void setDataInfiintarii(String dataInfiintarii) {
        this.dataInfiintarii = dataInfiintarii;
    }

    public List<Departament> getDepartamente() {
        return departamente;
    }

    public void setDepartamente(List<Departament> departamente) {
        this.departamente = departamente;
    }

    @Override
    public String toString() {
        return "Companie{" +
                "nume='" + nume + '\'' +
                ", seful=" + seful +
                ", dataInfiintarii='" + dataInfiintarii + '\'' +
                ", departamente=" + departamente +
                '}';
    }
}
