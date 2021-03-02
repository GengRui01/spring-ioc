import controller.UserController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import vo.UserVo;

/**
 * @ClassName UserTest
 * @Description User模块测试类
 * @Author GengRui
 */
public class UserTest {
    public static void main(String[] args) {
        // 读取配置文件刷新Spring容器
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        // 从Spring容器拿Controller
        UserController userController = (UserController) context.getBean("userController");
        // 执行Controller层方法，因为之后还需要用到context对象，故下传
        UserVo userVo = userController.getVo(1, context);
        System.out.println(userVo);
    }
}
