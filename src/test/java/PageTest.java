import com.brainyi.domain.ClientExample;
import com.brainyi.mapper.ClientMapper;
import com.brainyi.mapper.SysUserMapper;
import com.brainyi.util.RedisUtil;
import com.github.pagehelper.PageHelper;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * TODO
 *
 * @author ahao 2020-11-27
 */
public class PageTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
    }
}
