package hashing;


import java.util.HashMap;

class HashNode {
    private String key;
    private String value;
    public HashNode next;

    public HashNode(String key, String value) {
        this.key = key;
        this.value = value;
        this.next = null;
    }

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }
}

/**
 * Hash table is an array, where
 * each element is a linked list
 */
public class HashTable {

    private int INITIAL_SIZE = 16;
    private HashNode[] data;

    public HashTable() {
        data = new HashNode[INITIAL_SIZE];
    }

    public void put(String key, String value) {
        // get index corresponding to the key
        int index = getIndex(key);
        HashNode entry = new HashNode(key, value);

        if (data[index] != null) {
            data[index] = entry;
        } else { // need to handle collision
            HashNode existingEntry = data[index];
            while(existingEntry.next != null) {
                existingEntry = existingEntry.next;
            }
            existingEntry.next = entry;
        }
    }

    public String get(String key) {
        int index = getIndex(key);

        // get all entries for the index
        HashNode entries = data[index];

        if (entries != null) {
            while (entries.next != null && !entries.getKey().equals(key)) {
                entries = entries.next;
            }
            return entries.getValue();
        }


        // if no entries for this key, return null
        return null;
    }

    private int getIndex(String key) {
        return key.hashCode() % INITIAL_SIZE;
    }


}
