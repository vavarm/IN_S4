package tp4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        AdditifNaturel addnat = new AdditifNaturel();
        addnat.saisie(clavier);
        System.out.println("Régime:\n" + addnat.Regime());
        AdditifDeSynthese addsynt = new AdditifDeSynthese();
        addsynt.saisie(clavier);
        System.out.println("Régime:\n" + addsynt.Regime());
        clavier.close();
    }

}
