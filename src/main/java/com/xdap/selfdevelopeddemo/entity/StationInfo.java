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
 * @TableName view_567013448379006976
 * 工位信息
 */
@TableName(value ="view_567013448379006976")
@Data
public class StationInfo  implements Serializable {
    /**
     * 
     */
    @TableId
    private String id;

    /**
     * 备注
     */
    private String widget567013450279026690;

    /**
     * 工位名称
     */
    private String widget567013450279026689;

    /**
     * 工位编号
     */
    private String widget567013450279026688;

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