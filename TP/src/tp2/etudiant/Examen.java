package tp2.etudiant;

public class Examen {

    private double note;
    private String matiere;

    public Examen() {
    }

    public Examen(double _note, String _matiere) {
        this.note = _note;
        this.matiere = _matiere;
    }

    public double getNote() {
        return this.note;
    }

    public void setNote(double _note) {
        this.note = _note;
    }

    public String getMatiere() {
        return this.matiere;
    }

    public void setMatiere(String _matiere) {
        this.matiere = _matiere;
    }

}
