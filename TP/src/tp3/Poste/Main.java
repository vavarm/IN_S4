package tp3.Poste;

public class Main {
    public static void main(String[] args) {
        /*
         * Colis Express code postal/destination/taux de recommandation/volume/valeur d
         * ́eclar ́ee/poids/num ́erode suivi
         * Par exemple :Colis Express 7855/famille Artick, igloo 90, baie des
         * vents/2/0.02/2/20/20160128
         */
        ColisExpress ce1 = new ColisExpress("famille Antartick, igloo 32, mont Azur",
                "famille Artick, igloo 90, baie des vents", "7855", 20, 0.02,
                TauxRecommandation.DEUX, "Boule à neige", 2,
                true);

        System.out.println(ce1.toString());

        ColisExpress ce2 = new ColisExpress("famille Artick, igloo 90, baie des vents",
                "famille Antartick, igloo 32, mont Azur", "9506", 0.1, 0.01,
                TauxRecommandation.ZERO, "crayon à papier", 0.5,
                true);

        System.out.println(ce2.toString());

        ce2.setPoids(-6);

        ce2.setPoids(400);

        System.out.println(ce2.toString());

    }
}
