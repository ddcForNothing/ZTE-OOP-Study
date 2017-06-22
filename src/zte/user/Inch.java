package zte.user;

/**
 * Created by Administrator on 2017/6/18.
 */
public class Inch{

    private final int amount;

    public int getAmount() {
        return amount;
    }

    public Inch(int amount) {
        this.amount = amount;
    }

    /**空构造方法*/
    public Inch(){
        this.amount = 10;//amount初始化
    }
    /**返回转换为Inch类所对应的amount值*/
    //public int inchAmount(){
    //    return this.amount;
    //}

    @Override
    /**equal方法重写*/
    public boolean equals(Object o){
        if (o instanceof Inch) {//检测o 是否属于Inch类型或者其子类
            Inch inch = ((Inch) o).toInch();//直接转换为Inch类
            return this.toInch().getAmount() == inch.getAmount();
        }
        return false;
    }
    /**add方法*/
    public Inch add(Object o) {
        if (o instanceof Inch) {
            Inch inch = ((Inch) o).toInch();
            return new Inch(this.toInch().getAmount() + inch.getAmount());
        }
        return this;//如果检测失败，返回原类
    }
    public Inch toInch(){
        return new Inch(this.getAmount());
    }

}
