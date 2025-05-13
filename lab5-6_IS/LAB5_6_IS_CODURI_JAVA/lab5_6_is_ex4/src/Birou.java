import java.util.*;
public class Birou {
    private Boolean esteSediulCentral;

    public Birou(Boolean esteSediulCentral) {
        this.esteSediulCentral = esteSediulCentral;
    }

    public Boolean getEsteSediulCentral() {
        return esteSediulCentral;
    }

    public void setEsteSediulCentral(Boolean esteSediulCentral) {
        this.esteSediulCentral = esteSediulCentral;
    }

    @Override
    public String toString() {
        return "Birou{" +
                "esteSediulCentral=" + esteSediulCentral +
                '}';
    }

}
