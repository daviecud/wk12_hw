package accessories;

public class InstrumentCase extends Accessories {

    private String typeOfCase;

    public InstrumentCase(String type, double tradePrice, double sellOnPrice, String typeOfCase) {
        super(type, tradePrice, sellOnPrice);
        this.typeOfCase = typeOfCase;
    }

    public String getTypeOfCase() {
        return typeOfCase;
    }
}
