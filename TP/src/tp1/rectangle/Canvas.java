package tp1.rectangle;

public class Canvas {

    public static void main(String[] args) { // fonction principale, appelée lors de l'exécution
        System.out.println("====================");
        Rectangle r1 = new Rectangle(); // création d'un objet Rectangle
        System.out.println("r1 :: " + r1.toString()); // affichage de tous les attributs de l'objet r1
        Rectangle.Couleur c1 = Rectangle.Couleur.Rouge; // création d'une couleur
        Rectangle r2 = new Rectangle(8, 3, c1, 10, 40); // création d'un objet Rectangle avec des paramètres
        System.out.println("r2 :: " + r2.toString()); // affichage de tous les attributs de l'objet r2
        r2.getPosition().setPosX(60); // modification de la position de r2 sur l'axe X
        System.out.println("La position sur l'axe x de mon deuxième rectangle est : " + r2.getPosition().getPosX());
        System.out.println("====================");
    }

}
