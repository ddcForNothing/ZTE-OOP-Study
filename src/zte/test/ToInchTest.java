package zte.test;

import org.junit.Test;
import zte.user.Foot;
import zte.user.Inch;
import zte.user.Mile;
import zte.user.Yard;

import static org.junit.Assert.assertEquals;

/**
 * Created by Administrator on 2017/6/20.
 * toInch方法转换测试
 */
public class ToInchTest {
    @Test
    public void mile_toInch_test() throws Exception{
        //测试Mile类的toInch方法
        assertEquals(new Inch(1760*3*12).getAmount(), new Mile(1).toInch().getAmount());
    }

    @Test
    public void yard_toInch_test() throws Exception{
        //测试Yard类的toInch方法
        assertEquals(new Inch(3 * 12).getAmount(), new Yard(1).toInch().getAmount());
    }

    @Test
    public void foot_toInch_test() throws Exception{
        //测试Yard类的toInch方法
        assertEquals(new Inch(12).getAmount(), new Foot(1).toInch().getAmount());
    }

    @Test
    public void inch_toInch_test() throws Exception{
        //测试Inch类的toInch方法
        assertEquals(new Inch(1).getAmount(), new Inch(1).toInch().getAmount());
    }
}
