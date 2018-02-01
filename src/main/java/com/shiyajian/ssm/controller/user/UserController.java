package com.shiyajian.ssm.controller.user;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.shiyajian.ssm.common.ResponseData;
import com.shiyajian.ssm.controller.BaseController;
import com.shiyajian.ssm.entity.vo.UserVo;

@RequestMapping("user")
@Controller
public class UserController extends BaseController {
    
    @PostMapping
    @ResponseBody
    public ResponseData addUser(UserVo user){
        return new ResponseData().success();
    }
    
    @PutMapping
    @ResponseBody
    public ResponseData updateUser(UserVo user){
        return new ResponseData().success();
    }
    
    @DeleteMapping("{userId}")
    @ResponseBody
    public ResponseData deleteUser(@PathVariable String userId){
        return new ResponseData().success();
    }
    
    @GetMapping
    @ResponseBody
    public ResponseData findUserList(){
        ArrayList arrayList = new ArrayList();
        return new ResponseData().success(arrayList);
    }
    @GetMapping("{userId}")
    @ResponseBody
    public ResponseData findUser(@PathVariable String userId){
        ArrayList arrayList = new ArrayList();
        return new ResponseData().success(arrayList);
    }
}
