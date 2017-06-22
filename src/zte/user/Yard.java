package zte.user;

/**
 * Created by Administrator on 2017/6/18.
 */
public class Yard extends Inch{
    private final int amount;

    public Yard(int amount) {
        //super(12 * 3 * amount);
        this.amount = amount;
    }

    @Override
    public int inchAmount(){
        return this.amount * 12 * 3;
    }
}
