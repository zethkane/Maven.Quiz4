package rocks.zipcode.quiz5.collections.spice;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.quiz5.collections.culonary.Curry;
import rocks.zipcode.quiz5.collections.culonary.Ginger;
import rocks.zipcode.quiz5.collections.culonary.Pepper;
import rocks.zipcode.quiz5.collections.culonary.Spice;

/**
 * @author leon on 27/12/2018.
 */
public class SpicePolymorphismTest {
    @Test
    public void testPepperIsSpice() {
        Assert.assertTrue(new Pepper() instanceof Spice);
    }

    @Test
    public void testGingerIsSpice() {
        Assert.assertTrue(new Ginger() instanceof Spice);
    }

    @Test
    public void testCurryIsSpice() {
        Assert.assertTrue(new Curry() instanceof Spice);
    }
}
