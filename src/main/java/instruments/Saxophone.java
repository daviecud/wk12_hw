package instruments;

import interfaces.IPlay;
import interfaces.ISell;

public class Saxophone extends Instrument implements IPlay, ISell {

    private String typeOfSaxophone;

    public Saxophone (String manufacturer, String instrumentType, String colour, String instrumentMaterial, double tradePrice, double sellOnPrice, String typeOfSaxophone) {
        super(manufacturer, instrumentType, colour, instrumentMaterial, tradePrice, sellOnPrice);
        this.typeOfSaxophone = typeOfSaxophone;

    }

    public String typeOfSaxophone() {
        return typeOfSaxophone;
    }

    public String play(String title) {
        return "Saxophone is playing: " + title;
    }

    public double calculateMarkUp() {
        double markup = super.getSellOnPrice() - super.getTradePrice();
        return markup;
    }

}
