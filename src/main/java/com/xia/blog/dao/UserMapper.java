package com.xia.blog.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xia.blog.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper extends BaseMapper<User> {
    
   /* *
   @Select("SELECT * FROM users WHERE id = #{id}")
    User findById(Integer id);
    */
    
}