package com.giao.wuhu.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @author giao
 */
@Table(name = "WuserRole")
@Data
@TableName("用户角色表")
public class WuserRole implements Serializable, Cloneable {
    /**
     * 编号
     */
    @Id
    @GeneratedValue
    @TableId(type = IdType.UUID)
    @ApiModelProperty("id")
    private Integer urid;
    /**
     * 用户编号
     */
    @ApiModelProperty("用户ID")
    private Integer uid;
    /**
     * 权限编号
     */
    @ApiModelProperty("权限ID")
    private Integer rid;
}