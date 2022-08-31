package io.github.ctlove0523.mybatis.plus.util;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import io.github.ctlove0523.mybatis.plus.db.repository.ActorRepository;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = TestApplication.class)
@Ignore
public class BaseTest {

    @Autowired
    protected ActorRepository actorRepository;

    @Before
    public void clear() {
        actorRepository.remove(Wrappers.emptyWrapper());
    }
}
