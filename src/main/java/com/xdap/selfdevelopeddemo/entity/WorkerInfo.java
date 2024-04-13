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
 * @TableName view_567016327399604224
 * 员工信息
 */
@TableName(value ="view_567016327399604224")
@Data
public class WorkerInfo implements Serializable {
    /**
     * 
     */
    @TableId
    private String id;

    /**
     * 备注
     */
    private String widget567016329316401154;

    /**
     * 员工名称
     */
    private String widget567016329316401153;

    /**
     * 员工编号
     */
    private String widget567016329316401152;

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