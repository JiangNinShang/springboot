package com.giao.wuhu.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

/**
 * @author giao
 */
@Data
@Table(name = "Wuser")
@TableName("用户表")
public class Wuser implements Serializable, Cloneable {

    /**
     * 编号
     */
    @Id
    @GeneratedValue
    @TableId(type = IdType.UUID)
    @ApiModelProperty("id")
    private Integer uid;
    /**
     * 姓名
     */
    @NotEmpty(message = "用户名不能为空")
    @ApiModelProperty("用户名")
    private String name;
    /**
     * 头像
     */
    @ApiModelProperty("头像")
    private String title;
    /**
     * 密码
     */
    @NotEmpty(message = "密码不能为空")
    @ApiModelProperty("密码")
    private String pwd;
    /**
     * 状态
     */
    @ApiModelProperty("状态")
    private Integer state;
}
