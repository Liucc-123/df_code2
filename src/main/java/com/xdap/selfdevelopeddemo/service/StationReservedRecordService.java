package com.xdap.selfdevelopeddemo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xdap.selfdevelopeddemo.entity.StationInfo;
import com.xdap.selfdevelopeddemo.entity.StationReservedRecord;

import java.util.List;

/**
* @author 1
* @description 针对表【view_567019224120164352】的数据库操作Service
* @createDate 2024-04-13 17:00:41
*/
public interface StationReservedRecordService extends IService<StationReservedRecord> {


    /**
     * 查询空闲的工位
     * @param workerId
     * @param startTime
     * @param endTime
     * @return
     */
    List<StationInfo> queryFreeStation(String startTime, String endTime);
}
