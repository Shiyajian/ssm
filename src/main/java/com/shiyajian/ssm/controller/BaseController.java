package com.shiyajian.ssm.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.shiyajian.ssm.entity.common.CurrtUser;
import com.shiyajian.ssm.exception.NologinException;

public class BaseController {

    protected HttpServletRequest request;

    protected HttpServletResponse response;

    protected HttpSession session;

    protected String getCurrtUserName() {
        checkUserLogin();
        return getUser().getUserName();
    }

    protected String getCurrtUserId() {
        checkUserLogin();
        return getUser().getUserId();
    }

    protected CurrtUser getCurrtUser() {
        checkUserLogin();
        return getUser();
    }

    private CurrtUser getUser() {
        return (CurrtUser) session.getAttribute(CurrtUser.KEY);
    }

    private void checkUserLogin() {
        if (null == session.getAttribute(CurrtUser.KEY)) {
            throw new NologinException("用户没有登录，session信息为空");
        }
    }
}
