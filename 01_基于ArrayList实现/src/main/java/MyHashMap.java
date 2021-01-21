import java.util.ArrayList;
import java.util.List;

/**
 * @author: create by wangmh
 * @projectName: HashMap_Handwriting
 * @packageName: PACKAGE_NAME
 * @description:
 * @date: 2021/1/21
 **/
public class MyHashMap<K, V> {
    private List<Entry<K, V>> entryList = new ArrayList<Entry<K, V>>();

    class Entry<K, V> {
        K k;
        V v;

        public Entry(K k, V v) {
            this.k = k;
            this.v = v;
        }
    }

    public void put(K k, V v) {
        entryList.add(new Entry<K, V>(k, v));
    }

    public V get(K k) {
        for (Entry<K, V> kvEntry : entryList) {
            if (kvEntry.k.equals(k)) {
                return kvEntry.v;
            }
        }
        return null;
    }

    public void remove(K k) {
        for (Entry<K, V> kvEntry : entryList) {
            if (kvEntry.k.equals(k)) {
                entryList.remove(kvEntry);
            }
        }
    }

    public static void main(String[] args) {
        MyHashMap myHashMap = new MyHashMap();
        myHashMap.put("a", "b");
        myHashMap.put("a1", "b1");
        System.out.println(myHashMap.get("a"));
        myHashMap.remove("a");
        System.out.println(myHashMap);
    }


}
