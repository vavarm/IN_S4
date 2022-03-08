package tp3.Poste;

public class Lettre extends ObjetPostal {

    private Boolean estUrgent;

    public Lettre() {
        super();
    }

    public Lettre(String origine, String destination, String codePostal, double poids, double volume,
            TauxRecommandation tauxRecommandation, Boolean estUrgent) {
        super(origine, destination, codePostal, poids, volume,
                tauxRecommandation);
        setEstUrgent(estUrgent);
    }

    /**
     * @return Boolean return the estUrgent
     */
    public Boolean isEstUrgent() {
        return estUrgent;
    }

    /**
     * @param estUrgent the estUrgent to set
     */
    public void setEstUrgent(Boolean estUrgent) {
        this.estUrgent = estUrgent;
    }

    @Override
    public double TarifAffranchissement() {
        double tarifAjout = 0;
        if (this.getTauxRecommandation() == TauxRecommandation.UN)
            tarifAjout += 0.5;
        else if (this.getTauxRecommandation() == TauxRecommandation.DEUX)
            tarifAjout += 1.5;
        if (this.isEstUrgent())
            tarifAjout += 0.3;
        return 0.5 + tarifAjout;
    }

    @Override
    public double TarifRemboursement() {
        double tarif = 0;
        if (this.getTauxRecommandation() == TauxRecommandation.UN)
            tarif += 1.5;
        else if (this.getTauxRecommandation() == TauxRecommandation.DEUX)
            tarif += 15;
        return tarif;
    }

    @Override
    public String toString() {
        String urgence = "ordinaire";
        if (isEstUrgent())
            urgence = "urgent";
        return super.toString() + "/" + urgence;
    }

}
