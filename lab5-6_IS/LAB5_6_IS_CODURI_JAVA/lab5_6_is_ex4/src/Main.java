//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;

public class Main {
    public static void main(String[] args) {


        Angajat angajat1 = new Angajat("Popescu", "Ion", "01.01.1990", "01.01.2010");
        Angajat angajat2 = new Angajat("Ionescu", "Maria", "01.01.1995", "01.01.2015");
        Angajat angajat3 = new Angajat("Georgescu", "Vasile", "01.01.1985", "01.01.2005");
        Angajat angajat4 = new Angajat("Dumitrescu", "Andrei", "01.01.1992", "01.01.2012");
        Angajat angajat5 = new Angajat("Constantinescu", "Mihai", "01.01.1993", "01.01.2013");
        Angajat angajat6 = new Angajat("Stoica", "Cristina", "01.01.1994", "01.01.2014");
        Angajat angajat7 = new Angajat("Dumitru", "Andreea", "01.01.1996", "01.01.2016");
        Angajat angajat8 = new Angajat("Iancu", "Marian", "01.01.1997", "01.01.2017");
        Angajat angajat9 = new Angajat("Munteanu", "Mihail", "01.01.1998", "01.01.2018");
        Angajat angajat10 = new Angajat("Dinu", "Diana", "01.01.1999", "01.01.2019");

        List<Angajat> echipaManager1 = new ArrayList<>();
        echipaManager1.add(angajat4);
        echipaManager1.add(angajat5);
        echipaManager1.add(angajat6);

        List<Angajat> echipaManager2 = new ArrayList<>();
        echipaManager2.add(angajat7);
        echipaManager2.add(angajat8);

        List<Angajat> echipaManager3 = new ArrayList<>();
        echipaManager3.add(angajat9);
        echipaManager3.add(angajat10);



        Manager manager1 = new Manager("Popescu", "Ion", "01.01.1990", "01.01.2010", echipaManager1, "01.01.2010");
        Manager manager2 = new Manager("Ionescu", "Maria", "01.01.1995", "01.01.2015", echipaManager2, "01.01.2015");
        Manager manager3 = new Manager("Georgescu", "Vasile", "01.01.1985", "01.01.2005", echipaManager3, "01.01.2005");


        Birou birou1 = new Birou(true);
        Birou birou2 = new Birou(false);
        Birou birou3 = new Birou(false);


        List<Birou> birouri1 = new ArrayList<>();
        birouri1.add(birou1);
        birouri1.add(birou2);

        List<Birou> birouri2 = new ArrayList<>();
        birouri2.add(birou3);

        List<Angajat> angajati1 = new ArrayList<>();
        angajati1.add(angajat1);
        angajati1.add(angajat2);

        List<Angajat> angajati2 = new ArrayList<>();
        angajati2.add(angajat3);

        Departament departament1 = new Departament("IT", manager1, birouri1, angajati1);
        Departament departament2 = new Departament("HR", manager2, birouri2, angajati2);


        List<Departament> departamente = new ArrayList<>();
        departamente.add(departament1);
        departamente.add(departament2);

        Companie companie = new Companie("Companie1", manager3, "01.01.2000", departamente);

        System.out.println(companie);
    }
}