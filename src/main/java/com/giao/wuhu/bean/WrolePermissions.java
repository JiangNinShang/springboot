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
 * @author: JNS
 * @date: 2021年09月08日 23:18
 */
@Table(name = "WrolePermissions")
@Data
@TableName("角色权限表")
public class WrolePermissions implements Serializable {
    /**
     * 编号
     */
    @Id
    @GeneratedValue
    @TableId(type = IdType.UUID)
    @ApiModelProperty("id")
    private Integer wid;
    /**
     * 角色编号
     */
    @ApiModelProperty("角色编号")
    private Integer rid;
    /**
     * 权限编号
     */
    @ApiModelProperty("权限编号")
    private Integer pid;
    /**
     * 状态
     */
    @ApiModelProperty("状态")
    private String wstate;
}