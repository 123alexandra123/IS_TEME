import java.util.*;

public class Main {
    public static void main(String[] args) {

        Sectiune s1 = new Sectiune("Sectiune 1", "1");
        Sectiune s2 = new Sectiune("Sectiune 2", "2");
        Sectiune s3 = new Sectiune("Sectiune 3", "3");

        List<Sectiune> sectuni1 = new ArrayList<>();
        List<Sectiune> sectuni2 = new ArrayList<>();
        List<Sectiune> sectuni3 = new ArrayList<>();


        Capitol capitol = new Capitol("Capitol 1", "1", "Rezumat Capitol 1", sectuni1);
        capitol.addSectiune(s1);
        capitol.addSectiune(s2);

        Capitol capitol2 = new Capitol("Capitol 2", "2", "Rezumat Capitol 2", sectuni2);
        capitol2.addSectiune(s3);

        Capitol capitol3 = new Capitol("Capitol 3", "3", "Rezumat Capitol 3", sectuni3);
        capitol3.addSectiune(s1);

        List<Capitol> capitole = new ArrayList<>();
        Parte parte = new Parte("Parte 1", "1", capitole);
        parte.addCapitol(capitol);
        parte.addCapitol(capitol2);

        List<Capitol> capitole2 = new ArrayList<>();
        Parte parte2 = new Parte("Parte 2", "2", capitole2);
        parte2.addCapitol(capitol3);

        List<Parte> parti = new ArrayList<>();
        Carte carte = new Carte(1, "2021", "ISBN 1234", parti);

        carte.addParte(parte);
        carte.addParte(parte2);

        System.out.println(carte);

    }
}