import instruments.Harmonica;
import instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestPiano {

    Piano piano;

    @Before
    public void before() {
        piano = new Piano("Yamaha", "String", "Black", "Wood", 549.99, 1449.99, 3, 88);
    }

    @Test
    public void canGetNumberOfPedals() {
        assertEquals(3, piano.getNumberOfPedals());
    }

    @Test
    public void cangetNumberOfPedals() {
        assertEquals(88, piano.getNumberOfKeys());
    }

    @Test
    public void canGetManufacturer() {
        assertEquals("Yamaha", piano.getManufacturer());
    }

    @Test
    public void canGetInstrumentType() {
        assertEquals("String", piano.getInstrumentType());
    }

    @Test
    public void canGetColour() {
        assertEquals("Black", piano.getColour());
    }

    @Test
    public void canGetInstrumentMaterial() {
        assertEquals("Wood", piano.getInstrumentMaterial());
    }

    @Test
    public void canGetTradePrice() {
        assertEquals(549.99, piano.getTradePrice(), 0);
    }

    @Test
    public void canGetSellOnPrice() {
        assertEquals(1449.99, piano.getSellOnPrice(), 0);
    }

    @Test
    public void canPlay() {
        assertEquals("Piano is playing: Heart & Soul", piano.play("Heart & Soul"));
    }

    @Test
    public void canGetMarkupPrice() {
        assertEquals(900.00, piano.calculateMarkUp(), 0.1);
    }

}
