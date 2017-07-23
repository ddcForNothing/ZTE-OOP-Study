package finalTest.src;

import java.util.List;

/**
 * Created by DDC on 2017/7/16.
 * 比较接口，采用策略模式、里氏代换原则
 */
@FunctionalInterface //函数式接口
public interface MyComparable {
    public int compare(List<Card> group1, List<Card> group2);

    //散牌比较
    static MyComparable scatteredCardCompare(){
        return (group1, group2)->{
            int i = group1.size() - 1;
            int num = 0;
            while (num == 0 && i >= 0) {
                num = group1.get(i).compareTo(group2.get(i));
                i--;
            }
            return num;
        };
    }

    //其他牌比较
    static MyComparable otherCardCompare(){
        return (group1, group2)->{
            return -1;
        };
    }


    //其他的牌比较的静态方法


    //最终比较
    static int finalCompare(List<Card> group1, List<Card> group2){
        int degree1 = GroupDegreeAnalysis.getDegree(group1);
        int degree2 = GroupDegreeAnalysis.getDegree(group2);
        if (degree1 != degree2) {//度不相等直接判断
            return Integer.compare(degree1, degree2);
        }

        MyComparable compare = null;
        switch (degree1) {
            case 0 :
                compare = scatteredCardCompare();
                break;
            default :
                compare = otherCardCompare();
        }
        return compare.compare(group1, group2);
    }
}
