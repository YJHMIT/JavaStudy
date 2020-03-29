package com.example.demo.mapper;

import com.example.demo.entity.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;
import java.util.List;

@Mapper
public interface UserMapper {
    @Select("SELECT * FROM user")
    @Results({
            @Result(property = "name", column = "name")
    })
    List<User> getAll();
    @Select("select * from user where id=#{id}")
    User getById(int id);

    @Insert({"insert into user(id,name,gender) values(#{id},#{name},#{gender})"})
    void install(User user);

    @Update({"update user set name=#{name},gender=#{gender} where id=#{id}"})
    void Update(User user);

    @Delete("delete from user where id=#{id}")
    void delete(int id);
}