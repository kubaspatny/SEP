import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MainTest {

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testF(){
        Assert.assertEquals(2, Main.f(2));
    }

    @Test
    public void testF2(){
        Assert.assertEquals(4, Main.f2(2));
    }

    @Test
    public void testF3(){
        Assert.assertEquals(6, Main.f3(2));
    }

}