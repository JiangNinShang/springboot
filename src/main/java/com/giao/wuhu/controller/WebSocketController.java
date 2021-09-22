package com.giao.wuhu.controller;

import com.giao.wuhu.service.WebSocketService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: JNS
 * @date: 2021年09月22日 13:39
 */
@RestController
@RequestMapping("/websocket")
@Api("websocket")
public class WebSocketController {

    @GetMapping("/pushone")
    @ApiOperation("pushone")
    public void pushone()
    {
        WebSocketService.sendMessage("AuDi","*****");
    }
}