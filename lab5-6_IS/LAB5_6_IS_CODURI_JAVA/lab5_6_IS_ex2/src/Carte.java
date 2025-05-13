import java.util.*;

public class Carte {
    private Integer editor;
    private String dataPublicare;
    private String ISBN;
    private List<Parte> parti;

    public Carte(Integer editor, String dataPublicare, String ISBN, List<Parte> parti) {
        this.editor = editor;
        this.dataPublicare = dataPublicare;
        this.ISBN = ISBN;
        this.parti = new ArrayList<>();
    }

    public Integer getEditor() {
        return editor;
    }

    public void setEditor(Integer editor) {
        this.editor = editor;
    }

    public String getDataPublicare() {
        return dataPublicare;
    }

    public void setDataPublicare(String dataPublicare) {
        this.dataPublicare = dataPublicare;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public List<Parte> getParti() {
        return parti;
    }

    public void setParti(List<Parte> parti) {
        this.parti = parti;
    }

    public void addParte(Parte parte) {
        parti.add(parte);
    }

    @Override
    public String toString() {
        return "Carte{" +
                "editor=" + editor +
                ", dataPublicare='" + dataPublicare + '\'' +
                ", ISBN='" + ISBN + '\'' +
                ", parti=" + parti +
                '}';
    }


}
