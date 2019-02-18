import instruments.Drums;
import instruments.Guitar;
import instruments.Instrument;
import interfaces.ISell;

import java.util.ArrayList;

public class Shop {

    ArrayList<Drums> stock;
    private String name;
    private Drums drums;
    private Guitar guitar;

    public Shop(String name) {
        this.name = name;
        this.drums = drums;
        this.guitar = guitar;
        this.stock = new ArrayList<Drums>();
    }

    public String canGetName() {
        return this.name;
    }

    public int checkStockStartsEmpty() {
        return this.stock.size();
    }

    public int checkCanAddStock() {
        this.stock.add(drums);
        return this.stock.size();
    }

    public int checkRemoveStock() {
        this.stock.remove(drums);
        return this.stock.size();
    }




}
