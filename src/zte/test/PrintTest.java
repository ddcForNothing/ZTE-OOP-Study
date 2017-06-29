package zte.test;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import user.Length;

import static org.junit.Assert.assertEquals;


/**
 * Created by Administrator on 2017/6/29.
 */
public class PrintTest {
    @Rule
    public final SystemOutRule log = new SystemOutRule().enableLog();

    @Test
    //打印测试
    public void printTest() throws Exception{
        log.clearLog();
        Length.inch(0).print();
        assertEquals(log.getLog().trim(), "0 Inch");

        log.clearLog();
        Length.foot(0).print();
        assertEquals(log.getLog().trim(), "0 Inch");

        log.clearLog();
        Length.yard(0).print();
        assertEquals(log.getLog().trim(), "0 Inch");

        log.clearLog();
        Length.mile(0).print();
        assertEquals(log.getLog().trim(), "0 Inch");

        log.clearLog();
        Length.inch(1586498).print();
        assertEquals(log.getLog().trim(), "25 Mile 69 Yard 1 Foot 2 Inch");

        log.clearLog();
        Length.foot(15865).print();
        assertEquals(log.getLog().trim(), "3 Mile 8 Yard 1 Foot");

        log.clearLog();
        Length.yard(1780).print();
        assertEquals(log.getLog().trim(), "1 Mile 20 Yard");

        log.clearLog();
        Length.mile(1780).print();
        assertEquals(log.getLog().trim(), "1780 Mile");
    }

}
