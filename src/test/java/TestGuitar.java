import instruments.Guitar;
import instruments.Instrument;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestGuitar {

    Guitar guitar;
    Instrument instrument;

    @Before
    public void before() {
        guitar = new Guitar("Fender", "Acoustic", "Red", "Wood", 500.99, 659.99, 6, "Electric");
    }

    @Test
    public void canGetManufacturer() {
        assertEquals("Fender", guitar.getManufacturer());
    }

    @Test
    public void canGetInstrumentType() {
        assertEquals("Acoustic", guitar.getInstrumentType());
    }

    @Test
    public void canGetColour() {
        assertEquals("Red", guitar.getColour());
    }

    @Test
    public void canGetINstrumentMaterial() {
        assertEquals("Wood", guitar.getInstrumentMaterial());
    }

    @Test
    public void canGetTradePrice() {
        assertEquals(500.99, guitar.getTradePrice(), 0);
    }

    @Test
    public void canGetSellOnPrice() {
        assertEquals(659.99, guitar.getSellOnPrice(), 0);
    }

    @Test
    public void canGetNumberOfStrings() {
        assertEquals(6, guitar.getNumberOfStrings());
    }

    @Test
    public void canGetTypeOfGuitar() {
        assertEquals("Electric", guitar.getTypeOfGuitar());
    }

    @Test
    public void canPlay() {
        assertEquals("Guitar is strumming: Stairway to Heaven", guitar.play("Stairway to Heaven"));
    }

    @Test
    public void canGetMarkupPrice() {
        assertEquals(159.00, guitar.calculateMarkUp(), 0);
    }
}
