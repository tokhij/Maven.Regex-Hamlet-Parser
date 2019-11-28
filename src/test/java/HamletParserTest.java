import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HamletParserTest {
    private String hamletText;
    private HamletParser hamletParser;

    @Before
    public void setUp() {
        this.hamletParser = new HamletParser();
        this.hamletText = hamletParser.getHamletData();
    }

    @Test
    public void testChangeHamletToLeon() {
        int numOfHamlets = hamletParser.numOfHamletOcc();

        hamletParser.changeHamletToLeon();

        Assert.assertEquals(0,hamletParser.numOfHamletOcc());
        Assert.assertEquals(numOfHamlets, hamletParser.numOfLeanOcc());
    }

    @Test
    public void testChangeHoratioToTariq() {
        int numOfHoratio = hamletParser.numOfHoratioOcc();

        hamletParser.changeHoratioToTariq();

        Assert.assertEquals(0,hamletParser.numOfHoratioOcc());
        Assert.assertEquals(numOfHoratio, hamletParser.numOfTariqOcc());
    }

    @Test
    public void testFindHoratio() {
    }

    @Test
    public void testFindHamlet() {
    }
}