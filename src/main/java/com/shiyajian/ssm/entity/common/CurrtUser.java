package com.shiyajian.ssm.entity.common;

import java.io.Serializable;

/**
 * 保存在session中的当前用户实体
 */
public class CurrtUser implements Serializable {

    public static final String KEY = "SESSION_CURRT_USER";

    private static final long serialVersionUID = 5592117890264281935L;

    private String userId;

    private String userName;

    public String getUserId() {

        return userId;
    }

    public String getUserName() {

        return userName;
    }

    public void setUserId(String userId) {

        this.userId = userId;
    }

    public void setUserName(String userName) {

        this.userName = userName;
    }

}
