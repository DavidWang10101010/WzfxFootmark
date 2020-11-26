package com.wzfx.footmark.web.service;

import com.wzfx.footmark.web.entity.User;
import com.wzfx.footmark.web.exception.ServiceException;

public interface IUserService {

    public User addUser(User user) throws ServiceException;

    public User deleteUserById(String id) throws ServiceException;

    public User modifyUserById(User user) throws ServiceException;

    public User getUserById(String id) throws ServiceException;

}
