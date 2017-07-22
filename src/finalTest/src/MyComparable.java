package finalTest.src;

import java.util.List;

/**
 * Created by DDC on 2017/7/16.
 * 比较接口，采用策略模式、里氏代换原则
 */
@FunctionalInterface //函数式接口
public interface MyComparable {
    public int compare(List<Card> card1, List<Card> card2);

    //散牌比较
    static MyComparable scatteredCardCompare(){
        return (card1, card2)->{
            int num1 = 0, num2 = 0;
            for (int i = card1.size() - 1; i >= 0; i--) {
                num1 = card1.get(i).getNum();
                num2 = card2.get(i).getNum();
                if (num1 != num2) {
                    return (int)(num1 - num2);
                }
            }
            return 0;
        };
    }

    //其他牌比较
    static MyComparable otherCardCompare(){
        return (card1, card2)->{
            return -1;
        };
    }


    //其他的牌比较的静态方法


    //最终比较
    static int finalCompare(List<Card> list1, List<Card> list2){
        GroupDegreeAnalysis analysis = new GroupDegreeAnalysis();
        int degree1 = analysis.getDegree(list1);
        int degree2 = analysis.getDegree(list2);
        if (degree1 != degree2) {//度不相等直接判断
            return (int)(degree1 - degree2);
        }

        MyComparable compare = null;
        switch (degree1) {
            case 0 :
                compare = scatteredCardCompare();
                return compare.compare(list1, list2);
            default :
                compare = otherCardCompare();
                return compare.compare(list1, list2);
        }
    }
}
