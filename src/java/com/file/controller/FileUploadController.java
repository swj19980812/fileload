package com.file.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/siample")
public class FileUploadController {
    private static final Logger logger = LoggerFactory.getLogger(TestController.class);
    @RequestMapping("/upload")
    @ResponseBody
    public void fileUpload(){
        

    }
}
