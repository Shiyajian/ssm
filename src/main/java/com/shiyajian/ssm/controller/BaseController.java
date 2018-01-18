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
        return ((CurrtUser) session.getAttribute(CurrtUser.KEY)).getUserName();
    }

    protected String getCurrtUserId() {
        checkUserLogin();
        return ((CurrtUser) session.getAttribute(CurrtUser.KEY)).getUserId();
    }

    protected CurrtUser getCurrtUser() {
        checkUserLogin();
        return (CurrtUser) session.getAttribute(CurrtUser.KEY);
    }

    private void checkUserLogin() {
        if (null == session.getAttribute(CurrtUser.KEY)) {
            throw new NologinException("用户没有登录，session信息为空");
        }
    }
}
