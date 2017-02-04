package ru.academits.makarenko.range;

public class Range {
    private double from;
    private double to;

    public Range(double from, double to) {
        this.from = from;
        this.to = to;
    }

    public void calcLength() {
        System.out.println(to - from);
    }

    public boolean isInside(double x) {

        if (from <= x && x <= to) {
            return true;
        }
        return false;
    }
}