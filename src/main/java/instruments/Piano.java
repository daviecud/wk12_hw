package instruments;

import interfaces.IPlay;
import interfaces.ISell;

public class Piano extends Instrument implements IPlay, ISell {

    private int numberOfPedals;
    private int numberOfKeys;

    public Piano(String manufacturer, String instrumentType, String colour, String instrumentMaterial, double tradePrice, double sellOnPrice, int numberOfPedals, int numberOfKeys) {
        super(manufacturer, instrumentType, colour, instrumentMaterial, tradePrice, sellOnPrice);
        this.numberOfPedals = numberOfPedals;
        this.numberOfKeys = numberOfKeys;

    }

    public int getNumberOfPedals() {
        return numberOfPedals;
    }

    public int getNumberOfKeys() {
        return numberOfKeys;
    }

    public String play(String title) {
        return "Piano is playing: " + title;
    }

    public double calculateMarkUp() {
        double markup = super.getSellOnPrice() - super.getTradePrice();
        return markup;
    }


}
