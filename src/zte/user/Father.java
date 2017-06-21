package zte.user;

/**
 * Created by Administrator on 2017/6/18.
 * Foot Inch Mile Yard等类的抽象父类，定义相同的equal和add方法
 */
public class Father{
    /*
    private final int amount;

    public Father(int amount) {
        this.amount = amount;
    }
    @Override
    public boolean equals(Object o){
        Inch inch = ((Father) o).toInch();//直接转换为Inch类
        return this.toInch().getAmount() == inch.getAmount();
    }
    public Inch add(Object o) {
        Inch inch = ((Father) o).toInch();
        return new Inch(this.toInch().getAmount() + inch.getAmount());
    }
    public Inch toInch(){
        return new Inch(this.amount);
    }
    */
}
