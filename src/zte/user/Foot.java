package zte.user;

/**
 * Created by Administrator on 2017/6/18.
 */
public class Foot {
    private final int amount;

    public Foot(int amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o){
        Foot mile = (Foot) o;
        return this.amount == mile.amount;
    }

    public Foot add(Object o) {
        Foot mile = (Foot) o;
        return new Foot(this.amount + mile.amount);
    }

    public Inch toInch() {
        return new Inch(this.amount * 12);
    }
}
