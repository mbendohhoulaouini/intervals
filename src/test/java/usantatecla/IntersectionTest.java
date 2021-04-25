package usantatecla;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class IntersectionTest {

    private Point leftOne = new Point(-2.2);
    private Point rightOne = new Point(4.4);
    private Point leftTwo = new Point(1.5);
    private Point rightTwo= new Point(3.6);

    @Test
    public void givenIntersectionBetweenTwoIntervalsThenTrue() {
        Interval intervalOne = new IntervalBuilder().open(leftOne.getEquals()).closed(rightOne.getEquals()).build();
        Interval intervalTwo = new IntervalBuilder().open(leftTwo.getEquals()).closed(rightTwo.getEquals()).build();
        Intersection intersection =new Intersection(intervalOne, intervalTwo);
        Interval interval =intersection.calculateIntersection(intervalOne, intervalTwo);
        assertEquals(-2.2, interval.getMin().value);
        assertEquals(4.4, interval.getMax().value);

    }
}
