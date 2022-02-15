package tp2.etudiant;

public class Examen {

    private double note;
    private String matiere;

    public Examen() {
    }

    public Examen(double note, String matiere) {
        this.note = note;
        this.matiere = matiere;
    }

    public double getNote() {
        return this.note;
    }

    public void setNote(double note) {
        if (note >= 0 && note <= 20)
            this.note = note;
        else
            System.out.println("La note saisie n'est pas dans l'intervalle de d�fintion des notes !");
    }

    public String getMatiere() {
        return this.matiere;
    }

    public void setMatiere(String matiere) {
        this.matiere = matiere;
    }

}
