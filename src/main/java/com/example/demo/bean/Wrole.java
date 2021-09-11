package com.example.demo.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.w3c.dom.ls.LSException;

import javax.persistence.GeneratedValue;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.List;

@Data
@Table(name="Wrole")
public class Wrole implements Serializable,Cloneable {
    /**
     * 编号
     */
    @Id
    @GeneratedValue
    @TableId(type = IdType.ASSIGN_UUID)
    private Integer rid;
    /**
     * 角色名称
     */
    private String rname;
    /**
     * 删除标记
     */
    private String rstate;
    /**
     * 权限集合
     */
    private List<Wpermissions> wpermissions;
}

