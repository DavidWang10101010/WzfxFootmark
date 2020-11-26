package com.wzfx.footmark.web.dao;

import com.wzfx.footmark.web.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserDao {

    int insertUser(User user);

    int deleteUserById(String id);

    int updateUserById(User user);

    User selectUserById(String id);

}
