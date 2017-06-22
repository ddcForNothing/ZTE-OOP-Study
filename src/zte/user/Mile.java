package zte.user;

/**
 * Created by Administrator on 2017/6/18.
 */
public class Mile extends Inch{
    private final int amount;

    public Mile(int amount) {
        //super(1760 * 3 * 12 * amount);
        this.amount = amount;
    }

    @Override
    public int inchAmount(){
        return this.amount * 1760 * 3 * 12;
    }
}
