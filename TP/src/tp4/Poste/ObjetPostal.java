package tp4.Poste;

public abstract class ObjetPostal {

    private String origine;
    private String destination;
    private String codePostal;
    private double poids;
    private double volume;
    private TauxRecommandation tauxRecommandation;

    public ObjetPostal() {
    }

    public ObjetPostal(String origine, String destination, String codePostal, double poids, double volume,
            TauxRecommandation tauxRecommandation) {
        setOrigine(origine);
        setDestination(destination);
        setCodePostal(codePostal);
        setPoids(poids);
        setVolume(volume);
        setTauxRecommandation(tauxRecommandation);
    }

    /**
     * @return String return the origine
     */
    public String getOrigine() {
        return origine;
    }

    /**
     * @param origine the origine to set
     */
    public void setOrigine(String origine) {
        this.origine = origine;
    }

    /**
     * @return String return the destination
     */
    public String getDestination() {
        return destination;
    }

    /**
     * @param destination the destination to set
     */
    public void setDestination(String destination) {
        this.destination = destination;
    }

    /**
     * @return String return the codePostal
     */
    public String getCodePostal() {
        return codePostal;
    }

    /**
     * @param codePostal the codePostal to set
     */
    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    /**
     * @return double return the poids
     */
    public double getPoids() {
        return poids;
    }

    /**
     * @param poids the poids to set
     */
    public void setPoids(double poids) {
        if (poids > 0)
            this.poids = poids;
        else
            System.err.println("La valeur de poids doit être positive");
    }

    /**
     * @return double return the volume
     */
    public double getVolume() {
        return volume;
    }

    /**
     * @param volume the volume to set
     */
    public void setVolume(double volume) {
        this.volume = volume;
    }

    /**
     * @return TauxRecommandation return the tauxRecommandation
     */
    public TauxRecommandation getTauxRecommandation() {
        return tauxRecommandation;
    }

    /**
     * @param tauxRecommandation the tauxRecommandation to set
     */
    public void setTauxRecommandation(TauxRecommandation tauxRecommandation) {
        this.tauxRecommandation = tauxRecommandation;
    }

    public abstract double TarifAffranchissement();

    public abstract double TarifRemboursement();

    @Override
    public String toString() {
        return getCodePostal() + "/" + getDestination() + "/" + getTauxRecommandation();
    }

}
