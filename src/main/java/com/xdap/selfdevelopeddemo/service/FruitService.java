package com.xdap.selfdevelopeddemo.service;

import com.definesys.mpaas.query.MpaasQuery;
import com.definesys.mpaas.query.db.PageQueryResult;
import com.definesys.mpaas.transaction.DAPTransaction;
import com.xdap.selfdevelopeddemo.entity.FruitOrderEntity;
import com.xdap.motor.entity.SnowflakeIdWorker;
import com.xdap.runtime.service.RuntimeAppContextService;
import com.xdap.runtime.service.RuntimeDatasourceService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @project: defanyun-papaas
 * @package: com.xdap.fruit.service
 * @author: miss
 * @date: 2021/6/21 16:46
 * @since:
 * @history: 1.2021/6/21 created by miss
 */
@Service
@RequiredArgsConstructor
public class FruitService {

    private final RuntimeDatasourceService runtimeDatasourceService;

    private final RuntimeAppContextService runtimeAppContextService;

    private final SnowflakeIdWorker snowflakeIdWorker;

    public PageQueryResult<FruitOrderEntity> listFruitOrderByPage(String keyWord, int page, int pageSize) {
        String currentTenantId = runtimeAppContextService.getCurrentTenantId();
        MpaasQuery mpaasQuery = runtimeDatasourceService.buildTenantMpaasQuery("xdap_app_" + currentTenantId);
        return mpaasQuery
                .or()
                .like("fruit_order_no", keyWord)
                .like("fruit_product_name", keyWord)
                .like("fruit_product_type", keyWord)
                .conjuctionAnd()
                .doPageQuery(page, pageSize, FruitOrderEntity.class);

    }

    public FruitOrderEntity queryFruitOrderDetailByDocumentId(String documentId) {

        return runtimeDatasourceService.buildTenantMpaasQuery("xdap_app_270880224093143041")
                .eq("document_id", documentId)
                .doQueryFirst(FruitOrderEntity.class);
    }

    public void deleteFruitOrderByDocumentId(String documentId) {
        runtimeDatasourceService.buildTenantMpaasQuery("xdap_app_270880224093143041")
                .eq("document_id", documentId)
                .doDelete(FruitOrderEntity.class);
    }

    public FruitOrderEntity saveFruitOrder(FruitOrderEntity fruitOrderEntity) {
        fruitOrderEntity.setId(snowflakeIdWorker.nextId());
        fruitOrderEntity.setDocumentId(snowflakeIdWorker.nextId());
        fruitOrderEntity.setFormId("61e578dc95ddee2224b0c6ac");
        fruitOrderEntity.setTenantId(runtimeAppContextService.getCurrentTenantId());
        runtimeDatasourceService.buildTenantMpaasQuery("xdap_app_270880224093143041")
                .doMerge(fruitOrderEntity);
        return fruitOrderEntity;
    }

    public List<Map<String, Object>> fruitPie() {
        return runtimeDatasourceService.buildTenantMpaasQuery("xdap_app_270880224093143041")
                .sql(String.format("select fruit_product_name as label, count(1) as value from %s.%s group by fruit_product_name", "xdap_app_254638499280453633", "miss_fruit_order"))
                .doQuery();
    }

    public List<Map<String, Object>> buildBusinessMpaasQueryTest() {
        MpaasQuery mpaasQuery = runtimeDatasourceService.buildBusinessMpaasQuery("backend_train", "miss_fruit_order");
        return mpaasQuery.sql("select * from miss_fruit_order").doQuery();
    }

    @DAPTransaction
    public void deleteTestFruitOrderByDocumentId() {
        runtimeDatasourceService.buildTenantMpaasQuery("xdap_app_508026731576164353")
                .eq("id", "111")
                .doDelete(FruitOrderEntity.class);
        throw new RuntimeException("111");
    }


}
