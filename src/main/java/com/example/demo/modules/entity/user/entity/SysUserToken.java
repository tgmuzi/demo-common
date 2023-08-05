package com.example.demo.modules.entity.user.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 */
@TableName("sys_user_token")
public class SysUserToken extends Model<SysUserToken> {

    private static final long serialVersionUID = 1L;

    @TableId("USER_ID")
    private Long userId;
    @TableField("TOKEN")
    private String token;
    @TableField("EXPIRE_TIME")
    private Date expireTime;
    @TableField("UPDATE_TIME")
    private Date updateTime;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Date getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Date expireTime) {
        this.expireTime = expireTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    protected Serializable pkVal() {
        return this.userId;
    }

    @Override
    public String toString() {
        return "SysUserToken{" +
                ", userId=" + userId +
                ", token=" + token +
                ", expireTime=" + expireTime +
                ", updateTime=" + updateTime +
                "}";
    }
}
