package ru.academits.makarenko.range;

public class Range {
    private double from;
    private double to;

    public double getFrom() {
        return from;
    }

    public double getTo() {
        return to;
    }

    public Range(double from, double to) {
        this.from = from;
        this.to = to;
    }

    public double calcLength() {
        return (to - from);
    }

    public boolean isInside(double x) {
        return (from <= x && x <= to);

    }
}