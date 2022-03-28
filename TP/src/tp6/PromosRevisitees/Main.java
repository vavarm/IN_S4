package tp6.PromosRevisitees;

public class Main {
    public static void main(String[] args) {
        Etudiant e1 = new Etudiant(2354, "John", 1990, Nationalite.ETRANGER_FRANCOPHONE, 4, 20, 19);
        Etudiant e2 = new Etudiant(2954, "Camille", 1992, Nationalite.FRANCAIS, 16, 9, 14);
        Promotion p1 = new Promotion("PeiPA", 2008);
        p1.inscrire(e1);
        p1.inscrire(e2);

        System.out.println(p1.moyenneGenerale());
        p1.afficheResultat();
        System.out.println(p1.getEtudiants().get(2954).getName());
    }
}