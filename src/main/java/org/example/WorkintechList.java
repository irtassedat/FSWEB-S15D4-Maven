package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WorkintechList<E extends Comparable<E>> extends ArrayList<E> { // E'nin Comparable<E> olduğunu belirttik.

    @Override
    public boolean add(E e) {
        if (this.contains(e)) {
            return false;
        }
        return super.add(e);
    }

    public void sort() {
        Collections.sort(this);
    }

    @Override
    public boolean remove(Object o) {
        boolean result = super.remove(o);
        this.sort();
        return result;
    }
}
