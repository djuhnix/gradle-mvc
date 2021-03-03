package mvc.model;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestModel {
    @Test
    public void testGetMessage() {
        Model model = new Model();
        String m = model.getMessage();
        Assert.assertNotNull(m);
        Assert.assertEquals(m, "Hello Djuhnix !");
    }
}
