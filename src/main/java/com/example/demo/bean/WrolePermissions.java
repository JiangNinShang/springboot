package com.example.demo.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author: JNS
 * @date: 2021年09月08日 23:18
 */
@Table(name="WrolePermissions")
@Data
public class WrolePermissions implements Serializable,Cloneable{
    /** 编号 */
    @Id
    @GeneratedValue
    @TableId(type = IdType.ASSIGN_UUID)
    private Integer wid ;
    /** 角色编号 */
    private Integer rid ;
    /** 权限编号 */
    private Integer pid ;
    /** 状态 */
    private String wstate ;
}