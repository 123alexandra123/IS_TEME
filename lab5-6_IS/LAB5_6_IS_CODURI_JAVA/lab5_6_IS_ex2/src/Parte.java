import java.util.*;

public class Parte extends DateGenerale {
    public List<Capitol> capitole;

    public Parte(String titlu, String numar, List<Capitol> capitole) {
        super(titlu, numar);
        this.capitole = new ArrayList<>();
    }

    public List<Capitol> getCapitole() {
        return capitole;
    }

    public void setCapitole(List<Capitol> capitole) {
        this.capitole = capitole;
    }

    public void addCapitol(Capitol capitol) {
        capitole.add(capitol);
    }

    @Override
    public String toString() {
        return "Parte{" +
                "titlu='" + getTitlu() + '\'' +
                ", numar='" + getNumar() + '\'' +
                ", capitole=" + capitole +
                '}';
    }
}

