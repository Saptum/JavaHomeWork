package homework_3;

import java.util.Arrays;

public class IntArrayList implements IntList {

    private static class Entry {
        int value;
        Entry previous;
        Entry next;

        public Entry(int value) {
            this.value = value;
        }

        public Entry() {

        }
    }

    private int size;
    private Entry first;
    private Entry last;
    transient Object[] elementData;


    @Override
    public void add(int element) {
        int value = 0;
        Entry newElement = new Entry(value);
        if (size == 0) {
            first = newElement;
            last = newElement;
        } else {
            last.next = newElement;
            newElement.previous = last;
            last = newElement;
        }
        size++;
    }

    @Override
    public boolean add(int index, int element) {
        int value = 0;
        Entry newElement = new Entry(value);
        if (size == 0) {
            first = newElement;
            last = newElement;
        } else {
            last.next = newElement;
            newElement.previous = last;
            last = newElement;
        }
        size++;
        return false;
    }

    @Override
    public void clear() {
        size = 0;
        first = null;
        last = null;
    }

    @Override
    public int get(int index) {
        return (int) getEntry(index);
    }

    private Object getEntry(int index) {
        Entry tmp = first;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean remove(int index) {
        if (index < 0 || index > size - 1) {
            throw new IllegalArgumentException();
        }
        if (index == 0) {
            first = first.next;
        } else {
            Entry entry = findEntryBeforeByIndex(index);
            Entry tmp = findByIndex(index);
            entry.next = tmp.next;
        }
        size--;
        return false;
    }

    private Entry findByIndex(int index) {
        if (index < 0 || index > size - 1) {
            throw new IndexOutOfBoundsException();
        }
        int tmpIndex = 0;
        if (first == null) {
            throw new IndexOutOfBoundsException();
        }

        if (index == 0) {
            return first;
        }

        Entry entry = first;
        while (entry.next != null) {
            entry = entry.next;
            tmpIndex++;
            if (tmpIndex == index) {
                return entry;
            }
        }
        throw new IndexOutOfBoundsException();
    }

    private Entry findEntryBeforeByIndex(int index) {
        if (index <= 0 || index > size - 1) {
            return null;
        }

        int count = 0;
        Entry entry = first;
        while (entry.next != null) {
            if (count == index - 1) {
                return entry;
            }
            count++;
            entry = entry.next;
        }
        return null;
    }

    @Override
    public boolean removeByValue(int value) {
        if (size == 0) {
            return false;
        } else if (size == 1) {
            first = null;
            last = null;
            size = 0;
            return true;
        }

        Entry entryBefore = findEntryBefore(value);

        if (entryBefore.value == 0) {
            first = first.next;
            size--;
            return true;
        } else if (entryBefore != null) {
            if (last.value == value) {
                entryBefore.next = null;
                last = entryBefore;
            } else {
                entryBefore.next = entryBefore.next.next;
            }
            size--;
            return true;
        }

        return true;
    }

    private Entry findEntryBefore(int value) {
        if (first.value == value) {
            return new Entry();
        }

        Entry entry = first;
        while (entry.next != null) {
            if (entry.next.value == value) {
                return entry;
            }
            entry = entry.next;
        }
        return null;
    }

    @Override
    public boolean set(int index, int element) {
        Entry entry = (Entry) getEntry(index);
        entry.value = element;
        return false;
    }

    @Override
    public int size() {
        int count = 0;
        for (int i = 0; i < size; i++) {
            count++;
        }
        return count;
    }

    @Override
    public IntList subList(int fromIndex, int toIndex) {
        IntList result = new IntArrayList();
        Arrays.copyOfRange(elementData, fromIndex, toIndex);
        return result;
    }

    @Override
    public int[] toArray() {
        int[] result = new int[size];
        Entry tmp = first;
        for (int i = 0; i < size; i++) {
            result[i] = tmp.value;
            tmp = tmp.next;
        }
        return result;
    }


}
