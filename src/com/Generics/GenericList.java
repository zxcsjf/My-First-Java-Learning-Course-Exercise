package com.Generics;

import java.util.Iterator;

// T short for type or template
// E for Elements
// Constraints for Type in GenericsList
public class GenericList<T> implements Iterable<T> {
    private T[] items = (T[]) new Object[10];
    private int count;

    public void add(T item) {
        items[count++] = item;
    }

    public T get(int index) {
        return items[index];
    }


    @Override
    public Iterator<T> iterator() {
        // 5. return an Iterator object
        //    this == current object
        return new ListIterator(this);
    }

    // 1. T: same type as GenericList<T>
    // 3. this class knows how to iterate a GenericList, it's the only place I need to change if
    //    tomorrow I replace T with an ArrayList
    //    (Array is a fixed length data structure whereas ArrayList is a variable length Collection class.)
    private class ListIterator implements Iterator<T>{
        private GenericList<T> list;
        // 4. use index to iterate over list
        private int index;
        // 2. pass a GenericList via Constructor
         public ListIterator(GenericList<T> list){
            this.list = list;
        }

        @Override
        public boolean hasNext() {
            return (index < count);
        }

        @Override
        public T next() {
            return list.items[index++];
        }
    }
}
