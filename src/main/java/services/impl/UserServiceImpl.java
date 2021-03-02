package services.impl;

import dao.UserDao;
import entity.User;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;
import services.UserService;
import vo.UserVo;

/**
 * @ClassName UserServiceImpl
 * @Description User模块Service层实现类
 * @Author GengRui
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public UserVo getVo(Integer id, ApplicationContext context) {
        // 从Spring容器拿Dao
        userDao = (UserDao) context.getBean("userDao");
        // 执行Dao层方法
        User user = userDao.getEntity(id);
        // 省略业务逻辑处理。。。
        UserVo userVo = new UserVo(user);
        userVo.setGenderName(userVo.getGender() == 0 ? "female" : "male");
        return userVo;
    }
}
