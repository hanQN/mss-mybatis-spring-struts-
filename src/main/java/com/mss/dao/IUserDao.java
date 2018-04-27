package com.mss.dao;

import com.mss.bean.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.mybatis.spring.annotation.MapperScan;

import java.util.List;

/**
 * Created by 123 on 2018/4/27.
 */
public interface IUserDao {

    public void addUser(User user);

    @Delete("delete from user where id=#{id}")
    public void delUser(Integer id);

    /*@Insert("insert into user values(#{username}, #{age}, #{orgin}, #{high})")
    public int insertUser(User user);*/

    @Select("select * from user where id=#{id}")
    public User getUserbyId(Integer id);

    @Select("select * from user ")
    public List<User> getAllUser();

}
