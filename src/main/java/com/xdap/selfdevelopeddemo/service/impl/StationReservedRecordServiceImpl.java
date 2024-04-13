package com.xdap.selfdevelopeddemo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.xdap.selfdevelopeddemo.entity.StationInfo;
import com.xdap.selfdevelopeddemo.entity.StationReservedRecord;
import com.xdap.selfdevelopeddemo.mapper.StationReservedRecordMapper;
import com.xdap.selfdevelopeddemo.service.StationReservedRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author 1
* @description 针对表【view_567019224120164352】的数据库操作Service实现
* @createDate 2024-04-13 17:00:41
*/
@Service
public class StationReservedRecordServiceImpl extends ServiceImpl<StationReservedRecordMapper, StationReservedRecord>
    implements StationReservedRecordService {

    @Autowired
    private StationReservedRecordMapper stationReservedRecordMapper;
    @Override
    public List<StationInfo> queryFreeStation(String startTime, String endTime) {
        LambdaQueryWrapper<StationReservedRecord> queryWrapper = new LambdaQueryWrapper<>();

        return null;
    }
}




