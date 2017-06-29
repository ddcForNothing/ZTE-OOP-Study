package zte.test;

import org.junit.Test;
import user.Length;

import static org.junit.Assert.assertEquals;

/**
 * Created by Administrator on 2017/6/18.
 */
public class MailTest {
    @Test
    public void should_mile3_Add_mail2_equals_mail5() throws Exception{
        assertEquals(Length.mile(5), Length.mile(2).add(Length.mile(3)));
    }
    @Test
    public void should_mile3_equals_mile3(){
        assertEquals(Length.mile(3), Length.mile(3));
    }
}
