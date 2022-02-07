package tp2.etudiant;

import java.time.LocalDateTime;

public class Etudiant {

    private String name;
    private int anneeNaissance;
    private Boolean codeIns;
    private Nationality codePays;
    private Examen examenMaths;
    private Examen examenInformatique;
    private Examen examenBiologie;

    public Etudiant() {
        this.name = "Dude";
    }

    public Etudiant(String _name, int _anneeNaissance, Boolean _codeIns, Nationality _codePays) {
        this.name = _name;
        this.anneeNaissance = _anneeNaissance;
        this.codeIns = _codeIns;
        this.codePays = _codePays;
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
        this.anneeNaissance = anneeNaissance;
    }

    /**
     * @return int return the age
     */
    public int getAge() {
        LocalDateTime now = LocalDateTime.now();
        int anneeNow = now.getYear();
        return anneeNow - this.anneeNaissance;
    }

    /**
     * @return Boolean return the codeIns
     */
    public Boolean getCodeIns() {
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

    /**
     * @return Examen return the examenMaths
     */
    public Examen getExamenMaths() {
        return examenMaths;
    }

    /**
     * @param examenMaths the examenMaths to set
     */
    public void setExamenMaths(Examen examenMaths) {
        this.examenMaths = examenMaths;
    }

    /**
     * @return Examen return the examenInformatique
     */
    public Examen getExamenInformatique() {
        return examenInformatique;
    }

    /**
     * @param examenInformatique the examenInformatique to set
     */
    public void setExamenInformatique(Examen examenInformatique) {
        this.examenInformatique = examenInformatique;
    }

    /**
     * @return Examen return the examenBiologie
     */
    public Examen getExamenBiologie() {
        return examenBiologie;
    }

    /**
     * @param examenBiologie the examenBiologie to set
     */
    public void setExamenBiologie(Examen examenBiologie) {
        this.examenBiologie = examenBiologie;
    }

    public double moyenne() {
        double noteInfo = examenInformatique.getNote();
        double noteMaths = examenMaths.getNote();
        double noteBio = examenBiologie.getNote();
        return (noteInfo + noteBio + noteMaths) / 3;
    }

    @Override
    public String toString() {
        return "{" +
                " name='" + getName() + "'" +
                ", anneeNaissance='" + getAnneeNaissance() + "'" +
                ", age='" + getAge() + "'" +
                ", codeIns='" + getCodeIns() + "'" +
                ", codePays='" + getCodePays() + "'" +
                "}";
    }

}
