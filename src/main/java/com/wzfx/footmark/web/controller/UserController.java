package com.wzfx.footmark.web.controller;

import com.wzfx.footmark.web.constants.ErrorCode;
import com.wzfx.footmark.web.entity.OperateResult;
import com.wzfx.footmark.web.entity.User;
import com.wzfx.footmark.web.exception.ServiceException;
import com.wzfx.footmark.web.service.IUserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController extends BaseController {

    private static Logger logger = Logger.getLogger(UserController.class);

    @Autowired
    private IUserService userService;

    @ResponseBody
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public void addUser(User user) {
        logger.info("addUser(User user) start ...");

        // 返回值
        OperateResult result = new OperateResult();

        try {
            user = userService.addUser(user);
            result.setData(user);
        } catch (ServiceException e) {
            logger.error("There is an exception(ServiceException) while invoke method addUser(User user):", e);
            result.setSuccess(false);
            result.setErrorCode(e.getMessage());
            result.setErrorCode(ErrorCode.getErrorMsg(e.getMessage()));
        } catch (Exception e) {
            logger.error("There is an exception while invoke method addUser(User user):", e);
            result.setSuccess(false);
            result.setErrorCode(ErrorCode.UNKNOWN_EXCEPTION.code());
            result.setErrorCode(ErrorCode.UNKNOWN_EXCEPTION.desc());
        } finally {
            responseJson(response, result);
        }

        logger.info("addUser(User user) end !!!");
    }

    @ResponseBody
    @RequestMapping("/deleteById")
    public void deleteUserById(String id) {
        logger.info("deleteUserById(String id) start ...");

        // 返回值
        OperateResult result = new OperateResult();

        User user;
        try {
            user = userService.deleteUserById(id);
            result.setData(user);
        } catch (ServiceException e) {
            logger.error("There is an exception(ServiceException) while invoke method deleteUserById(String id):", e);
            result.setSuccess(false);
            result.setErrorCode(e.getMessage());
            result.setErrorCode(ErrorCode.getErrorMsg(e.getMessage()));
        } catch (Exception e) {
            logger.error("There is an exception while invoke method deleteUserById(String id):", e);
            result.setSuccess(false);
            result.setErrorCode(ErrorCode.UNKNOWN_EXCEPTION.code());
            result.setErrorCode(ErrorCode.UNKNOWN_EXCEPTION.desc());
        } finally {
            responseJson(response, result);
        }

        logger.info("deleteUserById(String id) end !!!");
    }

    @ResponseBody
    @RequestMapping(value = "/modifyById", method = RequestMethod.POST)
    public void modifyUserById(User user) {
        logger.info("modifyUserById(User user) start ...");

        // 返回值
        OperateResult result = new OperateResult();

        try {
            user = userService.modifyUserById(user);
            result.setData(user);
        } catch (ServiceException e) {
            logger.error("There is an exception(ServiceException) while invoke method modifyUserById(User user):", e);
            result.setSuccess(false);
            result.setErrorCode(e.getMessage());
            result.setErrorCode(ErrorCode.getErrorMsg(e.getMessage()));
        } catch (Exception e) {
            logger.error("There is an exception while invoke method modifyUserById(User user):", e);
            result.setSuccess(false);
            result.setErrorCode(ErrorCode.UNKNOWN_EXCEPTION.code());
            result.setErrorCode(ErrorCode.UNKNOWN_EXCEPTION.desc());
        } finally {
            responseJson(response, result);
        }

        logger.info("modifyUserById(User user) end !!!");
    }

    @ResponseBody
    @RequestMapping("/findById")
    public void findById(String id) {
        logger.info("findById(String id) start ...");

        // 返回值
        OperateResult result = new OperateResult();

        try {
            User user = userService.getUserById(id);
            result.setData(user);
        } catch (ServiceException e) {
            logger.error("There is an exception(ServiceException) while invoke method findById(String id):", e);
            result.setSuccess(false);
            result.setErrorCode(e.getMessage());
            result.setErrorCode(ErrorCode.getErrorMsg(e.getMessage()));
        } catch (Exception e) {
            logger.error("There is an exception while invoke method findById(String id):", e);
            result.setSuccess(false);
            result.setErrorCode(ErrorCode.UNKNOWN_EXCEPTION.code());
            result.setErrorCode(ErrorCode.UNKNOWN_EXCEPTION.desc());
        } finally {
            responseJson(response, result);
        }

        logger.info("findById(String id) end !!!");
    }
}