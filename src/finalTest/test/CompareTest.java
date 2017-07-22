package finalTest.test;

import finalTest.src.Card;
import finalTest.src.MyComparable;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertTrue;


/**
 * Created by DDC on 2017/7/16.
 */
public class CompareTest {
    @Test
    public void scatteredCards_compare_test_散牌比较测试() throws Exception{
        Card [] group1 = new Card[]{Card.createC(10), Card.createB(5),
                Card.createC(3), Card.createD(2), Card.createB(4)};

        Card [] group2 = new Card[]{Card.createC(8), Card.createB(5),
                Card.createC(3), Card.createD(7), Card.createB(4)};

        Card [] group3 = new Card[]{Card.createC(10), Card.createB(2),
                Card.createC(3), Card.createD(5), Card.createB(4)};

        List<Card> list1 = Arrays.asList(group1);
        List<Card> list2 = Arrays.asList(group2);
        List<Card> list3 = Arrays.asList(group3);

        Collections.sort(list1, (a, b)->a.compareTo(b));//排序
        Collections.sort(list2, (a, b)->a.compareTo(b));
        Collections.sort(list3, (a, b)->a.compareTo(b));

        //MyComparable compare = MyComparable.operationControl(list1, list2);

        assertTrue(MyComparable.finalCompare(list1, list2) > 0);
        assertTrue(MyComparable.finalCompare(list1, list3) == 0);
        assertTrue(MyComparable.finalCompare(list2, list3) < 0);
    }

    @Test
    public void scatteredCards_compareTo_pairCard_散牌和对子比较测试() throws Exception{
        Card[] group1 = new Card[]{Card.createA(3), Card.createB(3),
                Card.createA(5), Card.createA(6), Card.createA(7)};//对子
        List<Card> list1 = Arrays.asList(group1);

        Card[] group2 = new Card[]{Card.createA(3), Card.createA(4),
                Card.createA(5), Card.createC(6), Card.createA(8)};//散牌
        List<Card> list2 = Arrays.asList(group2);

        assertTrue(MyComparable.finalCompare(list1, list2) > 0);
    }

}
