package instruments;

import interfaces.IPlay;
import interfaces.ISell;

public class Harmonica extends Instrument implements IPlay, ISell {

        private String typeOfHarmonica;


        public Harmonica (String manufacturer, String instrumentType, String colour, String instrumentMaterial, double tradePrice, double sellOnPrice, String typeOfHarmonica) {
            super(manufacturer, instrumentType, colour, instrumentMaterial, tradePrice, sellOnPrice);
            this.typeOfHarmonica = typeOfHarmonica;

        }

        public String play(String title) {
            return "Harmonica is humming: " + title;
        }

        public double calculateMarkUp() {
            double markup = super.getSellOnPrice() - super.getTradePrice();
            return markup;
        }

        public String getTypeOfHarmonica() {
            return typeOfHarmonica;
        }

}
