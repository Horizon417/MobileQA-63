import org.junit.Assert;
import org.junit.Test;

public class MainClassTest {

    @Test
    public void testGetClassString() {
        Assert.assertTrue("Строка не содержит подстроку", MainClass.getClassString().contains("Hello") || MainClass.getClassString().contains("hello") );
    }

}
