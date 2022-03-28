package tp6.Relations;

import java.time.LocalDate;

public abstract class ContratVieCommune {
    private LocalDate dateDebut;
    private LocalDate dateFin;

    public ContratVieCommune() {
        dateDebut = LocalDate.now();
        dateFin = LocalDate.of(3000, 01, 01);
    }

    public ContratVieCommune(LocalDate dateDebut, LocalDate dateFin) {
        setDateDebut(dateDebut);
        setDateFin(dateFin);
    }

    /**
     * @return LocalDate return the dateDebut
     */
    public LocalDate getDateDebut() {
        return dateDebut;
    }

    /**
     * @param dateDebut the dateDebut to set
     */
    public void setDateDebut(LocalDate dateDebut) {
        this.dateDebut = dateDebut;
    }

    /**
     * @return LocalDate return the dateFin
     */
    public LocalDate getDateFin() {
        return dateFin;
    }

    /**
     * @param dateFin the dateFin to set
     */
    public void setDateFin(LocalDate dateFin) {
        this.dateFin = dateFin;
    }

}
