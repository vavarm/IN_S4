package tp6.PromosRevisitees;

import java.util.*;

public class Promotion {
    private String intitule;
    private int annee;
    private Map<Integer, Etudiant> etudiants; // WARN - déclaration d'un dictionnaire

    public Promotion() {
        this.intitule = "default_promo";
        this.annee = 0000;
        this.etudiants = new HashMap<Integer, Etudiant>(); // WARN - initialisation d'une HashMap
    }

    public Promotion(String intitule, int annee) {
        this.intitule = intitule;
        this.annee = annee;
        this.etudiants = new HashMap<Integer, Etudiant>();
    }

    /**
     * @return String return the intitule
     */
    public String getIntitule() {
        return intitule;
    }

    /**
     * @param intitule the intitule to set
     */
    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    /**
     * @return int return the annee
     */
    public int getAnnee() {
        return annee;
    }

    /**
     * @param annee the annee to set
     */
    public void setAnnee(int annee) {
        this.annee = annee;
    }

    /**
     * @return ArrayList<Etudiant> return the etudiants
     */
    public Map<Integer, Etudiant> getEtudiants() {
        return (Map<Integer, Etudiant>) Collections.unmodifiableMap(etudiants); // WARN - unmodifiableMap
    }

    public Etudiant rechercheIndex(int i) {
        if (i >= 0 && i < etudiants.size())
            return etudiants.get(i);
        System.err.println("L'index de recherche de l'étudiant est hors limite de la liste des étudiants");
        return null;
    }

    public int nbEtudiants() {
        return etudiants.size();
    }

    public void inscrire(Etudiant etudiant) {
        if (this.etudiants.containsValue(etudiant)) // WARN - containsValue()
            System.out.println("L'étudiant est déjà présent dans la liste"); // WARN - use syserr to print an error
        else
            etudiants.put(etudiant.getCodeEtu(), etudiant);
    }

    public double moyenneGenerale() {
        double sum = 0;
        int n = 0;
        for (Etudiant etudiant : etudiants.values()) { // WARN - range values in hashmaps
            sum += etudiant.moyenne();
            n++;
        }
        if (n >= 0)
            return sum / n;
        return 0;
    }

    public void afficheResultat() {
        System.out.println("==========");
        for (Etudiant etudiant : etudiants.values()) {
            System.out.println(etudiant.ligneResultats());
            System.out.println("\n");
        }
        System.out.println("==========");
    }

    public Etudiant recherche(String nom) {
        for (Etudiant etudiant : etudiants.values()) {
            if (nom.equals(etudiant.getName())) // WARN - use String.equals() to compare to string, otherwise it
                                                // compares the memory allocation adress
                return etudiant;
        }
        return null;
    }

    public ArrayList<Etudiant> admis() {
        ArrayList<Etudiant> etuAdmis = new ArrayList<Etudiant>();
        for (Etudiant etudiant : etudiants.values()) {
            if (etudiant.admis()) {
                etuAdmis.add(etudiant);
            }
        }
        return etuAdmis;
    }

    public ArrayList<Etudiant> etuEtrangernonFranco() {
        ArrayList<Etudiant> etu = new ArrayList<Etudiant>();
        for (Etudiant etudiant : etudiants.values()) {
            if (etudiant.getCodePays() == Nationalite.ETRANGER_NON_FRANCOPHONE) {
                etu.add(etudiant);
            }
        }
        return etu;
    }

    public ArrayList<Etudiant> majors() {
        double max = 0;
        ArrayList<Etudiant> majors = new ArrayList<Etudiant>();
        for (Etudiant etudiant : etudiants.values()) {
            if (etudiant.moyenne() > max)
                max = etudiant.moyenne();
        }
        for (Etudiant etudiant : etudiants.values()) {
            if (etudiant.moyenne() == max) {
                majors.add(etudiant);
            }
        }
        return majors;
    }

    public ArrayList<Etudiant> threeMajors() {
        double first = 0;
        double second = 0;
        double third = 0;
        ArrayList<Etudiant> majors = new ArrayList<Etudiant>();
        for (Etudiant etudiant : etudiants.values()) {
            if (etudiant.moyenne() > first) {
                third = second;
                second = first;
                first = etudiant.moyenne();
            } else if (etudiant.moyenne() > second) {
                third = second;
                second = etudiant.moyenne();
            } else if (etudiant.moyenne() > third) {
                third = etudiant.moyenne();
            }
        }
        for (Etudiant etudiant : etudiants.values()) {
            if (etudiant.moyenne() == first || etudiant.moyenne() == second || etudiant.moyenne() == third) {
                majors.add(etudiant);
            }
        }
        return majors;
    }

}
