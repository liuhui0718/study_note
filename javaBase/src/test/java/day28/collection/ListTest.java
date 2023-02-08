package day28.collection;

/**
 * ｜---collection接口：单列集合，用来存储一个一个的对象
 *         ｜--list接口：存储有序的，可重复的数据   ---》"动态"数组
 *             ｜--ArrayList：作为List接口的主要实现类：线程不安全，效率高：底层使用Object[] elementData存储
 *             ｜-- linkedList：对于频繁的插入、删除操作，使用此类效率比ArrayList高：底层使用双向链表存储
 *             ｜--Vector：作为List接口的古老实现类：线程安全，但是效率低：底层使用Object[] elementData存储

 * 面试题：ArrayList，linkedList，Vector三者的异同
 *
 * 同：三个类都是实现了List接口，存储数据的特点相同：存储有序的、可重复的数据
 *
 *
 *
 */


public class ListTest {
}
