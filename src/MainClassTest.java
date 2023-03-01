import org.junit.Assert;
import org.junit.Test;

public class MainClassTest {
    @Test
    public void testGetLocalNumber () {
        Assert.assertTrue("Возвращаемое число меньше или равно 45", MainClass.getClassNumber() > 45);
    }
}
