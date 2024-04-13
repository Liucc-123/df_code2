package com.xdap.selfdevelopeddemo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xdap.selfdevelopeddemo.entity.StationInfo;
import com.xdap.selfdevelopeddemo.service.StationInfoService;
import com.xdap.selfdevelopeddemo.mapper.StationInfoMapper;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author 1
* @description 针对表【view_567013448379006976】的数据库操作Service实现
* @createDate 2024-04-13 16:49:09
*/
@Service
public class StationInfoServiceImpl extends ServiceImpl<StationInfoMapper, StationInfo>
    implements StationInfoService{

    @Override
    public List<StationInfo> queryFreeStation(String workerId, String startTime, String endTime) {

        return null;
    }
}




