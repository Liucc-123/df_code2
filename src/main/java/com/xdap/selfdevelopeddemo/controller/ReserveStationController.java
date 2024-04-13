package com.xdap.selfdevelopeddemo.controller;

import com.xdap.selfdevelopeddemo.entity.StationInfo;
import com.xdap.selfdevelopeddemo.result.R;
import com.xdap.selfdevelopeddemo.service.StationReservedRecordService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName: ReserveStationController
 * @Description: 工位申请控制器
 * @author: liuchuangchuang
 * @date: 2024/4/13 17:45
 * @version: V1.0
 */
@RestController
@RequestMapping("/custom/stationreserve")
@Slf4j
public class ReserveStationController {

    @Autowired
    private StationReservedRecordService stationReservedRecordService;
    /**
     * 申请空闲工位
     * @param startTime 申请开始时间
     * @param endTime 申请结束时间
     * @return 空闲工位集合
     */
    @PostMapping("/reserve")
    public R reserveStation(@RequestParam("startTime") String startTime,
                            @RequestParam("endTime") String endTime) {
        List<StationInfo> stationInfoList = stationReservedRecordService.queryFreeStation(startTime, endTime);
        return R.ok().data("stationInfoList", stationInfoList);
    }
}
