package com.example.demo.config;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * @author: JNS
 * @date: 2021年09月08日 1:56
 */

@Component
@Data
public class ServerConfig implements Serializable {
    private String path = "F:\\Java project\\demo\\src\\main\\resources\\test.p12";
    private String password = "123456";
    private int port = 8099;
}