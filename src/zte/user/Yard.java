package zte.user;

/**
 * Created by Administrator on 2017/6/18.
 */
public class Yard {
    private final int amount;

    public Yard(int amount) {
        this.amount = amount;
    }
    @Override
    public boolean equals(Object o){
        Yard yard = (Yard) o;
        return this.amount == yard.amount;
    }

    public Yard add(Object o) {
        Yard yard = (Yard) o;
        return new Yard(this.amount + yard.amount);
    }

    public Inch toInch() {
        return new Inch(this.amount * 3 * 12);
    }
}
