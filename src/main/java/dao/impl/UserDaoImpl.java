package dao.impl;

import dao.UserDao;
import entity.User;
import org.springframework.stereotype.Repository;

/**
 * @ClassName UserDaoImpl
 * @Description User模块Dao层实现类
 * @Author GengRui
 */
@Repository("userDao")
public class UserDaoImpl implements UserDao {
    public User getEntity(Integer id) {
        // 此处应该从数据库查询值 方便起见直接返回一个固定对象
        User user = new User();
        user.setId(1);
        user.setName("Anne");
        user.setGender(0);
        return user;
    }
}
