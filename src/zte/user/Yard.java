package zte.user;

/**
 * Created by Administrator on 2017/6/18.
 */
public class Yard extends Father{
    private final int amount;

    public Yard(int amount) {
        this.amount = amount;
    }
    /*
    @Override
    public boolean equals(Object o){
        Inch inch = ((Father) o).toInch();
        return this.toInch().getAmount() == inch.getAmount();
    }
    @Override
    public Inch add(Object o) {
        Inch inch = ((Father) o).toInch();
        return new Inch(this.toInch().getAmount() + inch.getAmount());
    }
    */

    @Override
    public Inch toInch() {
        return new Inch(this.amount * 3 * 12);
    }
}
