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

    public HardRange calcIntersection(HardRange hardRange) {
        if (this.from > hardRange.to || hardRange.from > this.to) {
            return null;
        }
        if (this.from < hardRange.from) {
            this.from = hardRange.from;
        }
        if (this.to > hardRange.to) {
            this.to = hardRange.to;
        }
        return new HardRange(this.from, this.to);
    }

    public HardRange[] calcMerger(HardRange hardRange) {
        if (this.from > hardRange.to || this.to < hardRange.from) {
            return (new HardRange[]{new HardRange(this.from, this.to), new HardRange(hardRange.from, hardRange.to)});
        }
        if (this.from > hardRange.from) {
            this.from = hardRange.from;
        }
        if (this.to < hardRange.to) {
            this.to = hardRange.to;
        }
        return (new HardRange[]{new HardRange(this.from, this.to)});
    }

    public HardRange[] calcCrossing(HardRange hardRange) {
        if (this.from > hardRange.to || hardRange.from > this.to) {
            return (new HardRange[]{new HardRange(this.from, this.to), new HardRange(hardRange.from, hardRange.to)});
        }
        if (this.from < hardRange.from) {

        } else {
            this.from = hardRange.from;
        }
        if (this.to > hardRange.to) {

        } else {
            this.to = hardRange.to;
        }
        return (new HardRange[]{new HardRange(this.from, this.to)});
    }

    public boolean isCrossing(HardRange hardRange) {
        if (this.to < hardRange.from || hardRange.to > this.from) {
            return false;
        }
        return true;
    }

    public HardRange[] calcDifference(HardRange hardRange) {
        if (isCrossing(hardRange)) {
            if (this.from < hardRange.from && this.to <= hardRange.to) {
                return (new HardRange[]{new HardRange(this.from, hardRange.to)});
            } else if (this.from > hardRange.from && this.to > hardRange.to) {
                return (new HardRange[]{new HardRange(hardRange.from, this.from)});
            }

        } else {
            return (new HardRange[]{new HardRange(this.from, this.to)});
        }
        return null;
    }


}