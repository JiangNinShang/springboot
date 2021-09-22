package com.giao.wuhu.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.data.annotation.Id;

import javax.persistence.GeneratedValue;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.List;

/**
 * @author giao
 */
@Data
@Table(name = "Wrole")
@TableName("角色表")
public class Wrole implements Serializable, Cloneable {
    /**
     * 编号
     */
    @Id
    @GeneratedValue
    @TableId(type = IdType.UUID)
    @ApiModelProperty("id")
    private Integer rid;
    /**
     * 角色名称
     */
    @ApiModelProperty("角色名称")
    private String rname;
    /**
     * 删除标记
     */
    @ApiModelProperty("删除标记")
    private String rstate;
    /**
     * 权限集合
     */
    @ApiModelProperty("权限集合")
    private List<Wpermissions> wpermissions;
}

