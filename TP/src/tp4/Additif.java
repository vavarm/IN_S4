package tp4;

import java.util.Scanner;

public abstract class Additif {
    private String nom;
    private String code;
    private TypeFonction fonction;
    private Boolean autoriseEnFra;

    public Additif() {
    }

    public Additif(String nom, String code, TypeFonction fonction, Boolean autoriseEnFra) {
        this.nom = nom;
        this.code = code;
        this.fonction = fonction;
        this.autoriseEnFra = autoriseEnFra;
    }

    /**
     * @return String return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * @return String return the code
     */
    public String getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * @return TypeFonction return the fonction
     */
    public TypeFonction getFonction() {
        return fonction;
    }

    /**
     * @param fonction the fonction to set
     */
    public void setFonction(TypeFonction fonction) {
        this.fonction = fonction;
    }

    /**
     * @return Boolean return the autoriseEnFra
     */
    public Boolean isAutoriseEnFra() {
        return autoriseEnFra;
    }

    /**
     * @param autoriseEnFra the autoriseEnFra to set
     */
    public void setAutoriseEnFra(Boolean autoriseEnFra) {
        this.autoriseEnFra = autoriseEnFra;
    }

    public void saisie(Scanner clavier) {
        System.out.println(
                "Ecrire les attributs de Additif en les séparant par des retours à la ligne\nnom/code/fonction/autoriseEnFra\n[");
        this.setNom(clavier.next());
        this.setCode(clavier.next());
        this.setFonction(TypeFonction.valueOf(clavier.next().toUpperCase()));
        this.setAutoriseEnFra(clavier.nextBoolean());
        System.out.println("]");
    } // méthode qui est spécialisée dans les sous classes

    public abstract TypeRegime Regime(); // méthode qui est masquée par les méthodes des sous classes

    // TODO : toString()

}
