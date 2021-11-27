package homework_4;

public class Main {
    public static void main(String[] args) {
        MyHashMap map = new MyHashMap();

        map.put(new Key(1), new Value(221));
        map.put(new Key(4), new Value(40));
        map.put(new Key(1), new Value(1));
        map.remove(new Key(1));

        System.out.println(map.containsKey(new Key(2)));

        System.out.println(map.get(new Key(1)));
        System.out.println(map.get(new Key(4)).getValue());
        System.out.println("Size = " + map.size());
        System.out.println("-----------------------------------");
        MyHashSet set = new MyHashSet();
        System.out.println("Can I ad 1? " + set.add(new Key(1)));
        System.out.println("Can I ad 1 again? " + set.add(new Key(1)));
        set.add(new Key(20));

        System.out.println("Set contains key 2? " + set.contains(new Key(2)));
        System.out.println("Is set empty? " + set.isEmpty());
        System.out.println("Clearing");
        set.clear();
        System.out.println("And now? " + set.isEmpty());

    }
}
