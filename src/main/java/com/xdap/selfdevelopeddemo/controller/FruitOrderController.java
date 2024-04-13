package com.xdap.selfdevelopeddemo.controller;

import com.definesys.mpaas.query.db.PageQueryResult;
import com.xdap.selfdevelopeddemo.entity.FruitOrderEntity;
import com.xdap.selfdevelopeddemo.service.FruitService;
import com.xdap.motor.annotation.RestWrapper;
import com.xdap.motor.vo.PageRespHelper;
import com.xdap.motor.vo.ResponseVo;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * @project: defanyun-papaas
 * @package: com.xdap.fruit.controller
 * @author: miss
 * @date: 2021/6/28 21:48
 * @since:
 * @history: 1.2021/6/28 created by miss
 */
@RequestMapping("/custom/fruit")
@RestController
@RequiredArgsConstructor
public class FruitOrderController {

    private final FruitService fruitService;

    @PostMapping("/save")
    @RestWrapper
    public FruitOrderEntity saveFruitOrder(@RequestBody FruitOrderEntity fruitOrderEntity) {
        return fruitService.saveFruitOrder(fruitOrderEntity);
    }

    @GetMapping("/list")
    @RestWrapper
    public PageRespHelper<FruitOrderEntity> listFruitOrderByPage(
                                                                 @RequestParam(value = "keyWord", required = false) String keyWord,
                                                                 @RequestParam(value = "page", required = true, defaultValue = "1") Integer page,
                                                                 @RequestParam(value = "pageSize", required = true, defaultValue = "10") Integer pageSize) {
        PageQueryResult<FruitOrderEntity> pageQueryResult = fruitService.listFruitOrderByPage(keyWord, page, pageSize);
        PageRespHelper<FruitOrderEntity> pageRespHelper = new PageRespHelper<>();
        pageRespHelper.setTable(pageQueryResult.getResult());
        pageRespHelper.setTotal(pageQueryResult.getCount().intValue());
        return pageRespHelper;
    }

    @GetMapping("/delete")
    public ResponseVo deleteFruitOrder(@RequestParam("documentId") String documentId) {
        fruitService.deleteFruitOrderByDocumentId(documentId);
        return ResponseVo.ok();
    }

    @GetMapping("/detail")
    @RestWrapper
    public FruitOrderEntity detailFruitOrder(@RequestParam("documentId") String documentId) {
        return fruitService.queryFruitOrderDetailByDocumentId(documentId);
    }

    @GetMapping("/pie")
    @RestWrapper
    public PageRespHelper fruitPie() {
        List<Map<String, Object>> fruitPieList = fruitService.fruitPie();
        PageRespHelper pageRespHelper = new PageRespHelper<>();
        pageRespHelper.setTable(fruitPieList);
        pageRespHelper.setTotal(fruitPieList.size());
        return pageRespHelper;
    }

    @GetMapping("/delete/test")
    public ResponseVo deleteTestFruitOrder(@RequestParam("documentId") String documentId) {
        fruitService.deleteTestFruitOrderByDocumentId();
        return ResponseVo.ok();
    }







}
