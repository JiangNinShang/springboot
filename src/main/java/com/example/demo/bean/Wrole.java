package com.example.demo.bean;

import lombok.Data;

import java.io.Serializable;

@Data
public class Wrole implements Serializable {
    private Integer rid;
    private String rname;
    private String rpath;
}
