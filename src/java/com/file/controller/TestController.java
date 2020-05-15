package com.file.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class TestController {
    private static final Logger logger = LoggerFactory.getLogger(TestController.class);

    //映射一个action
    @RequestMapping("/index")
    public  String index(){
        //输出日志文件
        //logger.info("the first jsp pages");
        //返回一个index.jsp这个视图
        System.out.println("这是一次测试");
        return "index";
    }
}
