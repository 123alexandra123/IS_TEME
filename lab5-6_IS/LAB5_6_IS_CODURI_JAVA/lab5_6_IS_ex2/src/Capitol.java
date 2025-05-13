import java.util.*;

public class Capitol extends DateGenerale{
    private String rezumat;
    private List<Sectiune> sectiuni;

    public Capitol(String titlu, String numar, String rezumat, List<Sectiune> sectiuni){
        super(titlu, numar);
        this.rezumat = rezumat;
        this.sectiuni = new ArrayList<>();
    }

    public String getRezumat(){
        return rezumat;
    }

    public void setRezumat(String rezumat){
        this.rezumat = rezumat;
    }

    public List<Sectiune> getSectiuni(){
        return sectiuni;
    }

    public void setSectiuni(List<Sectiune> sectiuni){
        this.sectiuni = sectiuni;
    }

    public void addSectiune(Sectiune sectiune){
        sectiuni.add(sectiune);
    }

    @Override
    public String toString(){
        return "Capitol{" +
                "titlu='" + getTitlu() + '\'' +
                ", numar='" + getNumar() + '\'' +
                ", rezumat='" + rezumat + '\'' +
                ", sectiuni=" + sectiuni +
                '}';
    }
}
