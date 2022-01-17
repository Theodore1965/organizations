package com.neusoft.appointment.organizations.dao;
import org.apache.ibatis.annotations.Param;

import com.neusoft.appointment.organizations.entity.BaseHospital;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;
/**
 * 院区(BaseHospital)表数据库访问层
 *
 * @author yufeng
 * @since 2021-07-26 10:11:59
 */
@Mapper
public interface BaseHospitalMapper extends BaseMapper<BaseHospital> {

    int updateEnabledByCode(@Param("enabled") Boolean enabled, @Param("code") String code);
}