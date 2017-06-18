package zte.test;

import org.junit.Test;
import zte.user.Yard;

import static org.junit.Assert.assertEquals;

/**
 * Created by Administrator on 2017/6/18.
 */
public class YardTest {
    /** 3yard + 2yard = 5yard */
    @Test
    public void should_yard3_Add_yard2_equals_yard5() throws Exception{
        assertEquals(new Yard(5), new Yard(2).add(new Yard(3)));
    }
    /** 3yard = 3yard */
    @Test
    public void should_yard3_equals_yard3(){
        assertEquals(new Yard(3), new Yard(3));
    }
}
