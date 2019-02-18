import accessories.GuitarStrings;
import accessories.InstructionBooks;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestGuitarStrings {

    GuitarStrings guitarStrings;

    @Before
    public void before() {
        guitarStrings = new GuitarStrings("Strings", 5.76, 19.99, 6);
    }

    @Test
    public void canGetAccessorieType() {
        assertEquals("Strings", guitarStrings.getType());
    }


    @Test
    public void canGetTradePrice() {
        assertEquals(5.76, guitarStrings.getTradePrice(), 0.1);
    }

    @Test
    public void canGetSellOnPrice() {
        assertEquals(19.99, guitarStrings.getSellOnPrice(), 0.1);
    }

    @Test
    public void canGetMarkUp() {
        assertEquals(14.22, guitarStrings.calculateMarkUp(), 0.1);
    }

    @Test
    public void canGetNumberOfStrings() {
        assertEquals(6, guitarStrings.getNumberOfStrings(), 0.1);
    }

}
