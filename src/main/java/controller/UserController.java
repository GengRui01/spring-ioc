package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import services.UserService;
import vo.UserVo;

/**
 * @ClassName UserController
 * @Description User模块Controller层
 * @Author GengRui
 */
@Controller
public class UserController {
    // 改为自动注入
    @Autowired
    private UserService userService;

    public UserVo getVo(Integer id) {
        return userService.getVo(id);
    }
}
