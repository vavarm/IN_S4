package tp4.Poste;

public class Main {
    public void main(String[] args) {
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
    }
}
