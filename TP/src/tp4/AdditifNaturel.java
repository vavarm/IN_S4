package tp4;

import java.util.Scanner;

public class AdditifNaturel extends Additif {
    private String origine;
    private TypeOrigine typeOrigine;

    public AdditifNaturel() {
        super();
    }

    public AdditifNaturel(String nom, String code, TypeFonction fonction, Boolean autoriseEnFra, String origine,
            TypeOrigine typeOrigine) {
        super(nom, code, fonction, autoriseEnFra);
        this.origine = origine;
        this.typeOrigine = typeOrigine;
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
     * @return TypeOrigine return the typeOrigine
     */
    public TypeOrigine getTypeOrigine() {
        return typeOrigine;
    }

    /**
     * @param typeOrigine the typeOrigine to set
     */
    public void setTypeOrigine(TypeOrigine typeOrigine) {
        this.typeOrigine = typeOrigine;
    }

    public void saisie(Scanner clavier) {
        super.saisie(clavier);
        System.out.println(
                "Ecrire les attributs de AdditifNaturel en les séparant par des retours à la ligne\norigine/typeOrigine\n[");
        this.origine = clavier.next();
        this.typeOrigine = TypeOrigine.valueOf(clavier.next().toUpperCase());
        System.out.println("]");
    }

    @Override
    public TypeRegime Regime() {
        switch (this.typeOrigine.toString()) {
            case "ANIMAL":
                return TypeRegime.GENERAL;
            case "SOUS_PRODUIT_ANIMAL":
                return TypeRegime.VEGETARIEN;
            case "VEGETAL":
                return TypeRegime.VEGETALIEN;
            case "MINERAL":
                return TypeRegime.VEGETALIEN;
            default:
                return TypeRegime.GENERAL;
        }
    }

}