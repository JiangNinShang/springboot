package com.example.demo.bean;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class Wtake implements Serializable {
    private Integer tid;
    private Integer tuid;
    private String tvalue;
    private String tvalue2;
    private Integer touid;
    private String tovalue;
    private String tovalue2;
    private Date time;
    private Date totime;
}