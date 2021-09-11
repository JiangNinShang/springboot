package com.example.demo.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import org.springframework.data.annotation.Id;

import javax.persistence.GeneratedValue;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @author: JNS
 * @date: 2021年09月08日 23:17
 */
@TableName("Wpermissions")
@Data
public class Wpermissions implements Serializable,Cloneable{
    /** 编号 */
    @Id
    @GeneratedValue
    @TableId(type = IdType.ASSIGN_UUID)
    private Integer pid ;
    /** 名称 */
    private String pname ;
    /** 路径 */
    private String ppath ;
    /** 状态 */
    private String pstate ;

}