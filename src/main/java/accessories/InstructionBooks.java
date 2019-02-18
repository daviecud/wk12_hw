package accessories;

import interfaces.ISell;

public class InstructionBooks extends Accessories implements ISell {

    private String nameOfInstructionBook;

    public InstructionBooks (String type, double tradePrice, double sellOnPrice, String nameOfInstructionBook) {
        super(type, tradePrice, sellOnPrice);
        this.nameOfInstructionBook = nameOfInstructionBook;

    }


    public String getInstructionBooks() {
        return nameOfInstructionBook;
    }

    public double calculateMarkUp() {
        double markup = super.getSellOnPrice() - super.getTradePrice();
        return markup;
    }
}
