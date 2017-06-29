package user;

/**
 * Created by Administrator on 2017/6/29.
 * length单位的枚举
 * 单位值发生变化，修改枚举值就行
 */
public enum LengthUnit {
    Base(1),
    Inch(Base.getRateOfBase()),
    Foot(12 * Inch.getRateOfBase()),
    Yard(3 * Foot.getRateOfBase()),
    Mile(1760 * Yard.getRateOfBase());

    public int getRateOfBase() {
        return value;
    }


    private int value;

    LengthUnit(int value) {
        this.value = value;
    }

    //找到更高一级的单位
//    public LengthUnit getHigherUnit() {
//        switch(this){
//            case Base:
//                return Inch;
//            case Inch:
//                return Foot;
//            case Foot:
//                return Yard;
//            case Yard:
//                return Mile;
//            default:
//                return null;
//        }
//    }
    //找到更低一级的单位
    public LengthUnit getLowerUnit() {
        switch(this){
            case Mile:
                return Yard;
            case Yard:
                return Foot;
            case Foot:
                return Inch;
            default:
                return null;
        }
    }
}
