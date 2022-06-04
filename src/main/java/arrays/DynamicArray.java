package arrays;

import java.util.Arrays;

public class DynamicArray<String> {

    private Object[] data;
    private int size = 0;
    private int initialCapacity;

    public DynamicArray(int initialCapacity) {
        data = new Object[initialCapacity];
        this.size = 0;
        this.initialCapacity = initialCapacity;
    }

    public String get(int index) {
        return (String)data[index];
    }
    public void set(int index, String val) {

        if (index < initialCapacity) {

            if (data[index] == null) {
                size++;
            }

            data[index] = val;

        } else {
            throw new IndexOutOfBoundsException("Index is too big !");
        }
    }
    public void insert(int index, String val) {
        // check if size == initialCapacity
        if (size == initialCapacity) {
            resize();
        }

        /**
         * Insertion:
         * 1. Copy up the array
         * 2. insert the element into the mentioned index
         */
        for (int i = size - 1; i >= index; i--) {
            data[i + 1] = data[i];
        }
        data[index] = val;

        size++;
    }
    public void delete(int index) {


        /**
         * Deletion:
         * 1. Copy down the array
         * 2. overwrite the end element as null
         */

        for (int i = index ; i < size - 1; i++) {
            data[i] = data[i + 1];
        }

        if (size - 1 == index) { // delete only the last element - O(1) - Best case for deletion
            data[index] = null;
        } else { // delete any element other than the last element
            data[size - 1] = null;
        }

        size--;


    }

    /**
     * resize() will double the initial capacity of the array
     */
    public void resize() {
        Object[] newData = new Object[initialCapacity];
        for (int i=0; i<initialCapacity; i++) {
            newData[i] = data[i];
        }
        data = newData;
        initialCapacity = initialCapacity * 2;
//        Object[] newData = Arrays.copyOf(data, initialCapacity*2);
//        data = newData;
//        initialCapacity = initialCapacity * 2;
    }
    public boolean isEmpty() {
        return size == 0;
    }
    public boolean contains(String val) {
        for (Object d: data) {
            if (d == val) {
                return true;
            }
        }
        return false;
    }

    public int getSize() {
        return size;
    }

}

