package instruments;

public abstract class Instrument {

    private String manufacturer;
    private String instrumentType;
    private String colour;
    private String instrumentMaterial;
    private double tradePrice;
    private double sellOnPrice;

    public Instrument(String manufacturer, String instrumentType, String colour, String instrumentMaterial, double tradePrice, double sellOnPrice) {
        this.manufacturer = manufacturer;
        this.instrumentType = instrumentType;
        this.colour = colour;
        this.instrumentMaterial = instrumentMaterial;
        this.tradePrice = tradePrice;
        this.sellOnPrice = sellOnPrice;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getInstrumentType() {
        return instrumentType;
    }

    public String getColour() {
        return colour;
    }

    public String getInstrumentMaterial() {
        return instrumentMaterial;
    }

    public double getTradePrice() {
        return tradePrice;
    }

    public double getSellOnPrice() {
        return sellOnPrice;
    }
}
