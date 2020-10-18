import org.junit.Assert;
import org.junit.Test;

public class NameInverterTest {
    @Test
    public void testEquals(){
        Assert.assertEquals("null", NameInverter.Alter("null"));
        Assert.assertEquals(" ", NameInverter.Alter(" "));
        Assert.assertEquals("", NameInverter.Alter(""));
        Assert.assertEquals("SofiCa", NameInverter.Alter("SofiCa"));
        Assert.assertEquals("Lorena", NameInverter.Alter(" Lorena "));
        Assert.assertEquals("Pop, Doru", NameInverter.Alter("Doru Pop"));
        Assert.assertEquals("Popsicle, Lara", NameInverter.Alter(" Lara Popsicle "));
        Assert.assertEquals("Lov, Ion Mr.", NameInverter.Alter("Mr. Ion Lov"));
        Assert.assertEquals("Moldovan, Raluca Mrs. Phd.", NameInverter.Alter("Mrs. Phd. Raluca Moldovan"));
    }

    @Test
    public void testNotEquals(){
        Assert.assertNotEquals(" ", NameInverter.Alter(""));
        Assert.assertNotEquals(" SofiCa", NameInverter.Alter("SofiCa"));
        Assert.assertNotEquals(" Lorena ", NameInverter.Alter(" Lorena "));
        Assert.assertNotEquals("Doru, Pop", NameInverter.Alter("Doru Pop"));
        Assert.assertNotEquals("Ion, Lov Mr.", NameInverter.Alter("Mr. Ion Lov"));
        Assert.assertNotEquals(" Moldovan, Raluca Mrs. Phd. ", NameInverter.Alter("Mrs. Phd. Raluca Moldovan"));
    }
}
