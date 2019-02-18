package instruments;

import interfaces.IPlay;
import interfaces.ISell;

public class Guitar extends Instrument implements IPlay, ISell {

    private int numberOfStrings;
    private String typeOfGuitar;


    public Guitar (String manufacturer, String instrumentType, String colour, String instrumentMaterial, double tradePrice, double sellOnPrice, int numberOfStrings, String typeOfGuitar) {
        super(manufacturer, instrumentType, colour, instrumentMaterial, tradePrice, sellOnPrice);
        this.numberOfStrings = numberOfStrings;
        this.typeOfGuitar = typeOfGuitar;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public String getTypeOfGuitar() {
        return typeOfGuitar;
    }

    public String play(String title) {
        return "Guitar is strumming: " + title;
    }

    public double calculateMarkUp() {
        double markup = super.getSellOnPrice() - super.getTradePrice();
        return markup;
    }
}
