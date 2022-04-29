package tp8;

public class BilletTrainTGV extends BilletTrain {

    public BilletTrainTGV() {
        super();
    }

    public BilletTrainTGV(long dateHeure, String origine, String destination, TypeTarif typeTarif, double prix) {
        super(dateHeure, origine, destination, typeTarif, prix);
    }

}
