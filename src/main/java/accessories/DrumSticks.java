package accessories;

import interfaces.ISell;

public class DrumSticks extends Accessories implements ISell {

    private int numberOfDrumSticks;



    public DrumSticks(String type, double tradePrice, double sellOnPrice, int numberOfDrumSticks) {
        super(type, tradePrice, sellOnPrice);
        this.numberOfDrumSticks = numberOfDrumSticks;

    }

    public int getNUmberOfDrumSticks() {
        return numberOfDrumSticks;
    }

    public double calculateMarkUp() {
        double markup = super.getSellOnPrice() - super.getTradePrice();
        return markup;
    }

}
