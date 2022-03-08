package tp3.Poste;

import java.time.LocalDateTime;

public class ColisExpress extends Colis {
    private final LocalDateTime dateEnvoi;
    private int numero;
    private Boolean estEmballe;
    private static int nombreColisExpress = 0;

    public ColisExpress() {
        super();
        this.dateEnvoi = LocalDateTime.now();
        nombreColisExpress += 1;
        numero = nombreColisExpress;
    }

    public ColisExpress(String origine, String destination, String codePostal, double poids, double volume,
            TauxRecommandation tauxRecommandation, String contenu, double valeurDeclaree,
            Boolean estEmballe) {
        super(origine, destination, codePostal, poids, volume,
                tauxRecommandation, contenu, valeurDeclaree);
        this.dateEnvoi = LocalDateTime.now();
        nombreColisExpress += 1;
        numero = nombreColisExpress;
        setEstEmballe(estEmballe);
    }

    public LocalDateTime getDateEnvoi() {
        return this.dateEnvoi;
    }

    /**
     * @return int return the numero
     */
    public int getNumero() {
        return this.numero;
    }

    /**
     * @return Boolean return the estEmballe
     */
    public Boolean isEstEmballe() {
        return estEmballe;
    }

    /**
     * @param estEmballe the estEmballe to set
     */
    public void setEstEmballe(Boolean estEmballe) {
        this.estEmballe = estEmballe;
    }

    @Override
    public void setPoids(double poids) {
        if (poids < 30)
            super.setPoids(poids);
        else {
            System.err.println("La valeur de poids entrée est trop élevée (>=30)");
        }
    }

    @Override
    public double TarifAffranchissement() {
        double tarif = 30;
        if (isEstEmballe())
            tarif += 3;
        return tarif;
    }

    @Override
    public String toString() {
        return super.toString() + "/" + getPoids() + "/" + getNumero();
    }

}
