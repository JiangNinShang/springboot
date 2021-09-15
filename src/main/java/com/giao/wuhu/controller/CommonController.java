package com.giao.wuhu.controller;

import com.giao.wuhu.config.ApiRestResponse;
import com.giao.wuhu.service.CommonService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author giao
 */
@RestController
@ControllerAdvice
public class CommonController {
    private static Logger logger = LogManager.getLogger(CommonController.class);
    private CommonService commonService;

    @GetMapping("/aa")
    private ApiRestResponse<Object> Login() {
        try {
            int i = 1 / 0;
        } catch (Exception e) {
            return ApiRestResponse.error(500, e.getMessage());
        }
        return ApiRestResponse.success();
    }
}
