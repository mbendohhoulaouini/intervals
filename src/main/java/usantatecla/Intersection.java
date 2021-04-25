package usantatecla;

public class Intersection {

    private Interval intervalOne;
    private Interval intervalTwo;


    public Intersection(Interval intervalOne, Interval intervalTwo) {
        this.intervalOne=intervalOne;
        this.intervalTwo=intervalTwo;
    }

    public Interval calculateIntersection(){
        Interval result = null;
        if(this.compareIntervals()){
            Min min=(this.intervalOne.getMin().value >= this.intervalTwo.getMin().value) ? this.intervalOne.getMin(): this.intervalTwo.getMin();
            Max max=(this.intervalOne.getMax().value <= this.intervalTwo.getMax().value) ? this.intervalOne.getMax() :this.intervalTwo.getMax();
            result = new Interval(min, max);
        }

        return result;
    }

    public boolean compareIntervals()
    {
        return Math.max(this.intervalOne.getMin().value, this.intervalTwo.getMin().value)<=Math.min(this.intervalOne.getMax().value, this.intervalTwo.getMax().value);
    }

}
