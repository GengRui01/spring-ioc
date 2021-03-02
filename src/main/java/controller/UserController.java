package controller;

import services.UserService;
import services.impl.UserServiceImpl;
import vo.UserVo;

/**
 * @ClassName UserController
 * @Description User模块Controller层
 * @Author GengRui
 */
public class UserController {
    private UserService userService;

    public UserVo getVo(Integer id) {
        // 手动实例化Service
        userService = new UserServiceImpl();
        // 执行Service层方法并返回
        return userService.getVo(id);
    }
}
