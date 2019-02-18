import instruments.Harmonica;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestHarmonica {

    Harmonica harmonica;

    @Before
    public void before() {
        harmonica = new Harmonica("Hohner", "Wood", "silver", "Metal", 22.95, 49.99, "Alto");
    }

    @Test
    public void canGetHarmonicaType() {
        assertEquals("Alto", harmonica.getTypeOfHarmonica());
    }

    @Test
    public void canGetManufacturer() {
        assertEquals("Hohner", harmonica.getManufacturer());
    }

    @Test
    public void canGetInstrumentType() {
        assertEquals("Wood", harmonica.getInstrumentType());
    }

    @Test
    public void canGetColour() {
        assertEquals("silver", harmonica.getColour());
    }

    @Test
    public void canGetInstrumentMaterial() {
        assertEquals("Metal", harmonica.getInstrumentMaterial());
    }

    @Test
    public void canGetTradePrice() {
        assertEquals(22.95, harmonica.getTradePrice(), 0);
    }

    @Test
    public void canGetSellOnPrice() {
        assertEquals(49.99, harmonica.getSellOnPrice(), 0);
    }

    @Test
    public void canPlay() {
        assertEquals("Harmonica is humming: Roadhouse Blues", harmonica.play("Roadhouse Blues"));
    }

    @Test
    public void canGetMarkupPrice() {
        assertEquals(27.04, harmonica.calculateMarkUp(), 0.1);
    }

}
