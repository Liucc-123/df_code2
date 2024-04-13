package com.xdap.selfdevelopeddemo.service;

import com.xdap.selfdevelopeddemo.entity.StationInfo;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
* @author 1
* @description 针对表【view_567013448379006976】的数据库操作Service
* @createDate 2024-04-13 16:49:09
*/
public interface StationInfoService extends IService<StationInfo> {

    /**
     * 查询空闲的工位
     * @param workerId
     * @param startTime
     * @param endTime
     * @return
     */
    List<StationInfo> queryFreeStation(String workerId, String startTime, String endTime);
}
