package homework_4;

public interface AbstractSet {
    boolean add(Key key);

    void remove(Key key);

    boolean contains(Key key);

    int size();

    boolean isEmpty();

    void clear();
}
