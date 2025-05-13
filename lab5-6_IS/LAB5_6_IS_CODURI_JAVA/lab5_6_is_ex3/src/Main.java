//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Persoana ion = new Persoana("Ion");
        Persoana maria = new Persoana("Maria");
        Persoana vasile = new Persoana("Vasile");
        Persoana elena = new Persoana("Elena");
        Persoana gheorghe = new Persoana("Gheorghe");
        Persoana ana = new Persoana("Ana");

        ion.adaugaCopil(maria);
        ion.adaugaCopil(vasile);
        ion.adaugaCopil(elena);
        ion.adaugaParinte(gheorghe);
        ion.adaugaParinte(ana);

        System.out.println(ion);


        }
}
