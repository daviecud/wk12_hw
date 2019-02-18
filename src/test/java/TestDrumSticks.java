import accessories.DrumSticks;
import instruments.Drums;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestDrumSticks {

    DrumSticks drumSticks;

    @Before
    public void before() {
        drumSticks = new DrumSticks("Drumsticks", 9.99, 24.99, 4);
    }

    @Test
    public void getNumberOfDrumSticks() {
        assertEquals(4, drumSticks.getNUmberOfDrumSticks());
    }

    @Test
    public void getTypeOfAccessorie() {
        assertEquals("Drumsticks", drumSticks.getType());
    }

    @Test
    public void getTradePrice() {
        assertEquals(9.99, drumSticks.getTradePrice(), 0);
    }

    @Test
    public void getSellOnPrice() {
        assertEquals(24.99, drumSticks.getSellOnPrice(), 0);
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(15.00, drumSticks.calculateMarkUp(), 0.1);
    }
}
