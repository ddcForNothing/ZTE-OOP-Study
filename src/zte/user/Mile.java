package zte.user;

/**
 * Created by Administrator on 2017/6/18.
 */
public class Mile {
    private final int amount;

    public Mile(int amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o){
        Mile mile = (Mile) o;
        return this.amount == mile.amount;
    }

    public Mile add(Object o) {
        Mile mile = (Mile) o;
        return new Mile(this.amount + mile.amount);
    }

    public Inch toInch() {
        return new Inch(this.amount * 1760 * 3 * 12);
    }
}
