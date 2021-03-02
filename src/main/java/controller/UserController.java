package controller;

import org.springframework.context.ApplicationContext;
import services.UserService;
import vo.UserVo;

/**
 * @ClassName UserController
 * @Description User模块Controller层
 * @Author GengRui
 */
public class UserController {
    private UserService userService;

    public UserVo getVo(Integer id, ApplicationContext context) {
        // 从Spring容器拿Service
        userService = (UserService) context.getBean("userService");
        // 执行Service层方法，因为之后还需要用到context对象，故下传
        return userService.getVo(id, context);
    }
}
