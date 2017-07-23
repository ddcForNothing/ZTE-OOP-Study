package finalTest.src;

import java.util.*;

/**
 * Created by DDC on 2017/7/16.
 * 牌组建立以及抽牌逻辑,提供唯一的对外接口
 */
public class CardGroup {
    private List<Card> cardGroup = null;

    //牌组建立
    private void createGroup(){
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
        CardGroup group = new CardGroup();
        group.createGroup();
        computer.addAll(group.drawFiveOrderCards());
        customer.addAll(group.drawFiveOrderCards());
    }

    //将抽到的5张牌进行排序
    private List<Card> drawFiveOrderCards(){
        List<Card> list = new LinkedList<Card>();
        drawFiveRandomCards(list);
        Collections.sort(list, (a, b)->a.compareTo(b));//Lambda 表达式
        return list;
    }
    //随机抽5张牌
    private void drawFiveRandomCards(List<Card> list) {
        int size, randomNum;
        for (int i = 0; i < 5; i++) {
            size = cardGroup.size();
            randomNum = (int)(Math.random() * size);//随机数 0 - size-1
            list.add(cardGroup.remove(randomNum));
        }
    }
}
