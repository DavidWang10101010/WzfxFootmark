package com.wzfx.footmark.web.entity;

import com.wzfx.footmark.web.constants.LogicDelete;

import java.io.Serializable;
/**
 * 业务实体基本类，所有业务实体必需继承此类
 *
 * @author wangweizhen
 * @version 1.0
 */
public class BusinessObject implements Serializable {

    /**
     * 序列化ID
     */
    private static final long serialVersionUID = 1L;

    /**
     * 业务实体UUID唯一标识，一般对应主键
     */
    private String id;

    /**
     * 该业务实体数据创建时间
     */
    private String createTime;

    /**
     * 该业务实体数据创建用户ID
     */
    private String createUser;

    /**
     * 该业务实体数据最后修改时间
     */
    private String modifyTime;

    /**
     * 该业务实体数据最后修改用户ID
     */
    private String modifyUser;

    /**
     * 业务实体描述信息
     */
    private String description;

    /**
     * SQLID， 用于临时传递MyBatis的SQLID
     */
    private String sqlId;

    /**
     * 逻辑删除
     * 0:表示正常状态 1:逻辑删除状态  默认为0，不为空
     */
    private String logicDelete = LogicDelete.NORMAL.code();

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getLogicDelete() {
        return logicDelete;
    }

    public String getCreateTime() {

        return createTime;
    }

    public void setCreateTime(String createTime) {

        this.createTime = createTime;
    }

    public String getCreateUser() {

        return createUser;
    }

    public void setCreateUser(String createUser) {

        this.createUser = createUser;
    }

    public BusinessObject() {
    }

    public String getDescription() {

        return description;
    }

    public void setDescription(String description) {

        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public String getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(String modifyTime) {
        this.modifyTime = modifyTime;
    }

    public String getModifyUser() {
        return modifyUser;
    }

    public void setModifyUser(String modifyUser) {
        this.modifyUser = modifyUser;
    }

    public String getSqlId() {
        return sqlId;
    }

    public void setSqlId(String sqlId) {
        this.sqlId = sqlId;
    }

    public void setLogicDelete(String logicDelete) {
        this.logicDelete = logicDelete;
    }

}
