package tp8;

public class BilletTrain implements IBilletTrain {
    // attributes
    private int dateHeure;
    private String origine;
    private String destination;
    private TypeTarif typeTarif;
    private double prix;

    // constructors
    public BilletTrain() {
    }

    public BilletTrain(int dateHeure, String origine, String destination, TypeTarif typeTarif, double prix) {
        setDateHeure(dateHeure);
        setOrigine(origine);
        setDestination(destination);
        setTypeTarif(typeTarif);
        setPrix(prix);
    }

    // methods
    /**
     * @return int return the dateHeure
     */
    public int getDateHeure() {
        return dateHeure;
    }

    /**
     * @param dateHeure the dateHeure to set
     */
    public void setDateHeure(int dateHeure) {
        this.dateHeure = dateHeure;
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
     * @return TypeTarif return the typeTarif
     */
    public TypeTarif getTypeTarif() {
        return typeTarif;
    }

    /**
     * @param typeTarif the typeTarif to set
     */
    public void setTypeTarif(TypeTarif typeTarif) {
        this.typeTarif = typeTarif;
    }

    /**
     * @return double return the prix
     */
    public double getPrix() {
        return prix;
    }

    /**
     * @param prix the prix to set
     */
    public void setPrix(double prix) {
        this.prix = prix;
    }

}
