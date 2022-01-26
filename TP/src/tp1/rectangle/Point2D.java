package tp1.rectangle;

public class Point2D {

    // attributs relatifs aux objets point2D
    private int posX = 0;
    private int posY = 0;

    Point2D() { // constructeur par défaut
    }

    Point2D(int _posX, int _posY) { // constructeur avec paramètres
        this.posX = _posX;
        this.posY = _posY;
    }

    // accesseurs
    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosX(int _posX) {
        this.posX = _posX;
    }

    public void setPosY(int _posY) {
        this.posY = _posY;
    }

    // méthode qui retourne tous les attributs de l'objet courant afin de les
    // afficher
    public String toString() {
        return "PositionX : " + this.getPosX()
                + " PositionY : "
                + this.getPosY();
    }
}
