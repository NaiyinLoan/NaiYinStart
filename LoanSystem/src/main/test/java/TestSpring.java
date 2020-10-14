import com.my.ssm.entity.Clazz;
import com.my.ssm.entity.Student;
import com.my.ssm.entity.Teacher;
import com.my.ssm.service.Insert;
import com.my.ssm.service.Query;
import com.my.ssm.service.imp.InsertService;
import com.my.ssm.service.imp.QueryService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Set;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class TestSpring {

    public void test1() throws Exception {

    }
}
