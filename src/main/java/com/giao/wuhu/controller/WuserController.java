package com.giao.wuhu.controller;

import cn.hutool.json.JSONUtil;
import com.giao.wuhu.bean.Wuser;
import com.giao.wuhu.config.ApiRestResponse;
import com.giao.wuhu.service.WuserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author giao
 */
@RestController
@RequestMapping("user")
@Api("用户管理api")
public class WuserController extends CommonController {
    @Autowired
    private WuserService wuserService;
    private static Logger logger = LogManager.getLogger(WuserController.class);

    @PostMapping("/login")
    @ApiOperation("用户登录")
    private ApiRestResponse Login(@RequestBody Wuser wuser) {
        try {
            Wuser user = wuserService.Login(wuser);
            return ApiRestResponse.success(JSONUtil.parse(user));
        } catch (Exception e) {
            logger.error(e.getMessage());
            return ApiRestResponse.error(500, e.getMessage());
        }
    }
}
