import com.brainyi.mapper.BusinessMapper;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BusinessTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        BusinessMapper bean = applicationContext.getBean(BusinessMapper.class);
        System.out.println(bean.selectAllBusiness());
    }
}
