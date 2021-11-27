package homework_4;

public interface AbstractMap {
    boolean containsKey(Key key);

    Value get(Key key);

    void put(Key key, Value value);

    void remove(Key key);

    void resize();

    int getIndex(Key key);

    int size();

    boolean isEmpty();

    void clear();
}
