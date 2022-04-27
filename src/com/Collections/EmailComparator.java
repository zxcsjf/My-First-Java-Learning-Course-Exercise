package com.Collections;

import java.util.Comparator;

// we can write more than one custom comparators
// as you want for a given type,
// all using different interpretations of what sorting means.
public class EmailComparator implements Comparator<Customer> {

    @Override
    public int compare(Customer o1, Customer o2) {
        return o1.getEmail().compareTo(o2.getEmail());
    }
}
