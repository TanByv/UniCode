import java.util.Arrays;

class Entry {
    int key;
	Entry next;

    Entry(int key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return "E" + key;
    }
}

class HashTable {
    private Entry[] table;
    private int size;

    HashTable(int size) {
        this.size = size;
        this.table = new Entry[size];
    }

    // Linear probing 
    void insertLinearProbing(int key) {
        int index = (3 * key + 5) % size;
        while (table[index] != null) {
            index = (index + 1) % size;
        }
        table[index] = new Entry(key);
    }

    // Quadratic probing 
	void insertQuadraticProbing(int key) {
		int index = (3 * key + 5) % size;
		int i = 1;
		while (table[index] != null && i < size) {
			index = (index + i * i) % size; 
			i++;
		}
		if (i < size) {
			table[index] = new Entry(key);
		} else {
			// (Failure point)
		}
	}

    // Double hashing 
    void insertDoubleHashing(int key) {
        int index = (3 * key + 5) % size;
        int step = (7 - (key % 7)) % size;
        while (table[index] != null) {
            index = (index + step) % size; 
        }
        table[index] = new Entry(key);
    }

	// Separate chaining
	void insertSeparateChaining(int key) {
		int index = (3 * key + 5) % size;
		if (table[index] == null) {
			table[index] = new Entry(key);
		} else {
			// Create linked list node
			Entry newEntry = new Entry(key);
			newEntry.next = table[index];
			table[index] = newEntry;
		}
	}

    @Override
    public String toString() {
        return Arrays.toString(table);
    }
}

public class HashTableDrawing {
    public static void main(String[] args) {
        int[] keys = {12, 44, 13, 88, 23, 94, 11, 39, 20, 16, 5};
        HashTable linearProbingTable = new HashTable(11);
        HashTable quadraticProbingTable = new HashTable(11);
        HashTable doubleHashingTable = new HashTable(11);
        HashTable separateChainingTable = new HashTable(11);

        for (int key : keys) {
            linearProbingTable.insertLinearProbing(key);
            quadraticProbingTable.insertQuadraticProbing(key);
            doubleHashingTable.insertDoubleHashing(key);
            separateChainingTable.insertSeparateChaining(key);
        }

        System.out.println("Linear Probing: " + linearProbingTable);
        System.out.println("Quadratic Probing: " + quadraticProbingTable);
        System.out.println("Double Hashing: " + doubleHashingTable);
        System.out.println("Separate Chaining (After collisions): " + separateChainingTable);
    }
}
