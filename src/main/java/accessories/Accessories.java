package accessories;

public abstract class Accessories {

    private String type;
    private double tradePrice;
    private double sellOnPrice;

    public Accessories(String type, double tradePrice, double sellOnPrice) {
        this.type = type;
        this.tradePrice = tradePrice;
        this.sellOnPrice = sellOnPrice;
    }

    public String getType() {
        return type;
    }

    public double getTradePrice() {
        return tradePrice;
    }

    public double getSellOnPrice() {
        return sellOnPrice;
    }


}
