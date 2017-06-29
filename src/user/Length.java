package user;

/**
 * Created by Administrator on 2017/6/28.
 * 长度父类
 */
public class Length {
    private final int amount;
    private final LengthUnit amountUnit;
    /*
    static final int InchUnit = 1;
    static final int FootUnit = 12;
    static final int YardUnit = 12 * 3;
    static final int MileUnit = 12 * 3 * 1760;
    */


    private Length(int amount, LengthUnit amountUnit) {
        this.amount = amount;
        this.amountUnit = amountUnit;
    }
    //工厂模式，仅提供四种单位创建方式，屏蔽Length类的构造方法
    public static Length inch(int amount){
        return new Length(amount, LengthUnit.Inch);
    }
    public static Length foot(int amount){
        return new Length(amount, LengthUnit.Foot);
    }
    public static Length yard(int amount){
        return new Length(amount, LengthUnit.Yard);
    }
    public static Length mile(int amount){
        return new Length(amount, LengthUnit.Mile);
    }

    @Override
    //equals方法重写
    public boolean equals(Object o){
        if (o instanceof Length) {
            Length length = (Length) o;
            return (this.toBaseAmount() == length.toBaseAmount());
        }
        return false;
    }
    //add方法
    public Length add(Object o) throws Exception {
        if (o instanceof Length) {
            Length length = (Length) o;
            return new Length(this.toBaseAmount() + length.toBaseAmount(), LengthUnit.Base);
        }
        throw new Exception("input is not Length Exception!!!");
    }
    private int toBaseAmount(){
        return (amount * amountUnit.getRateOfBase());//化为最小的单位
    }


    private StringBuilder sb;//打印结果组合保存
    //打印
    public void print() {
        int totalAmount = this.toBaseAmount();
        if (totalAmount == 0) {
            System.out.println("0 Inch");
        }
        sb = new StringBuilder();//值不为0， 新建StringBuilder对象
        addUnit(totalAmount, LengthUnit.Mile, sb);//添加mile单位
        System.out.println(sb.toString().trim());
//        totalAmount %= LengthUnit.Mile.getRateOfBase();
//        addUnit(totalAmount, LengthUnit.Yard, sb);//添加yard单位
//        totalAmount %= LengthUnit.Yard.getRateOfBase();
//        addUnit(totalAmount, LengthUnit.Foot, sb);//添加foot单位
//        totalAmount %= LengthUnit.Foot.getRateOfBase();
//        addUnit(totalAmount, LengthUnit.Inch, sb);//添加inch单位

        //return sb.toString().trim();
    }
    //根据unit添加单位
    private void addUnit(int totalAmount, LengthUnit unit, StringBuilder sb) {
        if (unit == null || totalAmount == 0) {//到达最低的单位了，或者totalAmount==0
            return;
        }
        int value = totalAmount / unit.getRateOfBase();
        if (value > 0) {
            sb.append(" " + value + " " + unit.name());
            //System.out.print(value + " " + unit.name() + " ");
        }
        addUnit(totalAmount % unit.getRateOfBase(), unit.getLowerUnit(), sb);
    }
}
