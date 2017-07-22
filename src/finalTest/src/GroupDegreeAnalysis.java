package finalTest.src;

import java.util.EnumSet;
import java.util.List;

/**
 * Created by DDC on 2017/7/16.
 * 获得5张牌等级判定
 *德州扑克  同花顺》四条》葫芦》同花》顺子》三条》两对》一对》散牌 分别对应 8->0
 * 从高级向低级进行判定,返回最终的度
 */
public class GroupDegreeAnalysis {

    //花色存储集合,采用枚举集合EnumSet，判断是否是同花
    private EnumSet<CardType> enumSet = null;
    private boolean continuousCard;//顺子判断标志  true表示是顺子

    //同花判断
    private boolean sameColorJudge(){
        return enumSet.size() > 1 ? false : true;//花色种类大于1为false
    }

    //获得牌的度，对外唯一接口
    public int getDegree(List<Card> group) {
        enumSet = EnumSet.noneOf(CardType.class);
        continuousCard = true;
        return getEightDegree(group);
    }

    //判断是不是同花顺
    private int getEightDegree(List<Card> group) {
        for (int i = 0; i < group.size(); ++i) {
            Card card = group.get(i);
            enumSet.add(card.getType());

            //顺子判断
            if (i < group.size() - 1 && !(card.getNum() + 1 == group.get(i + 1).getNum())) {
                continuousCard = false;
            }
        }
        return ((continuousCard && sameColorJudge())
                ? 8 : getSevenDegree(group));//同花且顺返回8，否则判断是否为4条
    }

    //判断四条
    private int getSevenDegree(List<Card> group) {
        boolean flag = group.get(0).getNum() == group.get(3).getNum() ||
                group.get(1).getNum() == group.get(4).getNum();//0 3 或者 1 4值相等，则为四条
        return flag ? 7 : getSixDegree(group);//如果为4条，返回7，否则判断葫芦
    }

    //判断葫芦
    private int getSixDegree(List<Card> group) {
        boolean flag = ((group.get(0).getNum() == group.get(1).getNum()) &&
                (group.get(2).getNum() == group.get(4).getNum())) ||
                ((group.get(0).getNum() == group.get(2).getNum()) &&
                (group.get(3).getNum() == group.get(4).getNum()));//葫芦判定
        return flag ? 6 : getFiveDegree(group);
    }

    //判断同花
    private int getFiveDegree(List<Card> group) {
        return sameColorJudge() ? 5 : getFourDegree(group);
    }

    //判断顺子
    private int getFourDegree(List<Card> group) {
        return continuousCard ? 4 : getThreeDegree(group);
    }

    //判断3条
    private int getThreeDegree(List<Card> group) {
        boolean flag = (group.get(0).getNum() == group.get(2).getNum())
                || (group.get(1).getNum() == group.get(3).getNum())
                || (group.get(2).getNum() == group.get(4).getNum());
        return flag ? 3 : getOtherDegree(group);
    }

    //两对、一对、散牌判定
    private int getOtherDegree(List<Card> group) {
        int pairNum = 0;//对子数量
        for (int i = 0; i < group.size() - 1; ++i) {
            if (group.get(i).getNum() == group.get(i + 1).getNum()) {
                pairNum ++;
            }
        }

        return pairNum;//2表示两对，1表示1对，0表示散牌
    }
}
