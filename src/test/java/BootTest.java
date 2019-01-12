import com.impl.MyComponentImpl;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BootTest {


    @Autowired
    MyComponentImpl myComponent;

    @Test
    public void test() {


      myComponent.print();

    }

    @SpringBootConfiguration
    @ComponentScan("com")
    static class ConfingSpringBoot {

    }
}
