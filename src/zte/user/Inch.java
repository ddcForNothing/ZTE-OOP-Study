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

    @Override
    /**equal方法重写*/
    public boolean equals(Object o){
        Inch inch = ((Inch) o).toInch();//直接转换为Inch类
        return this.toInch().getAmount() == inch.getAmount();
    }
    /**add方法*/
    public Inch add(Object o) {
        Inch inch = ((Inch) o).toInch();
        return new Inch(this.toInch().getAmount() + inch.getAmount());
    }
    public Inch toInch(){
        return new Inch(this.amount);
    }

}
