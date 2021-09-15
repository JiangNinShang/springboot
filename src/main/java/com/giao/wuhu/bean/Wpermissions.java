package com.giao.wuhu.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import org.springframework.data.annotation.Id;

import javax.persistence.GeneratedValue;
import java.io.Serializable;

/**
 * @author: JNS
 * @date: 2021年09月08日 23:17
 */
@TableName("Wpermissions")
@Data
public class Wpermissions implements Serializable {
    /**
     * 编号
     */
    @Id
    @GeneratedValue
    @TableId(type = IdType.UUID)
    private Integer pid;
    /**
     * 名称
     */
    private String pname;
    /**
     * 路径
     */
    private String ppath;
    /**
     * 状态
     */
    private String pstate;

}