import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import top.yannyi.designpatterns.DesignTestApplication;
import top.yannyi.designpatterns.observer.spring.EventPublisherBean;

/**
 * @Author: LeahAna
 * @Date: 2023/6/8 11:08
 * @Desc:
 */

@SpringBootTest(classes = DesignTestApplication.class)
public class DesignTest {

    @Autowired
    private EventPublisherBean eventPublisherBean;
    @Test
    public void testPublish(){
        eventPublisherBean.sendCustomEvent("message");
    }
}
