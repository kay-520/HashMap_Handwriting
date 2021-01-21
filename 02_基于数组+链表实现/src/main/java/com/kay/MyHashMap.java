package com.kay;

/**
 * @author: create by wangmh
 * @projectName: HashMap_Handwriting
 * @packageName: com.kay
 * @description: jdk1.7 HashMap底层是通过数组+单链表实现
 * @date: 2021/1/21
 **/
public class MyHashMap<K, V> {
    private Entry[] objects = new Entry[1000];

    class Entry<K, V> {
        K k;
        V v;
        Entry next;

        public Entry(K k, V v) {
            this.k = k;
            this.v = v;
        }
    }

    public void put(K k, V v) {
        //通过hashcode值计算k存放的下标位置，key为null，存放在下标为0的位置
        int index = k == null ? 0 : k.hashCode() % objects.length;
        Entry oldEntry = objects[index];
        //判断k是否存在，存在的话就以链表的方式存储
        if (oldEntry == null) {
            objects[index] = new Entry<K, V>(k, v);
        } else {
            oldEntry.next = new Entry<K, V>(k, v);
        }
    }

    public V get(K k) {
        int index = k == null ? 0 : k.hashCode() % objects.length;
        for (Entry<K, V> oldEntry = objects[index]; oldEntry != null; oldEntry = oldEntry.next) {
            if (oldEntry.k == null || oldEntry.k.equals(k)) {
                return oldEntry.v;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        MyHashMap myHashMap = new MyHashMap();
        myHashMap.put("a", "b");
        myHashMap.put(97, "b1");
        System.out.println(myHashMap.get("a"));
        System.out.println(myHashMap.get(97));
    }


}
