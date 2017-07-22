package finalTest.src;

import java.util.*;

/**
 * Created by DDC on 2017/7/16.
 * 牌组建立以及抽牌逻辑,提供唯一的对外接口
 */
public class CardGroup {
    private static List<Card> cardGroup = null;

    //牌组建立
    private static void createGroup(){
        cardGroup = new LinkedList<Card>();
        for (int i = 2; i <= 14; ++i) {
            cardGroup.add(Card.createA(i));
            cardGroup.add(Card.createB(i));
            cardGroup.add(Card.createC(i));
            cardGroup.add(Card.createD(i));
        }
    }

    //电脑和玩家抽牌, 也是唯一同外界交流的方法
    public static void drawCards(final List<Card> computer, final List<Card> customer){
        createGroup();
        computer.addAll(drawFiveOrderCards());
        customer.addAll(drawFiveOrderCards());
    }

    //将抽到的5张牌进行排序
    private static List<Card> drawFiveOrderCards(){
        List<Card> list = new LinkedList<Card>();
        drawFiveRandomCards(list);
        Collections.sort(list, (a, b)->a.compareTo(b));//Lambda 表达式
        return list;
    }
    //随机抽5张牌
    private static void drawFiveRandomCards(List<Card> list) {
        for (int i = 0; i < 5; i++) {
            list.add(drawOneCard());
        }
    }
    //随机抽一张牌
    private static Card drawOneCard() {
        int size = cardGroup.size();
        int randomNum = (int)(Math.random() * size);//随机数 0 - size-1
        return cardGroup.remove(randomNum);
    }
}
