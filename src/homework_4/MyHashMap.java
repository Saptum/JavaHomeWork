package homework_4;

import java.util.LinkedList;

public class MyHashMap implements AbstractMap {
    LinkedList<Entry>[] hashMap = new LinkedList[2];
    int size = 0;

    @Override
    public boolean containsKey(Key key) {
        if (key == null) return false;

        int index = getIndex(key) % hashMap.length;

        if (hashMap[index] == null) return false;

        for (Entry entry : hashMap[index]) {
            if (entry.key.equals(key)) {
                return true;
            }
        }
        return false;
    }

    public MyHashMap() {

    }

    @Override
    public Value get(Key key) {
        int index = getIndex(key) % hashMap.length;

        if (hashMap[index] == null) return null;

        for (Entry entry : hashMap[index]) {
            if (entry.key.equals(key)) {
                return entry.value;
            }
        }

        return null;
    }

    @Override
    public void put(Key key, Value value) {
        if (size > hashMap.length) {
            resize();
        }

        int index = getIndex(key) % hashMap.length;

        if (hashMap[index] == null) {
            hashMap[index] = new LinkedList<>();
            hashMap[index].add(new Entry(key, value));
            size++;
            return;
        } else {
            for (Entry entry : hashMap[index]) {
                if (entry.key.equals(key)) {
                    entry.value = value;
                    return;
                }
            }
            hashMap[index].add(new Entry(key, value));
            size++;
            return;
        }
    }

    @Override
    public void remove(Key key) {
        if (key == null) return;

        int index = getIndex(key) % hashMap.length;
        if (hashMap[index] == null) return;

        Entry toRemove = null;


        for (Entry entry : hashMap[index]) {
            if (entry.key.equals(key)) {
                toRemove = entry;
                break;
            }
        }

        if (toRemove == null) return;


        hashMap[index].remove(toRemove);
        size--;
    }

    @Override
    public void resize() {
        LinkedList<Entry>[] oldHashMap = hashMap;
        hashMap = new LinkedList[size * 2];
        size = 0;

        for (int i = 0; i < oldHashMap.length; i++) {
            if (oldHashMap[i] == null) continue;
            for (Entry entry : oldHashMap[i]) {
                put(entry.key, entry.value);
            }
        }
    }

    @Override
    public int getIndex(Key key) {
        return key.hashCode();
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void clear() {
        size = 0;
        hashMap = new LinkedList[16];
    }

}
