import java.util.*;

public class Sectiune extends DateGenerale{

    public Sectiune(String titlu, String numar) {
        super(titlu, numar);
    }

    @Override
    public String toString() {
        return "Sectiune{" +
                "titlu='" + getTitlu() + '\'' +
                ", numar='" + getNumar() + '\'' +
                '}';
    }
}
