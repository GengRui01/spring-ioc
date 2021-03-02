package dao;

import entity.User;

/**
 * @InterfaceName UserDao
 * @Description User模块Dao层
 * @Author GengRui
 */
public interface UserDao {
    User getEntity(Integer id);
}
