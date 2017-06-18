package zte.test;

import org.junit.Test;
import zte.user.Inch;

import static org.junit.Assert.assertEquals;

/**
 * Created by Administrator on 2017/6/18.
 */
public class InchTest {
    @Test
    public void should_Inch3_Add_Inch2_equals_Inch5() throws Exception{
        assertEquals(new Inch(5), new Inch(2).add(new Inch(3)));
    }
    @Test
    public void should_Inch3_equals_Inch3(){
        assertEquals(new Inch(3), new Inch(3));
    }
}
