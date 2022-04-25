package tp7;

public abstract class Piece {
    private String nom;
    private String reference;
    private double prix;
    private int dureeGarantie;
    private int dureeFabrication;

    public Piece() {
        this.nom = "";
        this.reference = "";
        this.prix = 0.0;
        this.dureeGarantie = 0;
        this.dureeFabrication = 0;
    }

    public Piece(String nom, String reference, double prix, int dureeGarantie, int dureeFabrication) {
        this.nom = nom;
        this.reference = reference;
        this.prix = prix;
        this.dureeGarantie = dureeGarantie;
        this.dureeFabrication = dureeFabrication;
    }
}
