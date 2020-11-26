package com.wzfx.footmark.web.service.impl;

/**
 * Created by wangweizhen on 2020/11/23.
 */

import javax.annotation.Resource;

import com.wzfx.footmark.web.constants.ErrorCode;
import com.wzfx.footmark.web.dao.IUserDao;
import com.wzfx.footmark.web.entity.User;
import com.wzfx.footmark.web.exception.ServiceException;
import com.wzfx.footmark.web.service.IUserService;
import com.wzfx.footmark.web.util.StrUtil;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import java.util.UUID;


@Service
public class UserServiceImpl implements IUserService {

    private static Logger logger = Logger.getLogger(UserServiceImpl.class);

    @Resource
    private IUserDao userDao;

    @Override
    public User addUser(User user) throws ServiceException {
        logger.info("addUser(User user) start ...");

        // 生成UUID
        if (StrUtil.isEquateNullStr(user.getId())) {
            user.setId(UUID.randomUUID().toString().replace("-", ""));
        }
        try {
            userDao.insertUser(user);
        } catch (Exception e) {
            logger.error("There is an exception while invoke method addUser(User user):", e);
            throw new ServiceException(ErrorCode.DATABASE_EXCEPTION.code());
        }

        logger.info("addUser(User user) end !!!");
        return user;
    }

    @Override
    public User deleteUserById(String id) throws ServiceException {
        logger.info("deleteUserById(String id) start ...");

        User user = new User();
        try {
            user.setId(id);
            userDao.deleteUserById(id);
        } catch (Exception e) {
            logger.error("There is an exception while invoke method deleteUserById(String id):", e);
            throw new ServiceException(ErrorCode.DATABASE_EXCEPTION.code());
        }

        logger.info("deleteUserById(String id) end !!!");
        return user;
    }

    @Override
    public User modifyUserById(User user) throws ServiceException {
        logger.info("modifyUserById(User user) start ...");

        try {
            userDao.updateUserById(user);
        } catch (Exception e) {
            logger.error("There is an exception while invoke method modifyUserById(User user):", e);
            throw new ServiceException(ErrorCode.DATABASE_EXCEPTION.code());
        }

        logger.info("modifyUserById(User user) end !!!");
        return user;
    }

    @Override
    public User getUserById(String id) throws ServiceException {
        logger.info("getUserById(String id) start ...");

        User user;
        try {
            user = userDao.selectUserById(id);
        } catch (Exception e) {
            logger.error("There is an exception while invoke method getUserById(String id):", e);
            throw new ServiceException(ErrorCode.DATABASE_EXCEPTION.code());
        }

        logger.info("getUserById(String id) end !!!");
        return user;
    }

}