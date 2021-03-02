package vo;

import entity.User;

/**
 * @ClassName UserVo
 * @Description User模块视图类
 * @Author GengRui
 */
public class UserVo {
    private Integer id;
    private String name;
    private Integer gender;
    private String genderName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getGenderName() {
        return genderName;
    }

    public void setGenderName(String genderName) {
        this.genderName = genderName;
    }

    public UserVo() {
    }

    public UserVo(User user) {
        this.id = user.getId();
        this.name = user.getName();
        this.gender = user.getGender();
    }

    @Override
    public String toString() {
        return "UserVo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", genderName='" + genderName + '\'' +
                '}';
    }
}
