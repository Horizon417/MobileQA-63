import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MainClassTest {
    int expected;
    @Before
    public void initExpected() {
        expected = MainClass.getLocalNumber();
    }
    @Test
    public void testGetLocalNumber () {
        Assert.assertEquals("Возвращаемое число не равно 14", expected, 14);
    }
}
