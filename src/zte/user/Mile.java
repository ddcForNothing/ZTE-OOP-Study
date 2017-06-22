package zte.user;

/**
 * Created by Administrator on 2017/6/18.
 */
public class Mile extends Inch{
    private final int amount;

    public Mile(int amount) {
        this.amount = amount;
    }

    @Override
    public Inch toInch(){
        return new Inch(this.amount * 1760 * 3 * 12);
    }

    /*
    @Override
    public int inchAmount(){
        return this.amount * 1760 * 3 * 12;
    }
    */
}
