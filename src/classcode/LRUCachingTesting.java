package classcode;

public class LRUCachingTesting {
    public static void main(String[] args) {

        LRUCaching lru = new LRUCaching(5);
        lru.put(1,10);
        lru.put(2,20);
        lru.put(3,30);
    }


}
