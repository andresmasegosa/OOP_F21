package session8.c_sortedset;

import java.util.Comparator;

class DoubleComparator implements Comparator<Double> {

    @Override
    public int compare(Double o1, Double o2) {
        return -o1.compareTo(o2);
    }
}
