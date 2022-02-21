package tp2.etudiant;

import java.time.LocalDate;
import java.util.Scanner;

public class Etudiant {

    private String name;
    private int anneeNaissance;
    private int age;
    private Boolean codeIns;
    private Nationality codePays;
    private Examen examenMaths = new Examen(0, "Mathématiques");
    private Examen examenInformatique = new Examen(0, "Informatique");
    private Examen examenBiologie = new Examen(0, "Biologie");

    public Etudiant() {
        this.name = "Dude";
        this.anneeNaissance = LocalDate.now().getYear();
        this.codePays = Nationality.INCONNU;
    }

    public Etudiant(String name, int anneeNaissance, Boolean codeIns, Nationality codePays) {
        this.name = name;
        setAnneeNaissance(anneeNaissance);
        this.codeIns = codeIns;
        this.codePays = codePays;
    }

    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return int return the anneeNaissance
     */
    public int getAnneeNaissance() {
        return anneeNaissance;
    }

    /**
     * @param anneeNaissance the anneeNaissance to set
     */
    public void setAnneeNaissance(int anneeNaissance) {
        int year = LocalDate.now().getYear();
        if (anneeNaissance > 0 && year >= anneeNaissance + 5) {
            this.anneeNaissance = anneeNaissance;
            this.age = year - this.anneeNaissance; /*
                                                    * OR (IF dateNaissance IS A LocalDate) this.age =
                                                    * dateNaissance.until(now).getYears();
                                                    * => difference in years between dateNaissance and now
                                                    */
        }
    }

    /**
     * @return int return the age
     */
    public int getAge() {
        return this.age;
    }

    /**
     * @return Boolean return the codeIns
     */
    public Boolean isCodeIns() {
        return codeIns;
    }

    /**
     * @param codeIns the codeIns to set
     */
    public void setCodeIns(Boolean codeIns) {
        this.codeIns = codeIns;
    }

    /**
     * @return Nationality return the codePays
     */
    public Nationality getCodePays() {
        return codePays;
    }

    /**
     * @param codePays the codePays to set
     */
    public void setCodePays(Nationality codePays) {
        this.codePays = codePays;
    }

    public void saisieCodePays(Scanner scanner) {
        this.codePays = saisieNationalite(scanner);
    }

    /**
     * @return Examen return the examenMaths
     */
    public Examen getExamenMaths() {
        return examenMaths;
    }

    /**
     * @return Examen return the examenInformatique
     */
    public Examen getExamenInformatique() {
        return examenInformatique;
    }

    /**
     * @return Examen return the examenBiologie
     */
    public Examen getExamenBiologie() {
        return examenBiologie;
    }

    public void saisieNotes(Scanner scanner) {
        double maths = getNote(scanner, "Mathématiques");
        double info = getNote(scanner, "Informatique");
        double bio = getNote(scanner, "Biologie");
        miseAJourNotes(maths, info, bio);
    }

    private void miseAJourNotes(double maths, double info, double bio) {
        if ((maths >= 0 && maths <= 20) && (info >= 0 && info <= 20) && (bio >= 0 && bio <= 20)) {
            this.examenMaths.setNote(maths);
            this.examenInformatique.setNote(info);
            this.examenBiologie.setNote(bio);
        } else
            System.out.println(
                    "Une ou plusieures notes saisies ne fait/font pas partie/s de l'intervalle de définition !");
    }

    public double getNote(Scanner scanner, String arg) {
        return getDouble(scanner, "Veuillez saisir la note de " + arg);
    }

    public Nationality saisieNationalite(Scanner scanner) {
        Nationality nat;
        System.out.println("Veuillez saisir le numéro correspondant à la nationalit�");
        System.out.println("1. FRANCAIS");
        System.out.println("2. ETRANGER_FRANCOPHONE");
        System.out.println("3. ETRANGER_NON_FRANCOPHONE");
        int val = scanner.nextInt();
        switch (val) {
            case 1:
                nat = Nationality.FRANCAIS;
                break;
            case 2:
                nat = Nationality.ETRANGER_FRANCOPHONE;
                break;
            case 3:
                nat = Nationality.ETRANGER_NON_FRANCOPHONE;
                break;
            default:
                nat = Nationality.INCONNU;
                break;
        }
        return nat;
    }

    public double moyenne() {
        double noteInfo = examenInformatique.getNote();
        double noteMaths = examenMaths.getNote();
        double noteBio = examenBiologie.getNote();
        return (noteInfo + noteBio + noteMaths) / 3;
    }

    public String mention() {
        String mention = "Non Acquis";
        double moy = moyenne();
        if (moy >= 10) {
            mention = "Acquis";
            if (moy >= 12) {
                mention = "Assez bien";
                if (moy >= 14) {
                    mention = "Bien";
                    if (moy >= 16) {
                        mention = "Tr�s bien";
                    }
                }
            }
        }
        return mention;
    }

    private double getDouble(Scanner scanner, String arg) {
        System.out.println(arg);
        return scanner.nextDouble();
    }

    @Override
    public String toString() {
        return "{" +
                " name='" + getName() + "'" +
                ", anneeNaissance='" + getAnneeNaissance() + "'" +
                ", age='" + getAge() + "'" +
                ", codeIns='" + isCodeIns() + "'" +
                ", codePays='" + getCodePays() + "'" +
                ", Moyenne='" + moyenne() + "'" +
                ", Mention='" + mention() + "'" +
                "}";
    }

}
