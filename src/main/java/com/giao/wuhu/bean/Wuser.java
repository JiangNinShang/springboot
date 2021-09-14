package com.giao.wuhu.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

@Data
@Table(name = "Wuser")
public class Wuser implements Serializable, Cloneable {

    /**
     * 编号
     */
    @Id
    @GeneratedValue
    @TableId(type = IdType.UUID)
    private Integer uid;
    /**
     * 姓名
     */
    @NotEmpty(message = "用户名不能为空")
    private String name;
    /**
     * 头像
     */
    private String title;
    /**
     * 密码
     */
    @NotEmpty(message = "密码不能为空")
    private String pwd;
    /**
     * 状态
     */
    private Integer state;

    private List<Wrole> wroles;

    public List<Wpermissions> getPermissions() {
        List<Wpermissions> wpermissions = new LinkedList<>();
        for (Wrole wrole : this.getWroles()) {
            wpermissions.addAll(wrole.getWpermissions());
        }
        return wpermissions;
    }
}
