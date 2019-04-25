package homework.sandbox;


import org.testng.Assert;
import org.testng.annotations.Test;

public class DistanceTest {
    @Test
    public  void testDistance () {

        Point p1 = new Point(5,7);
        Point p2 = new Point(1,2);
        Assert.assertEquals( p1.distance(p2),6.4031242374328485);
    }
}
