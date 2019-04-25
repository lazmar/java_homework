package homework.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DistanceNotEqual {
    @Test
    public void testDistance() {

        Point p1 = new Point(5, 7);
        Point p2 = new Point(1, 2);
        Assert.assertNotEquals(p1.distance(p2), 0.4031242374328485);
    }
}