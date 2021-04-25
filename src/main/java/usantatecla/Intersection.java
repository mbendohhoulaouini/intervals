package usantatecla;

public class Intersection {

    private Interval intervalOne;
    private Interval intervalTwo;


    public Intersection(Interval intervalOne, Interval intervalTwo) {
        this.intervalOne=intervalOne;
        this.intervalTwo=intervalTwo;
    }

    public Interval calculateIntersection(Interval intervalOne, Interval intervalTwo){
        Interval result = null;
        if(this.compareIntervals(intervalOne, intervalTwo)){
            Min min=(intervalOne.getMin().value >= intervalTwo.getMin().value) ? intervalOne.getMin(): intervalTwo.getMin();
            Max max=(intervalOne.getMax().value <= intervalTwo.getMax().value) ? intervalOne.getMax() :intervalTwo.getMax();
            result = new Interval(min, max);
        }

        return result;
    }

    public boolean compareIntervals(Interval intervalOne, Interval intervalTwo)
    {
        return Math.max(intervalOne.getMin().value, intervalTwo.getMin().value)<=Math.min(intervalOne.getMax().value, intervalTwo.getMax().value);
    }

}
