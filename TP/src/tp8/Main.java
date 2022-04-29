package tp8;

import tp8.IBilletTrain.TypeTarif;

public class Main {

    public static void main(String[] args) {
        BilletTrainTGV bt = new BilletTrainTGV(2204291410L, "Montpellier", "Toulouse", TypeTarif.PREMIERE, 20);
        System.out.println(bt.getOrigineDestination());
        System.out.println(bt.getTarifRemboursement());
    }

}
