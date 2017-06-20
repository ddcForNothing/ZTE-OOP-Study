package zte.test;

import org.junit.Test;
import zte.user.Foot;
import zte.user.Inch;
import zte.user.Mile;
import zte.user.Yard;

import static org.junit.Assert.assertEquals;

/**
 * Created by Administrator on 2017/6/20.
 * 不同类相等测试
 */
public class DiffClassEqualsTest {
    @Test
    public void mile_to_others_equalTest() throws Exception{
        //Mile类与其他类的相等测试
        assertEquals(new Mile(1), new Mile(1));
        assertEquals(new Mile(1), new Yard(1760));
        assertEquals(new Mile(1), new Foot(1760 * 3));
        assertEquals(new Mile(1), new Inch(1760 * 3 * 12));
    }

    @Test
    public void yard_to_others_equalTest() throws Exception{
        //Yard类与其他类的比较
        assertEquals(new Yard(1760), new Mile(1));
        assertEquals(new Yard(1), new Yard(1));
        assertEquals(new Yard(1), new Foot(3));
        assertEquals(new Yard(1), new Inch(3 * 12));
    }

    @Test
    public void foot_to_others_equalTest() throws Exception{
        //Foot类与其他类的比较
        assertEquals(new Foot(1760 * 3), new Mile(1));
        assertEquals(new Foot(3), new Yard(1));
        assertEquals(new Foot(1), new Foot(1));
        assertEquals(new Foot(1), new Inch(12));
    }

    @Test
    public void inch_to_others_equalTest() throws Exception{
        //Inch类与其他类的比较
        assertEquals(new Inch(1760 * 3 * 12), new Mile(1));
        assertEquals(new Inch(3 * 12), new Yard(1));
        assertEquals(new Inch(12), new Foot(1));
        assertEquals(new Inch(1), new Inch(1));
    }
}
