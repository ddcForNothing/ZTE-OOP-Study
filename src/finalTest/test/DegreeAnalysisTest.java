package finalTest.test;

import finalTest.src.Card;
import finalTest.src.GroupDegreeAnalysis;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by DDC on 2017/7/16.
 */
public class DegreeAnalysisTest {
    @Test
    public void degreeAnalysis_test_牌级别判定() throws Exception{
        Card[] group1 = new Card[]{Card.createA(3), Card.createA(4),
                Card.createA(5), Card.createA(6), Card.createA(7)};//同花顺
        List<Card> list1 = Arrays.asList(group1);
        assertEquals(GroupDegreeAnalysis.getDegree(list1), 8);

        Card[] group2 = new Card[]{Card.createA(3), Card.createB(3),
                Card.createC(3), Card.createD(3), Card.createA(7)};//四条
        List<Card> list2 = Arrays.asList(group2);
        assertEquals(GroupDegreeAnalysis.getDegree(list2), 7);

        Card[] group3 = new Card[]{Card.createA(3), Card.createB(3),
                Card.createC(3), Card.createA(7), Card.createB(7)};//葫芦
        List<Card> list3 = Arrays.asList(group3);
        assertEquals(GroupDegreeAnalysis.getDegree(list3), 6);

        Card[] group4 = new Card[]{Card.createA(3), Card.createA(4),
                Card.createA(5), Card.createA(6), Card.createA(9)};//同花
        List<Card> list4 = Arrays.asList(group4);
        assertEquals(GroupDegreeAnalysis.getDegree(list4), 5);

        Card[] group5 = new Card[]{Card.createA(3), Card.createA(4),
                Card.createA(5), Card.createC(6), Card.createA(7)};//顺子
        List<Card> list5 = Arrays.asList(group5);
        assertEquals(GroupDegreeAnalysis.getDegree(list5), 4);

        Card[] group6 = new Card[]{Card.createA(3), Card.createB(3),
                Card.createC(3), Card.createA(6), Card.createA(7)};//三条
        List<Card> list6 = Arrays.asList(group6);
        assertEquals(GroupDegreeAnalysis.getDegree(list6), 3);

        Card[] group7 = new Card[]{Card.createA(3), Card.createB(3),
                Card.createA(5), Card.createB(5), Card.createA(7)};//两对
        List<Card> list7 = Arrays.asList(group7);
        assertEquals(GroupDegreeAnalysis.getDegree(list7), 2);

        Card[] group8 = new Card[]{Card.createA(3), Card.createB(3),
                Card.createA(5), Card.createA(6), Card.createA(7)};//对子
        List<Card> list8 = Arrays.asList(group8);
        assertEquals(GroupDegreeAnalysis.getDegree(list8), 1);

        Card[] group9 = new Card[]{Card.createA(3), Card.createA(4),
                Card.createA(5), Card.createC(6), Card.createA(8)};//散牌
        List<Card> list9 = Arrays.asList(group9);
        assertEquals(GroupDegreeAnalysis.getDegree(list9), 0);
    }
}
