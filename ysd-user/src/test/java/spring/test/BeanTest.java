package spring.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import spring.config.AppConfig;

/**
 * @author xishengchun on 2017-03-31.
 * 测试基类
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)
@Transactional
public abstract class BeanTest {

    protected Logger logger = LogManager.getLogger(this.getClass());

    @Before
    public void setup() {

    }
}
