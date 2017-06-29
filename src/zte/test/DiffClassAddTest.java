package zte.test;

import org.junit.Test;
import user.*;

import static org.junit.Assert.assertEquals;

/**
 * Created by Administrator on 2017/6/20.
 * 不同类相加测试
 */
public class DiffClassAddTest {
    @Test
    public void mile_add_others_test() throws Exception{
        //Mile类与其他类相加测试
        assertEquals(Length.mile(2), Length.mile(1).add(Length.mile(1)));
        assertEquals(Length.yard(1760 + 1), Length.mile(1).add(Length.yard(1)));
        assertEquals(Length.foot(1760 * 3 + 1), Length.mile(1).add(Length.foot(1)));
        assertEquals(Length.inch(1760 * 3 * 12 + 1), Length.mile(1).add(Length.inch(1)));
    }

    @Test
    public void yard_add_others_test() throws Exception{
        //Mile类与其他类相加测试
        assertEquals(Length.yard(1760 + 1), Length.yard(1).add(Length.mile(1)));
        assertEquals(Length.yard(2), Length.yard(1).add(Length.yard(1)));
        assertEquals(Length.foot(3 + 1), Length.yard(1).add(Length.foot(1)));
        assertEquals(Length.inch(3 * 12 + 1), Length.yard(1).add(Length.inch(1)));
    }

    @Test
    public void foot_add_others_test() throws Exception{
        //Mile类与其他类相加测试
        assertEquals(Length.foot(1760 * 3 + 1), Length.foot(1).add(Length.mile(1)));
        assertEquals(Length.foot(3 + 1), Length.foot(1).add(Length.yard(1)));
        assertEquals(Length.foot(2), Length.foot(1).add(Length.foot(1)));
        assertEquals(Length.inch(12 + 1), Length.foot(1).add(Length.inch(1)));
    }

    @Test
    public void inch_add_others_test() throws Exception{
        //Mile类与其他类相加测试
        assertEquals(Length.inch(1760 * 3 * 12 + 1), Length.inch(1).add(Length.mile(1)));
        assertEquals(Length.inch(3 * 12 + 1), Length.inch(1).add(Length.yard(1)));
        assertEquals(Length.inch(12 + 1), Length.inch(1).add(Length.foot(1)));
        assertEquals(Length.inch(2), Length.inch(1).add(Length.inch(1)));
    }
}
