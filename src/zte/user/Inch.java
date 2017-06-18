package zte.user;

/**
 * Created by Administrator on 2017/6/18.
 */
public class Inch{
    private final int amount;

    public Inch(int amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o){
        Inch mile = (Inch) o;
        return this.amount == mile.amount;
    }

    public Inch add(Object o) {
        Inch inch = (Inch) o;
        return new Inch(this.amount + inch.amount);
    }

    public Inch toInch() {
        return new Inch(this.amount);
    }
}
