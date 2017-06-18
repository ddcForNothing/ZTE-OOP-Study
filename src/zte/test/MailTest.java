package zte.test;

import org.junit.Test;
import zte.user.Mile;

import static org.junit.Assert.assertEquals;

/**
 * Created by Administrator on 2017/6/18.
 */
public class MailTest {
    @Test
    public void should_mile3_Add_mail2_equals_mail5() throws Exception{
        assertEquals(new Mile(5), new Mile(2).add(new Mile(3)));
    }
    @Test
    public void should_mile3_equals_mile3(){
        assertEquals(new Mile(3), new Mile(3));
    }
}
