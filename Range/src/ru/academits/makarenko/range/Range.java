package ru.academits.makarenko.range;

public class Range {
    private double from;
    private double to;

    public Range(double from, double to) {
        this.from = from;
        this.to = to;
    }

    public double calcLong(double from, double to) {
        return to - from;
    }

    public void print() {
        double aLong = calcLong(from, to);
        System.out.println(aLong);
    }

    public boolean isInside(double x, double from, double to) {

        if (from <= x && x <= to) {
            return true;
        }
        return false;
    }
}