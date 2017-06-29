package zte.test;

import org.junit.Test;
import user.Length;

import static org.junit.Assert.assertEquals;

/**
 * Created by Administrator on 2017/6/18.
 */
public class YardTest {
    /** 3yard + 2yard = 5yard */
    @Test
    public void should_yard3_Add_yard2_equals_yard5() throws Exception{
        assertEquals(Length.yard(5), Length.yard(2).add(Length.yard(3)));
    }
    /** 3yard = 3yard */
    @Test
    public void should_yard3_equals_yard3(){
        assertEquals(Length.yard(3), Length.yard(3));
    }

    @Test
    public void test() throws Exception{
        //检测Mile对象是不是Inch类型测试
        //(1)一个类的实例包括本身的实例,以及所有直接或间接子类的实例
        //(2)instanceof左边操作元显式声明的类型与右边
        //      操作元必须是同种类或右边是左边父类的继承关系
        //assertEquals(false, new Inch(1) instanceof Mile);
        //assertEquals(true, new Foot(1) instanceof Inch);
    }
}
