import instruments.Drums;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestShop {

    Shop shop;
    Drums drums;

    @Before
    public void before() {
        shop = new Shop("Ray\'s Music Mayhem");

    }

    @Test
    public void canCheckStockStartsEmpty() {
        assertEquals(0, shop.checkStockStartsEmpty());
    }


    @Test
    public void canCheckAddStock() {
        assertEquals(1, shop.checkCanAddStock());
    }

    @Test
    public void canCheckRemoveStock() {
        assertEquals(0, shop.checkRemoveStock());
    }

}
