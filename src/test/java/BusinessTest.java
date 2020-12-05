import com.brainyi.mapper.BusinessMapper;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class BusinessTest {
    public static void main(String[] args) {
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
//        BusinessMapper bean = applicationContext.getBean(BusinessMapper.class);
//        BusinessExample example=new BusinessExample();
//        BusinessExample.Criteria criteria = example.createCriteria();
//        criteria.andBidEqualTo(2);
//        bean.deleteByExample(example);
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        BusinessMapper bean = applicationContext.getBean(BusinessMapper.class);
        System.out.println(bean.selectAllBusiness());
    }

}
