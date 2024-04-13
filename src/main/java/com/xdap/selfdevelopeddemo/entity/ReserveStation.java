package com.xdap.selfdevelopeddemo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName view_567015780902764544
 * 申请工位
 */
@TableName(value ="view_567015780902764544")
@Data
public class ReserveStation implements Serializable {
    /**
     * 
     */
    @TableId
    private String id;

    /**
     * 申请单号
     */
    private String widget567024285491658752;

    /**
     * 空闲工位
     */
    private String widget567018596887166976;

    /**
     * 申请结束时间
     */
    private Date widget567017487040774146;

    /**
     * 申请开始时间
     */
    private Date widget567017487040774145;

    /**
     * 申请人
     */
    private String widget567017487040774144;

    /**
     * 单行输入
     */
    private String widget567015783129939970;

    /**
     * 单行输入
     */
    private String widget567015783129939969;

    /**
     * 单行输入
     */
    private String widget567015783129939968;

    /**
     * 
     */
    private String documentId;

    /**
     * 
     */
    private String tabDocId;

    /**
     * 
     */
    private String status;

    /**
     * 
     */
    private String approverId;

    /**
     * 
     */
    private String tenantId;

    /**
     * 
     */
    private String formId;

    /**
     * 
     */
    private String processId;

    /**
     * 
     */
    private String owner;

    /**
     * 
     */
    private String createdBy;

    /**
     * 
     */
    private Date creationDate;

    /**
     * 
     */
    private String lastUpdatedBy;

    /**
     * 
     */
    private Date lastUpdateDate;

    /**
     * 
     */
    private Integer objectVersionNumber;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}