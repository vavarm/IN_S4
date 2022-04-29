package tp8;

import java.util.HashMap;
import java.util.Map;

public interface IBilletTrain {
    public enum TypeTarif { // integrated(internal) enum in interface
        PREMIERE, PROSECONDE, SECONDE, INCONNU
    }

    public static Map<TypeTarif, Double> setTauxRemboursement() { // public static method
        Map<TypeTarif, Double> map = new HashMap<>();
        map.put(TypeTarif.PREMIERE, 0.7);
        map.put(TypeTarif.PROSECONDE, 0.3);
        map.put(TypeTarif.SECONDE, 0.0);
        return map;
    }

    public static final Map<TypeTarif, Double> TAUX_REMBOURSEMENT = setTauxRemboursement(); // Map constante

    long getDateHeure(); // public abstract method

    String getOrigine();

    String getDestination();

    TypeTarif getTypeTarif();

    double getPrix();

    default String getOrigineDestination() { // public default method
        return getOrigine() + "-" + getDestination();
    }

    default double getTarifRemboursement() {
        return TAUX_REMBOURSEMENT.get(getTypeTarif()) * getPrix(); // multiply the rate in the constant map with the
                                                                   // price
    }
}
