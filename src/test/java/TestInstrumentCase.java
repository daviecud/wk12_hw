import accessories.InstrumentCase;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestInstrumentCase {

    InstrumentCase instrumentCase;

    @Before
    public void before() {
        instrumentCase = new InstrumentCase("Case", 75.99, 110.00, "Guitar");
    }

    @Test
    public void canGetCasetype() {
        assertEquals("Guitar", instrumentCase.getTypeOfCase());
    }

    @Test
    public void canGetAccessorieType() {
        assertEquals("Case", instrumentCase.getType());
    }

    @Test
    public void canGetTradePrice() {
        assertEquals(75.99, instrumentCase.getTradePrice(), 0);
    }

    @Test
    public void canGetSellOnPrice() {
        assertEquals(110.00, instrumentCase.getSellOnPrice(), 0);
    }


}
