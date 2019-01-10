import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Auther: admin
 * @Date: 2019/1/7 09:52
 * @Description:
 */
public class SpringDataTest {

    private ApplicationContext ctx = null;

    @Before
    public void befor(){
        ctx = new ClassPathXmlApplicationContext("new-beans.xml");
        System.out.println("befor");
    }

    @After
    public void after(){
        ctx = null;
        System.out.println("after");
    }

    @Test
    public void testEntityManagerFactory(){

    }

}
