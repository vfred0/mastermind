package org.example.utils;

public class ClosedInterval {

    private final int min;
    private final int max;

    public ClosedInterval(int min, int max) {
        assert min <= max;

        this.min = min;
        this.max = max;
    }

    public boolean isIncluded(int value) {
        return this.min <= value && value <= this.max;
    }

    @Override
    public String toString() {
        return "[" + this.min + ", " + this.max + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ClosedInterval other = (ClosedInterval) obj;
        if (min != other.min)
            return false;
        return max == other.max;
    }

}
