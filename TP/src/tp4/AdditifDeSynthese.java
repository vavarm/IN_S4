package tp4;

import java.util.Scanner;

public class AdditifDeSynthese extends Additif {
    private String stratDeSynthese;

    public AdditifDeSynthese() {
        super();
    }

    public AdditifDeSynthese(String nom, String code, TypeFonction fonction, Boolean autoriseEnFra,
            String stratDeSynthese) {
        super(nom, code, fonction, autoriseEnFra);
        this.stratDeSynthese = stratDeSynthese;
    }

    /**
     * @return String return the stratDeSynthese
     */
    public String getStratDeSynthese() {
        return stratDeSynthese;
    }

    /**
     * @param stratDeSynthese the stratDeSynthese to set
     */
    public void setStratDeSynthese(String stratDeSynthese) {
        this.stratDeSynthese = stratDeSynthese;
    }

    public void saisie(Scanner clavier) {
        super.saisie(clavier);
        System.out.println(
                "Ecrire les attributs de AdditifDeSynthese en les séparant par des retours à la ligne\nstratDeSynthese\n[");
        this.stratDeSynthese = clavier.next();
        System.out.println("]");
    }

    @Override
    public TypeRegime Regime() {
        return TypeRegime.GENERAL;
    }

}