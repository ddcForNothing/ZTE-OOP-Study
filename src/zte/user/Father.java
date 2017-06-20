package zte.user;

/**
 * Created by Administrator on 2017/6/18.
 * Foot Inch Mile Yard等类的抽象父类，定义相同的equal和add方法
 */
public abstract class Father{
    @Override
    /**equal方法重写*/
    public boolean equals(Object o){
        Inch inch = ((Father) o).toInch();//直接转换为Inch类
        return this.toInch().getAmount() == inch.getAmount();
    }
    /**add方法*/
    public Inch add(Object o) {
        Inch inch = ((Father) o).toInch();
        return new Inch(this.toInch().getAmount() + inch.getAmount());
    }
    public abstract Inch toInch();
}
