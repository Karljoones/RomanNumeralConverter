package test.converter;

import net.karljones.converter.Converter;
import org.junit.Before;
import org.junit.Test;
import org.testng.Assert;

/**
 * Created by KarlJones on 21/06/2018.
 *
 * This is a unit test of the convertor to ensure that the correct outputs are given
 */
public class ConverterTest {

    private Converter converter;

    @Before
    public void setUp(){
        converter = new Converter();
    }

    @Test
    public void generate() throws Exception {
        Assert.assertEquals("CXII", converter.generate(112));
        Assert.assertEquals("MMCCCXXXIV", converter.generate(2334));
    }

    @Test
    public void validateInput() throws Exception {
        Assert.assertEquals(true, converter.validateInput(543));
        Assert.assertEquals(false, converter.validateInput(4003));
    }
}