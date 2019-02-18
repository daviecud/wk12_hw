package accessories;

import interfaces.ISell;

public class GuitarStrings extends Accessories implements ISell {

    private int numberOfStrings;

    public GuitarStrings(String type, double tradePrice, double sellOnPrice, int numberOfStrings) {
        super(type, tradePrice, sellOnPrice);
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public double calculateMarkUp() {
        double markup = super.getSellOnPrice() - super.getTradePrice();
        return markup;
    }

}

