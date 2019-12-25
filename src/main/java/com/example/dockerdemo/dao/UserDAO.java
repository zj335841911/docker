package com.example.dockerdemo.dao;

import com.example.dockerdemo.entity.User;
import org.apache.ibatis.annotations.*;


import java.util.List;
@Mapper
public interface UserDAO {
    @Insert("insert into user(username,upassword) values(#{username},#{upassword})")
    public int insert(User user);
    @Delete("delete from user where id=#{id}")
    public int delete(User user);
    @Update("update user set username=#{username},upassword=#{upassword} where id=#{id}")
    public int update(User user);
    @Select("select * from user")
    public List<User> selectUser();

    public User findById(User user);
}
