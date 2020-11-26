package com.wzfx.footmark.web.controller;

import com.alibaba.fastjson.JSON;
import com.wzfx.footmark.web.entity.RequestResult;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

public class BaseController {

    private static Logger logger = Logger.getLogger(BaseController.class);

    @Autowired
    protected HttpServletRequest request;

    @Autowired
    protected HttpServletResponse response;

    /**
     * @MethodName	responseJson
     * @description	向前端响应JSON串
     * @param 		response
     * @param 		obj		需要返回对象到页面
     */
    public void responseJson(HttpServletResponse response, Object obj) {
        PrintWriter printWriter;
        String json = "";
        response.setContentType("text/json; charset=utf-8");
        try {
            printWriter = response.getWriter();
            if (obj != null) {
                json = JSON.toJSONString(obj);
            } else {
                json = JSON.toJSONString(new RequestResult());
            }
            logger.info("====> return value:" + json);
            printWriter.print(json);
            printWriter.flush();
            printWriter.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
