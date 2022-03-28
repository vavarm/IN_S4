package tp5.Promotion;

public class TestPromotion {
    public static void main(String[] args) {
        /*
         * Pour une forme de constructeur Etudiant(String nom, int anneeNaiss,
         * Nationalite nationalite,
         * double note1, double note2, double note3)
         */
        Etudiant e1 = new Etudiant("Marie", 1998, Nationalite.FRANCAIS, 18, 18, 18);
        // System.out.println(e1);
        Etudiant e2 = new Etudiant("Jeanne", 1998, Nationalite.FRANCAIS, 14, 9, 16);
        // System.out.println(e2);
        Etudiant e3 = new Etudiant("Sylvie", 1998, Nationalite.FRANCAIS, 7, 9, 10);
        // System.out.println(e3);
        Etudiant e4 = new Etudiant("Esther", 1998, Nationalite.FRANCAIS, 7, 9, 5);
        // System.out.println(e4);
        Etudiant e5 = new Etudiant("Astrid", 1998, Nationalite.FRANCAIS, 10, 10, 0);
        // System.out.println(e5);
        Etudiant e6 = new Etudiant("Mohamed", 1998, Nationalite.ETRANGER_NON_FRANCOPHONE, 18, 18, 1);
        // System.out.println(e6);
        Etudiant e7 = new Etudiant("Bjorg", 1998, Nationalite.ETRANGER_NON_FRANCOPHONE, 18, 18, 18);
        // System.out.println(e7);
        Promotion p = new Promotion("groupe PEIP", 2022);

        p.inscrire(e1);
        p.inscrire(e2);
        p.inscrire(e3);
        p.inscrire(e6);
        p.inscrire(e7);
        System.out.println("\n");
        p.afficheResultat();
        System.out.println("\n");

        System.out.println("=====Moyenne Générale=====");
        System.out.println(p.moyenneGenerale());

        System.out.println("=====Recherche par nom=====");
        System.out.println(p.recherche(e1.getName()));

        System.out.println("\n");
        System.out.println("=====ADMIS=====");
        for (Etudiant etudiant : p.admis()) {
            System.out.println(etudiant);
            if (p.admis().indexOf(etudiant) < p.admis().size() - 1)
                System.out.println("\n");
        }
        System.out.println("==========");

        System.out.println("\n");
        System.out.println("=====Etrangers non francophones=====");
        for (Etudiant etudiant : p.etuEtrangernonFranco()) {
            System.out.println(etudiant);
            if (p.etuEtrangernonFranco().indexOf(etudiant) < p.etuEtrangernonFranco().size() - 1)
                System.out.println("\n");
        }
        System.out.println("==========");

        System.out.println("\n");
        System.out.println("=====Majors=====");
        for (Etudiant etudiant : p.majors()) {
            System.out.println(etudiant);
            if (p.majors().indexOf(etudiant) < p.majors().size() - 1)
                System.out.println("\n");
        }
        System.out.println("==========");

        System.out.println("\n");
        System.out.println("=====Three majors=====");
        for (Etudiant etudiant : p.threeMajors()) {
            System.out.println(etudiant);
            if (p.threeMajors().indexOf(etudiant) < p.threeMajors().size() - 1)
                System.out.println("\n");
        }
        System.out.println("==========");

    }
}