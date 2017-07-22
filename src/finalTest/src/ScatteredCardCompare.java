package finalTest.src;

import java.util.List;

/**
 * Created by DDC on 2017/7/16.
 * 散牌比较
 */
@Deprecated
public class ScatteredCardCompare implements MyComparable {
    @Override
    public int compare(List<Card> card1, List<Card> card2) {
        int num1 = 0, num2 = 0;
        for (int i = card1.size() - 1; i >= 0; i--) {
            num1 = card1.get(i).getNum();
            num2 = card2.get(i).getNum();
            if (num1 != num2) {
                return (int)(num1 - num2);
            }
        }
        return (int)(num1 - num2);
    }
}
