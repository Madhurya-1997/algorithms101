package hashing;

import java.util.HashSet;

public class MyHashSet {

    private static final int N = 100000;
    private static boolean[] set;

    public MyHashSet() {
        this.set = new boolean[N];
    }

    public void add(int key) {
        this.set[key] = true;
    }

    public void remove(int key) {
        this.set[key] = false;
    }

    public boolean contains(int key) {
        return this.set[key];
    }
}

