package zte.test;

import org.junit.Test;
import user.Length;

import static org.junit.Assert.assertEquals;

/**
 * Created by Administrator on 2017/6/18.
 */
public class FootTest {
    @Test
    public void should_Foot3_Add_Foot2_equals_Foot5() throws Exception{
        assertEquals(Length.foot(5), Length.foot(2).add(Length.foot(3)));
    }
    @Test
    public void should_Foot3_equals_Foot3(){
        assertEquals(Length.foot(3), Length.foot(3));
    }
}
