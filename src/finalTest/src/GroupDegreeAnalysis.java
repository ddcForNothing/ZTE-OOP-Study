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

    private GroupDegreeAnalysis(){
        enumSet = EnumSet.noneOf(CardType.class);
        continuousCard = true;
    }

    //获得牌的度，对外唯一接口
    public static int getDegree(List<Card> group) {
        GroupDegreeAnalysis analysis = new GroupDegreeAnalysis();
        return analysis.getContinuousOrFlushDegree(group);
    }

    //判断是不是同花顺
    private int getContinuousOrFlushDegree(List<Card> group) {
        for (int i = 0; i < group.size(); ++i) {
            Card card = group.get(i);
            enumSet.add(card.getType());

            //顺子判断
            if (i < group.size() - 1 && !(card.getNum() + 1 == group.get(i + 1).getNum())) {
                continuousCard = false;
            }
        }

        if (continuousCard && sameColorJudge()) {
            return 8;
        } else if (sameColorJudge()) {
            return 5;
        } else if (continuousCard) {
            return 4;
        } else {
            return getOtherDegree(group);
        }
    }

    //其余判断
    private int getOtherDegree(List<Card> group) {
        int flag = 0;
        for (int i = 0; i < group.size() - 1; ++i) {
            for (int j = i + 1; j < group.size(); ++j) {
                if (group.get(i).compareTo(group.get(j)) == 0) {
                    flag++;
                }
            }
        }

        switch (flag) {
            case 6:
                return 7;
            case 4:
                return 6;
            case 3:
                return 3;
            case 2:
                return 2;
            case 1:
                return 1;
            default:
                return 0;
        }
    }
}
