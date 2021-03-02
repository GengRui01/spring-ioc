package services.impl;

import dao.UserDao;
import entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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
    // 改为自动注入并指定需要注入的实例id
    @Autowired
    @Qualifier("userDaoImpl")
    private UserDao userDao;

    public UserVo getVo(Integer id) {
        // 执行Dao层方法
        User user = userDao.getEntity(id);
        // 省略业务逻辑处理。。。
        UserVo userVo = new UserVo(user);
        userVo.setGenderName(userVo.getGender() == 0 ? "female" : "male");
        return userVo;
    }
}
