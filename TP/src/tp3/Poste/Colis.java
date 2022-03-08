package tp3.Poste;

public class Colis extends ObjetPostal {
    private String contenu;
    private double valeurDeclaree;

    public Colis() {
        super();
    }

    public Colis(String origine, String destination, String codePostal, double poids, double volume,
            TauxRecommandation tauxRecommandation, String contenu, double valeurDeclaree) {
        super(origine, destination, codePostal, poids, volume,
                tauxRecommandation);
        setContenu(contenu);
        setValeurDeclaree(valeurDeclaree);
    }

    /**
     * @return String return the contenu
     */
    public String getContenu() {
        return contenu;
    }

    /**
     * @param contenu the contenu to set
     */
    public void setContenu(String contenu) {
        this.contenu = contenu;
    }

    /**
     * @return double return the valeurDeclaree
     */
    public double getValeurDeclaree() {
        return valeurDeclaree;
    }

    /**
     * @param valeurDeclaree the valeurDeclaree to set
     */
    public void setValeurDeclaree(double valeurDeclaree) {
        this.valeurDeclaree = valeurDeclaree;
    }

    @Override
    public double TarifAffranchissement() {
        double tarifAjout = 0;
        if (this.getTauxRecommandation() == TauxRecommandation.UN)
            tarifAjout += 0.5;
        else if (this.getTauxRecommandation() == TauxRecommandation.DEUX)
            tarifAjout += 1.5;
        if (this.getVolume() > 1 / 8)
            tarifAjout += 3; // surtaxe
        return 2 + tarifAjout;
    }

    @Override
    public double TarifRemboursement() {
        double pourcentage = 0;
        if (this.getTauxRecommandation() == TauxRecommandation.UN)
            pourcentage = 0.1; // 10%
        else if (this.getTauxRecommandation() == TauxRecommandation.DEUX)
            pourcentage = 0.5; // 50%
        return this.getValeurDeclaree() * pourcentage;
    }

    @Override
    public String toString() {
        return super.toString() + "/" + getVolume() + "/" + getValeurDeclaree();
    }

}
