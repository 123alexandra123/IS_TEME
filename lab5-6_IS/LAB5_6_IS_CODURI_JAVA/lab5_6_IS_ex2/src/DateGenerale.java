import java.util.*;

public abstract class DateGenerale {
    private String titlu;
    private String numar;

    public DateGenerale(String titlu, String numar) {
        this.titlu = titlu;
        this.numar = numar;
    }

    public String getTitlu() {
        return titlu;
    }

    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }

    public String getNumar() {
        return numar;
    }

    public void setNumar(String numar) {
        this.numar = numar;
    }

    @Override
    public String toString() {
        return "DateGenerale{" +
                "titlu='" + titlu + '\'' +
                ", numar='" + numar + '\'' +
                '}';
    }

}
