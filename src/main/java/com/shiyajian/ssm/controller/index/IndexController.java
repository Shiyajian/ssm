package com.shiyajian.ssm.controller.index;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping
public class IndexController {

    @GetMapping(value="index")
    public String index(){
        return "";
    }
}
