package com.xdap.selfdevelopeddemo.mapper;

import com.xdap.selfdevelopeddemo.entity.StationInfo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
* @author 1
* @description 针对表【view_567013448379006976】的数据库操作Mapper
* @createDate 2024-04-13 16:49:09
* @Entity com.xdap.selfdevelopeddemo.entity.StationInfo
*/
@Mapper
public interface StationInfoMapper extends BaseMapper<StationInfo> {

    List<StationInfo> selectFreeStation(String startTime, String endTime);
}




