package instruments;

import interfaces.IPlay;
import interfaces.ISell;

public class Drums extends Instrument implements IPlay, ISell {


    private int numberOfDrums;


    public Drums(String manufacturer, String instrumentType, String colour, String instrumentMaterial, double tradePrice, double sellOnPrice, int numberOfDrums) {
        super(manufacturer, instrumentType, colour, instrumentMaterial, tradePrice, sellOnPrice);
        this.numberOfDrums = numberOfDrums;

    }

    public int getNumberOfDrums() {
        return numberOfDrums;
    }

    public String play(String title) {
        return "Drums are drumming: " + title;
    }

    public double calculateMarkUp() {
        double markup = super.getSellOnPrice() - super.getTradePrice();
        return markup;
    }

}
