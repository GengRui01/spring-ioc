package services.impl;

import dao.UserDao;
import dao.impl.UserDaoImpl;
import entity.User;
import services.UserService;
import vo.UserVo;

/**
 * @ClassName UserServiceImpl
 * @Description User模块Service层实现类
 * @Author GengRui
 */
public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public UserVo getVo(Integer id) {
        // 手动实例化Dao
        userDao = new UserDaoImpl();
        // 执行Dao层方法
        User user = userDao.getEntity(id);
        // 省略业务逻辑处理。。。
        UserVo userVo = new UserVo(user);
        userVo.setGenderName(userVo.getGender() == 0 ? "female" : "male");
        return userVo;
    }
}
