package tp1.rectangle;

public class Rectangle {

    public enum Couleur { // énumération des couleurs
        Bleu, Rouge, Vert
    };

    // attributs relatifs aux objets Rectangle
    private int longueur;
    private int largeur;
    private int aire;
    private int perimetre;
    private Couleur couleur = Couleur.Vert;
    private Point2D position;

    // attributs relatifs à la classe Rectangle
    public static final int nbCotes = 4;
    public static final int angleCotes = 90; // en degrés

    Rectangle() { // constructeur par défaut
        position = new Point2D();
        System.out.println("#DEBUG#Rectangle créé par défaut");
    }

    Rectangle(int _longueur, int _largeur, Couleur _couleur, int _posX, int _posY) { // constructeur avec paramètres
        this.longueur = _longueur;
        this.largeur = _largeur;
        this.aire = this.longueur * this.largeur;
        this.perimetre = 2 * (this.longueur + this.largeur);
        this.couleur = _couleur;
        this.position = new Point2D(_posX, _posY);
    }

    public Point2D getPosition() {
        return this.position;
    }

    // méthode qui retourne tous les attributs de l'objet courant afin de les
    // afficher
    public String toString() {
        return "Longueur : " + this.longueur + " Largeur : " + this.largeur + " Aire : " + this.aire
                + " Périmètre : "
                + this.perimetre + " Couleur : " + this.couleur + " " + this.position.toString();
    }

}
