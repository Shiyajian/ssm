package com.shiyajian.ssm.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.shiyajian.ssm.entity.common.CurrtUser;

public class BaseController {

    protected HttpServletRequest request;

    protected HttpServletResponse response;

    protected HttpSession session;

    protected String getCurrtUserName() {
        return "";
    }

    protected String getCurrtUserId() {
        return "";
    }

    protected CurrtUser getCurrtUser() {
        return (CurrtUser)session.getAttribute(CurrtUser.KEY);
    }
}
