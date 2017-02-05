package ru.academits.makarenko.rangehard;

/**
 * Created by 1 on 04.02.2017.
 */
public class HardRange {
    private double from;
    private double to;

    public HardRange(double from, double to) {
        this.from = from;
        this.to = to;
    }

    public double getFrom() {
        return from;
    }

    public double getTo() {
        return to;
    }

    public double calcLength() {
        return (to - from);
    }

    public boolean isInside(double x) {
        return (from <= x && x <= to);
    }


}
