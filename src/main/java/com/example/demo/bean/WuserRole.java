package com.example.demo.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Table(name="WuserRole")
@Data
public class WuserRole implements Serializable,Cloneable {
    /**
     * 编号
     */
    @Id
    @GeneratedValue
    @TableId(type = IdType.ASSIGN_UUID)
    private Integer urid;
    /**
     * 用户编号
     */
    private Integer uid;
    /**
     * 权限编号
     */
    private Integer rid;
}