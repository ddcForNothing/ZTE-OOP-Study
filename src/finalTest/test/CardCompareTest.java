package finalTest.test;

import finalTest.src.Card;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertArrayEquals;
/**
 * Created by DDC on 2017/7/15.
 * 单张卡片的比较
 */
public class CardCompareTest {

    @Test
    public void equals_test_单张牌完全相同测试() throws Exception{
        assertEquals(Card.createA(10).hashCode(), Card.createA(10).hashCode());
        assertEquals(Card.createA(10), Card.createA(10));//相等
        assertNotEquals(Card.createA(10), Card.createA(5));//值不等，花色等
        assertNotEquals(Card.createA(10), Card.createB(10));//值等，花色不等
    }
    @Test
    public void compareTo_test_单张卡牌比较测试() throws Exception{
        //卡牌大小比较测试
        assertTrue(Card.createA(10).compareTo(Card.createA(10)) == 0);
        assertTrue(Card.createA(10).compareTo(Card.createC(10)) == 0);//相等

        assertTrue(Card.createA(5).compareTo(Card.createA(3)) > 0);
        assertTrue(Card.createA(5).compareTo(Card.createC(3)) > 0);//大于

        assertTrue(Card.createA(5).compareTo(Card.createA(7)) < 0);
        assertTrue(Card.createA(5).compareTo(Card.createC(7)) < 0);//小于
    }

    @Test
    public void sort_test_排序测试() throws Exception{
        //进行排序测试,不考虑值相同而花色不同时出现的无序问题
        Card [] cardArrayA = {Card.createA(3), Card.createB(6), Card.createC(9)};
        Card [] cardArrayB = {Card.createC(9), Card.createA(3), Card.createB(6)};
        Arrays.sort(cardArrayB);

        assertArrayEquals(cardArrayA, cardArrayB);
    }
}
