package usantatecla;

public class Intersection {


    public Intersection(Interval a, Interval b) {
    }

    public Interval calculateIntersection(Interval a, Interval b){
        Interval result = null;
        if(this.compareIntervals(a, b)){
            result = new Interval(a.getMin(), b.getMax());
        }

        return result;
    }

    public boolean compareIntervals(Interval a, Interval b)
    {
        return true;
    }

}
