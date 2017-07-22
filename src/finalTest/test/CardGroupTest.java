package finalTest.test;

import finalTest.src.Card;
import finalTest.src.CardGroup;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

/**
 * Created by DDC on 2017/7/16.
 */
public class CardGroupTest {
    @Test
    public void CardGroup_test_卡组逻辑测试() throws Exception{
        //不出现重复，有序，数值符合范围
        List<Card> computer = new ArrayList<Card>();
        List<Card> custemer = new ArrayList<Card>();
        CardGroup.drawCards(computer, custemer);//抽牌

        assertEquals(computer.size(), 5);//list长度为5
        assertEquals(custemer.size(), 5);

        boolean flagNotOrder = false,//无序
                flagValid = true;//数组元素均有效

        Set<Card> set = new HashSet<Card>();
        for (int i = 0; i < 5; i++) {
            set.add(computer.get(i));
            set.add(custemer.get(i));

            if (!(computer.get(i).getNum() > 1 && computer.get(i).getNum() < 15) ||
                    !(custemer.get(i).getNum() > 1 && custemer.get(i).getNum() < 15)) {
                flagValid = false;
            }

            if (i < 4 && (computer.get(i).compareTo(computer.get(i + 1)) > 0 ||
                    (custemer.get(i).compareTo(custemer.get(i + 1)) > 0))) {
                flagNotOrder = true;
            }
        }
        assertEquals(set.size(), 10);//无重复测试
        assertTrue(!flagNotOrder);//有序测试
        assertTrue(flagValid);//有效测试
    }
}
