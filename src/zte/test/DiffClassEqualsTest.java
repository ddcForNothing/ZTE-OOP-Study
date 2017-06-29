package zte.test;

import org.junit.Test;
import user.Length;

import static org.junit.Assert.assertEquals;

/**
 * Created by Administrator on 2017/6/20.
 * 不同类相等测试
 */
public class DiffClassEqualsTest {
    @Test
    public void mile_to_others_equalTest() throws Exception{
        //Mile类与其他类的相等测试
        assertEquals(Length.mile(1), Length.mile(1));
        assertEquals(Length.mile(1), Length.yard(1760));
        assertEquals(Length.mile(1), Length.foot(1760 * 3));
        assertEquals(Length.mile(1), Length.inch(1760 * 3 * 12));
    }

    @Test
    public void yard_to_others_equalTest() throws Exception{
        //Yard类与其他类的比较
        assertEquals(Length.yard(1760), Length.mile(1));
        assertEquals(Length.yard(1), Length.yard(1));
        assertEquals(Length.yard(1), Length.foot(3));
        assertEquals(Length.yard(1), Length.inch(3 * 12));
    }

    @Test
    public void foot_to_others_equalTest() throws Exception{
        //Foot类与其他类的比较
        assertEquals(Length.foot(1760 * 3), Length.mile(1));
        assertEquals(Length.foot(3), Length.yard(1));
        assertEquals(Length.foot(1), Length.foot(1));
        assertEquals(Length.foot(1), Length.inch(12));
    }

    @Test
    public void inch_to_others_equalTest() throws Exception{
        //Inch类与其他类的比较
        assertEquals(Length.inch(1760 * 3 * 12), Length.mile(1));
        assertEquals(Length.inch(3 * 12), Length.yard(1));
        assertEquals(Length.inch(12), Length.foot(1));
        assertEquals(Length.inch(1), Length.inch(1));
    }
}
