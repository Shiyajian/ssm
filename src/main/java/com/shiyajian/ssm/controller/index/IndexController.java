package com.shiyajian.ssm.controller.index;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.shiyajian.ssm.controller.BaseController;

@RequestMapping
@Controller
public class IndexController extends BaseController {

    @RequestMapping(value="index")
    public String index(){
        return "index";
    }
}
