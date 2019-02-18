import instruments.Piano;
import instruments.Saxophone;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestSaxophone {

    Saxophone saxophone;

    @Before
    public void before() {
        saxophone = new Saxophone("Mendini", "Wood", "Gold", "Brass", 99.99, 199.99, "Alto");
    }

    @Test
    public void canGetTypeOfSaxophone() {
        assertEquals("Alto", saxophone.typeOfSaxophone());
    }

    @Test
    public void canGetManufacturer() {
        assertEquals("Mendini", saxophone.getManufacturer());
    }

    @Test
    public void canGetInstrumentType() {
        assertEquals("Wood", saxophone.getInstrumentType());
    }

    @Test
    public void canGetColour() {
        assertEquals("Gold", saxophone.getColour());
    }

    @Test
    public void canGetInstrumentMaterial() {
        assertEquals("Brass", saxophone.getInstrumentMaterial());
    }

    @Test
    public void canGetTradePrice() {
        assertEquals(99.99, saxophone.getTradePrice(), 0);
    }

    @Test
    public void canGetSellOnPrice() {
        assertEquals(199.99, saxophone.getSellOnPrice(), 0);
    }

    @Test
    public void canPlay() {
        assertEquals("Saxophone is playing: The Saxophone Song", saxophone.play("The Saxophone Song"));
    }

    @Test
    public void canGetMarkupPrice() {
        assertEquals(100.00, saxophone.calculateMarkUp(), 0.1);
    }

}
