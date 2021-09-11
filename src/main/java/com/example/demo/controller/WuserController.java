package com.example.demo.controller;

import com.example.demo.bean.Wuser;
import com.example.demo.config.ApiRestResponse;
import com.example.demo.service.WuserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class WuserController extends CommonController {
    @Autowired
    private WuserService wuserService;


    @PostMapping("/login")
    private ApiRestResponse Login(@RequestBody Wuser wuser) {
        try {
            Wuser user = wuserService.Login(wuser);
            return ApiRestResponse.success(user);
        } catch (Exception e) {
            return ApiRestResponse.error(500, e.getMessage());
        }
    }
}
