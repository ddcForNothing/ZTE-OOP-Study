package zte.test;

import org.junit.Test;
import zte.user.Foot;

import static org.junit.Assert.assertEquals;

/**
 * Created by Administrator on 2017/6/18.
 */
public class FootTest {
    @Test
    public void should_Foot3_Add_Foot2_equals_Foot5() throws Exception{
        assertEquals(new Foot(5), new Foot(2).add(new Foot(3)));
    }
    @Test
    public void should_Foot3_equals_Foot3(){
        assertEquals(new Foot(3), new Foot(3));
    }
}
