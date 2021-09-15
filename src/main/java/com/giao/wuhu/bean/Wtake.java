package com.giao.wuhu.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * @author giao
 */
@Data
@Table(name = "Wtake")
public class Wtake implements Serializable, Cloneable {
    /**
     * 编号
     */
    @Id
    @GeneratedValue
    @TableId(type = IdType.UUID)
    private Integer tid;
    /**
     * 用户编号
     */
    private Integer tuid;
    /**
     * 内容
     */
    private String tvalue;
    /**
     * 内容2
     */
    private String tvalue2;
    /**
     * 回复用户
     */
    private Integer touid;
    /**
     * 回复内容
     */
    private String tovalue;
    /**
     * 回复内容2
     */
    private String tovalue2;
    /**
     * 评论时间
     */
    private Date time;
    /**
     * 回复评论时间
     */
    private Date totime;

}