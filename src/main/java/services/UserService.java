package services;

import org.springframework.context.ApplicationContext;
import vo.UserVo;

/**
 * @InterfaceName UserService
 * @Description User模块Service层
 * @Author GengRui
 */
public interface UserService {
    UserVo getVo(Integer id, ApplicationContext context);
}
