package main.java;

public class Darts {

    private double x;
    private double y;
    private double innerCircleRadius = 1.0 * 1.0;
    private double middleCircleRadius = 5.0 * 5.0;
    private double outerCircleRadius = 10.0 * 10.0;

    public Darts(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public int score() {
        double xDisVal = Math.abs(this.x) * Math.abs(this.x);
        double yDisVal = Math.abs(this.y) * Math.abs(this.y);
        double dist = xDisVal + yDisVal;
        if(innerCircleRadius >= dist)
            return 10;
        else if(middleCircleRadius >= dist)
            return 5;
        else if(outerCircleRadius >= dist)
            return 1;
        else
            return 0;
    }

}
