package usantatecla;

public class Intersection {

    private Interval a;
    private Interval b;


    public Intersection(Interval a, Interval b) {
        this.a=a;
        this.b=b;
    }

    public Interval calculateIntersection(Interval a, Interval b){
        Interval result = null;
        if(this.compareIntervals(a, b)){
            Min min=(a.getMin().value >= b.getMin().value) ? a.getMin(): b.getMin();
            Max max=(a.getMax().value <= b.getMax().value) ? a.getMax() : b.getMax();
            result = new Interval(min, max);
        }

        return result;
    }

    public boolean compareIntervals(Interval a, Interval b)
    {
        return Math.max(a.getMin().value, b.getMin().value)<=Math.min(a.getMax().value, this.b.getMax().value);
    }

}
