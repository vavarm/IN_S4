package tp6.Relations;

public class PACS extends ContratVieCommune {
    private String tribunal;

    public PACS() {
        tribunal = "";
    }

    public PACS(String tribunal) {
        setTribunal(tribunal);
        ;
    }

    /**
     * @return String return the tribunal
     */
    public String getTribunal() {
        return tribunal;
    }

    /**
     * @param tribunal the tribunal to set
     */
    public void setTribunal(String tribunal) {
        this.tribunal = tribunal;
    }

}
