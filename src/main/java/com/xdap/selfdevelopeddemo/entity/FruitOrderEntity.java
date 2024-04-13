package com.xdap.selfdevelopeddemo.entity;

import com.definesys.mpaas.query.annotation.Column;
import com.definesys.mpaas.query.annotation.Style;
import com.definesys.mpaas.query.annotation.Table;
import com.xdap.api.moudle.base.entity.NoTenBasePojo;
import lombok.*;

/**
 * @project: defanyun-papaas
 * @package: com.xdap.fruit.entity
 * @author: miss
 * @date: 2021/6/28 21:51
 * @since:
 * @history: 1.2021/6/28 created by miss
 */
@EqualsAndHashCode(callSuper = true)
@Table(value = "cus_miss_fruit_order")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Style(Upper2Underline = true)
public class FruitOrderEntity extends NoTenBasePojo {

    private String id;

    @Column("document_id")
    private String documentId;

    private String status;

    @Column("tenant_id")
    private String tenantId;

    @Column("form_id")
    private String formId;

    @Column("process_id")
    private String processId;

    @Column("approver_id")
    private String approverId;

    @Column("fruit_order_no")
    private String fruitOriderNo;

    @Column("fruit_order_name")
    private String fruitOrderName;

    @Column("fruit_product_name")
    private String fruitProductName;

    @Column("fruit_product_type")
    private String fruitProductType;

    @Column("fruit_order_amount")
    private Double fruitOrderAmount;

}
