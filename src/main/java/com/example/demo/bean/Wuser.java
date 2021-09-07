package com.example.demo.bean;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

@Data
public class Wuser implements Serializable {
    private Integer uid;
    @NotEmpty(message = "用户名不能为空")
    private String name;
    @NotEmpty(message = "密码不能为空")
    private String pwd;
    private String title;
}
