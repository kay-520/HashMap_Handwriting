# 01_基于ArrayList实现
# 02_基于数组+链表实现
# 03_基于数组+链表+红黑树实现

## 3.HashMap

### 3.1 HashMap和HashTable的区别

hashMap线程不安全，方法非同步；hashtable线程安全，方法同步。

继承不同，HashTable继承Dictionary，HashMap继承AbstractMap。

hashMap中键可以为null，有且只有一个（下标0的位置），值为null的可以为多个；HashTable键值都不可以为空。

哈希值的使用不同，HashTable直接使用对象的hashCode。而HashMap重新计算hash值。

### 3.2 时间复杂度

时间复杂度为O(1) ：只查询一次，例如数组通过下标获取值

时间复杂度为O(n) ：从头查到尾，效率非常低

时间复杂度为O(logn) 平方查询 比如红黑树 

### 3.3 为什么重写equals还要重写hashcode方法

hashcode值是对象内存地址通过哈希算法计算得到的。根据hashcode的规定，两个对象相等，hashcode值也一定相等。

### 3.4 HashMap如何避免内存泄漏问题

自定义对象作为key的时候，一定要重写equals和hashcode犯法，保证key不重复创建。

### 3.5 HashMap底层实现方式

1.基于ArrayList集合的方式实现

2.基于数组+链表（jdk1.7）

3.基于数组+链表+红黑树（jdk1.8）

### 3.6HashMap底层是有序存放的吗？

无序 散列 不保证连续

