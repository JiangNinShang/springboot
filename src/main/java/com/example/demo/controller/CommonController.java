package com.example.demo.controller;

import com.example.demo.bean.Wuser;
import com.example.demo.service.CommonService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommonController {
    private CommonService commonService;

    @PostMapping("/login")
    private Object Login(@RequestBody Wuser wuser) {

        return new Object();
    }
}
