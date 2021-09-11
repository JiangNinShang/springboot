package com.example.demo.controller;

import com.example.demo.bean.Wuser;
import com.example.demo.config.ApiRestResponse;
import com.example.demo.service.CommonService;
import org.springframework.web.bind.annotation.*;

@RestController
@ControllerAdvice
public class CommonController {
    private CommonService commonService;

    @GetMapping("/aa")
    private ApiRestResponse<Object> Login() {
        try {
            int i = 1/0;
        }catch (Exception e){
            return ApiRestResponse.error(500, e.getMessage());
        }
        return ApiRestResponse.success();
    }
}
