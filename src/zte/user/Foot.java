package zte.user;

/**
 * Created by Administrator on 2017/6/18.
 */
public class Foot extends Inch{
    private final int amount;

    public Foot(int amount) {
        //super(12 * amount);
        this.amount = amount;
    }
    @Override
    public int inchAmount(){
        return this.amount * 12;
    }
}
