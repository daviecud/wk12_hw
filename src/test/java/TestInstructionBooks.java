import accessories.InstructionBooks;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestInstructionBooks {

    InstructionBooks instructionBooks;

    @Before
    public void before() {
        instructionBooks = new InstructionBooks("Book", 3.46, 12.99, "How to be a Guitar Genius");
    }

    @Test
    public void canGetAccessorieType() {
        assertEquals("Book", instructionBooks.getType());
    }


    @Test
    public void canGetTradePrice() {
        assertEquals(3.46, instructionBooks.getTradePrice(), 0.1);
    }

    @Test
    public void canGetSellOnPrice() {
        assertEquals(12.99, instructionBooks.getSellOnPrice(), 0.1);
    }

    @Test
    public void canGetMarkUp() {
        assertEquals(9.53, instructionBooks.calculateMarkUp(), 0.1);
    }

    @Test
    public void canGetBookName() {
        assertEquals("How to be a Guitar Genius", instructionBooks.getInstructionBooks());
    }
}
