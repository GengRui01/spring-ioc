import controller.UserController;
import vo.UserVo;

/**
 * @ClassName UserTest
 * @Description User模块测试类
 * @Author GengRui
 */
public class UserTest {
    public static void main(String[] args) {
        // 手动实例化Controller
        UserController userController = new UserController();
        // 执行Controller层方法
        UserVo userVo = userController.getVo(1);
        System.out.println(userVo);
    }
}
