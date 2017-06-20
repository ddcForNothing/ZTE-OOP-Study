package zte.test;

import org.junit.Test;
import zte.user.Foot;
import zte.user.Inch;
import zte.user.Mile;
import zte.user.Yard;

import static org.junit.Assert.assertEquals;

/**
 * Created by Administrator on 2017/6/20.
 * 不同类相加测试
 */
public class DiffClassAddTest {
    @Test
    public void mile_add_others_test() throws Exception{
        //Mile类与其他类相加测试
        assertEquals(new Mile(2), new Mile(1).add(new Mile(1)));
        assertEquals(new Yard(1760 + 1), new Mile(1).add(new Yard(1)));
        assertEquals(new Foot(1760 * 3 + 1), new Mile(1).add(new Foot(1)));
        assertEquals(new Inch(1760 * 3 * 12 + 1), new Mile(1).add(new Inch(1)));
    }

    @Test
    public void yard_add_others_test() throws Exception{
        //Mile类与其他类相加测试
        assertEquals(new Yard(1760 + 1), new Yard(1).add(new Mile(1)));
        assertEquals(new Yard(2), new Yard(1).add(new Yard(1)));
        assertEquals(new Foot(3 + 1), new Yard(1).add(new Foot(1)));
        assertEquals(new Inch(3 * 12 + 1), new Yard(1).add(new Inch(1)));
    }

    @Test
    public void foot_add_others_test() throws Exception{
        //Mile类与其他类相加测试
        assertEquals(new Foot(1760 * 3 + 1), new Foot(1).add(new Mile(1)));
        assertEquals(new Foot(3 + 1), new Foot(1).add(new Yard(1)));
        assertEquals(new Foot(2), new Foot(1).add(new Foot(1)));
        assertEquals(new Inch(12 + 1), new Foot(1).add(new Inch(1)));
    }

    @Test
    public void inch_add_others_test() throws Exception{
        //Mile类与其他类相加测试
        assertEquals(new Inch(1760 * 3 * 12 + 1), new Inch(1).add(new Mile(1)));
        assertEquals(new Inch(3 * 12 + 1), new Inch(1).add(new Yard(1)));
        assertEquals(new Inch(12 + 1), new Inch(1).add(new Foot(1)));
        assertEquals(new Inch(2), new Inch(1).add(new Inch(1)));
    }
}
