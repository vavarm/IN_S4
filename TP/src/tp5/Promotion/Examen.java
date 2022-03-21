package tp5.Promotion;

public class Examen {
	/* ATTRIBUTS */
	/* ========= */
	private double note;
	private String matiere;

	/* CONSTRUCTORS */
	/* ============ */
	// Constructeur par défaut
	public Examen() {
		note = 0;
		matiere = "inconnu";
	}

	// Constructeur paramétré
	public Examen(double note, String matiere) {
		this.note = note;
		this.matiere = matiere;
	}

	/* METHODS */
	/* ======= */
	// Getters & Setters
	public double getNote() {
		return note;
	}

	public void setNote(double note) {
		// la note doit être entre 0 et 20
		if (note >= 0 && note <= 20)
			this.note = note;
	}

	public String getMatiere() {
		return matiere;
	}

	public void setMatiere(String matiere) {
		this.matiere = matiere;
	}

	// toString
	@Override
	public String toString() {
		return "Matière : " + matiere + ", Note : " + note;
	}
}
