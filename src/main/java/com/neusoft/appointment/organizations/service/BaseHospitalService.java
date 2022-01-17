package com.neusoft.appointment.organizations.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.neusoft.appointment.organizations.entity.BaseHospital;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.metadata.IPage;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * 院区(BaseHospital)表服务接口
 *
 * @author yufeng
 * @since 2021-07-27 09:29:17
 */
public interface BaseHospitalService {

    /**
     * 通过ID查询单条数据
     *
     * @param code 主键
     * @return 实例对象
     */
    BaseHospitalTo selectById(String code);

    /**
     * 分页查询
     *
     * @param page 分页
     * @param queryWrapper 查询条件
     * @return 对象列表
     */
    IPage<BaseHospital> selectPage(Page page, QueryWrapper queryWrapper);

    /**
     * 新增数据
     *
     * @param baseHospital 实例对象
     * @return 影响行数
     */
    BaseHospitalTo insert(BaseHospitalNto baseHospital);
	
	/**
     * 批量新增
     *
     * @param baseHospitals 实例对象的集合
     * @return 影响行数
     */
	boolean batchInsert(List<BaseHospitalNto> baseHospitals);
	
    /**
     * 修改数据
     *
     * @param baseHospital 实例对象
     * @return 修改
     */
    boolean update(BaseHospitalEto baseHospital);

    /**
     * 通过主键删除数据
     *
     * @param code 主键
     * @return 影响行数
     */
    boolean deleteById(String code);

    int updateEnabledByCode(Boolean enabled, String code);
}