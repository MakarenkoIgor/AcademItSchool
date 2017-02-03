package ru.academits.makarenko.range;

public class Range {
    private double from;
    private double to;

    public Range(double from, double to) {
        this.from = from;
        this.to = to;
    }

    public static double calcInterval(double from, double to) {
        return to - from;
    }

    public void print() {
        double interval = calcInterval(from, to);
        System.out.println(interval);
    }

    public boolean isInside(double x, double from, double to) {
        double epsilon = 0.00000001;

        if (x - from > epsilon && to - x > epsilon){
            return true;
        }
            return false;
        }
    }