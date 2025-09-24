

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class APPTest {

    // Normal unit test
    @Test
    public void additionTest() {
        assertEquals(5, 2 + 3, "2 + 3 should equal 5");
    }

    // Marked as regression test
    @Tag("regression")
    @Test
    public void multiplicationRegressionTest() {
        assertEquals(20, 4 * 5, "4 * 5 should equal 20");
    }
}