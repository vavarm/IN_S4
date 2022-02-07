package tp2.etudiant;

public class Main {
    public static void main(String[] args) {
        // TODO create objects and print their attributes
        Nationality cp = Nationality.ETRANGER_FRANCOPHONE;
        Etudiant et1 = new Etudiant("Dubois", 2002, true, cp);
        System.out.println(et1.toString());
    }
}
