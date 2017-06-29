package zte.test;

import org.junit.Test;
import user.Length;

import static org.junit.Assert.assertEquals;

/**
 * Created by Administrator on 2017/6/18.
 */
public class InchTest {
    @Test
    public void should_Inch3_Add_Inch2_equals_Inch5() throws Exception{
        assertEquals(Length.inch(5), Length.inch(2).add(Length.inch(3)));
    }
    @Test
    public void should_Inch3_equals_Inch3(){
        assertEquals(Length.inch(3), Length.inch(3));
    }
}
