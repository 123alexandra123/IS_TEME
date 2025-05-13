import java.util.ArrayList;
import java.util.List;

public class Persoana {
    private String nume;
    private List<Persoana> parinti;
    private List<Persoana> copii;

    public Persoana(String nume) {
        this.nume = nume;
        this.parinti = new ArrayList<>();
        this.copii = new ArrayList<>();
    }

    public void adaugaParinte(Persoana parinte) {
        if (!parinti.contains(parinte)) {
            parinti.add(parinte);
            parinte.adaugaCopil(this);
        }
    }

    public void adaugaCopil(Persoana copil) {
        if (!copii.contains(copil)) {
            copii.add(copil);
            copil.adaugaParinte(this);
        }
    }

    public String getNume() {
        return nume;
    }

    public List<Persoana> getParinti() {
        return parinti;
    }

    public List<Persoana> getCopii() {
        return copii;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persoana: ").append(nume);
        sb.append("\nPărinți: ");
        for (Persoana p : parinti) {
            sb.append(p.getNume()).append(" ");
        }
        sb.append("\nCopii: ");
        for (Persoana c : copii) {
            sb.append(c.getNume()).append(" ");
        }
        return sb.toString();
    }

}
