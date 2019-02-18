import instruments.Drums;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestDrums {

    Drums drums;

    @Before
    public void before() {
        drums = new Drums("Ludwig", "Breakbeats Drum kit", "Black", "Metal", 300.00, 459.99, 4 );
    }

    @Test
    public void canGetNumberOfDrums() {
        assertEquals(4, drums.getNumberOfDrums());
    }

    @Test
    public void canGetManufacturer() {
        assertEquals("Ludwig", drums.getManufacturer());
    }

    @Test
    public void canGetInstrumentType() {
        assertEquals("Breakbeats Drum kit", drums.getInstrumentType());
    }

    @Test
    public void canGetColour() {
        assertEquals("Black", drums.getColour());
    }

    @Test
    public void canGetInstrumentMaterial() {
        assertEquals("Metal", drums.getInstrumentMaterial());
    }

    @Test
    public void canGetTradePrice() {
        assertEquals(300.00, drums.getTradePrice(), 0);
    }

    @Test
    public void canGetSellOnPrice() {
        assertEquals(459.99, drums.getSellOnPrice(), 0);
    }

    @Test
    public void canPlay() {
        assertEquals("Drums are drumming: Marching beat", drums.play("Marching beat"));
    }

    @Test
    public void canGetMarkupPrice() {
        assertEquals(159.99, drums.calculateMarkUp(), 0);
    }

}

