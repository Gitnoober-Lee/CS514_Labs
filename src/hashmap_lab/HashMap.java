package hashmap_lab;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @Description:
 * @ClassName: HashMap
 * @Package: hashmap_lab
 * @Author: Junpeng Li
 * @CreateTime: 10/30/23 9:54 AM
 */
public class HashMap {

    private List<LinkedList<HashEntry>> buckets;

    public HashMap() {
        buckets = new ArrayList<>(10);
        fillWithLinkedList(10);
    }

    public HashMap(int numOfBuckets) {
        if (numOfBuckets > 0) {
            buckets = new ArrayList<>(numOfBuckets);
            fillWithLinkedList(numOfBuckets);
        } else {
            buckets = new ArrayList<>(10);
            fillWithLinkedList(10);
        }
    }

    private void fillWithLinkedList(int num) {
        for (int i = 0; i < num; i++) {
            buckets.add(new LinkedList<HashEntry>());
        }
    }

    public static void main(String[] args) {
        // HashMap map = new HashMap();
        HashMap map = new HashMap(10);
        puts5CNwords(map);
        Object o = map.get("苹果");
        System.out.println(o);
        System.out.println(map);
    }

    private static void puts5CNwords(HashMap map) {
        map.put("苹果", "apple");
        map.put("香蕉", "banana");
        map.put("番石榴", "guava");
        map.put("石榴", "pomegranate");
        map.put("甘蔗", "sugar cane");
        map.put("草莓", "strawberry");
    }

    private int hashcode(String key) {
        return key.hashCode();
    }

    private void put(String key, Object value) {
        int hash = getHashValue(key);
        int mod = getMod(hash);
        LinkedList<HashEntry> entryLinkedList = buckets.get(mod);
        if (entryLinkedList == null) {
            createLinkedList(mod);
        }
        HashEntry entry = new HashEntry(key, value);
        entryLinkedList.add(entry);
    }

    private int getMod(int hash) {
        return hash % 10;
    }

    public Object get(String key) {
        int hash = getHashValue(key);
        int mod = getMod(hash);
        LinkedList<HashEntry> entryLinkedList = buckets.get(mod);
        if (entryLinkedList == null) {
            return -1;
        }
        HashEntry entry = getEntry(key, entryLinkedList);
        if (entry == null) {
            return -1;
        }
        return entry;
    }

    @Override
    public String toString() {
        return "HashMap{" +
                "buckets=" + buckets +
                '}';
    }

    private HashEntry getEntry(String key, LinkedList<HashEntry> entryLinkedList) {
        for (HashEntry entry : entryLinkedList) {
            String k = entry.getStr();
            if (key.equals(k)) {
                return entry;
            }
        }
        return null;
    }

    private int getHashValue(String key) {
        return key.hashCode();
    }

    private void createLinkedList(int position) {
        LinkedList<HashEntry> ll = new LinkedList<>();
        buckets.add(position, ll);
    }


    class HashEntry {
        private String str;
        private Object obj;

        public HashEntry(String str, Object obj) {
            this.str = str;
            this.obj = obj;
        }

        public String getStr() {
            return str;
        }

        public void setStr(String str) {
            this.str = str;
        }

        public Object getObj() {
            return obj;
        }

        public void setObj(Object obj) {
            this.obj = obj;
        }

        @Override
        public String toString() {
            return "HashEntry{" +
                    "str='" + str + '\'' +
                    ", obj=" + obj +
                    '}';
        }
    }
}
