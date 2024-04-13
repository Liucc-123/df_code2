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
 * @TableName view_567019224120164352
 * 工位预约记录
 */
@TableName(value ="view_567019224120164352")
@Data
public class StationReservedRecord implements Serializable {
    /**
     * 
     */
    @TableId
    private String id;

    /**
     * 备注
     */
    private String widget567019225999212548;

    /**
     * 结束时间
     */
    private Date widget567019225999212547;

    /**
     * 开始时间
     */
    private Date widget567019225999212546;

    /**
     * 工位信息
     */
    private String widget567019225999212545;

    /**
     * 申请人
     */
    private String widget567019225999212544;

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