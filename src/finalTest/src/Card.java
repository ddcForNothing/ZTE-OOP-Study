package finalTest.src;

/**
 * Created by DDC on 2017/7/15.
 * 卡牌类
 */
public class Card implements Comparable<Card>{
    private final CardType type;//牌种类,后期枚举实现
    private final int num;//牌的值

    public int getNum() {
        return num;
    }
    public CardType getType() {
        return type;
    }

    private Card(CardType type, int num) {//后期简单工厂
        this.type = type;
        this.num = num;
    }

    //简单工厂,限定牌种类,只能存在4种牌
    public static Card createA(int num){
        return new Card(CardType.A, num);
    }
    public static Card createB(int num){
        return new Card(CardType.B, num);
    }
    public static Card createC(int num){
        return new Card(CardType.C, num);
    }
    public static Card createD(int num){
        return new Card(CardType.D, num);
    }

    @Override
    public int compareTo(Card card) {
        return (int) this.num - card.getNum();
    }

    @Override
    public boolean equals(Object o){
        if (o instanceof Card) {
            Card card = (Card) o;//强转
            return ((type.equals(card.getType()))
                    && (num == card.getNum()));
        }
        return false;
    }
    @Override
    public int hashCode(){
        return (int)(this.type.hashCode() + num);
    }
}
