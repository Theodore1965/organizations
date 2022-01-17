package com.neusoft.appointment.organizations.service.impl;

import com.neusoft.mybatis.expand.mybatis.BaseServiceImpl;
import com.neusoft.mybatis.expand.utils.BaseAssemblerUtils;
import com.neusoft.appointment.organizations.entity.BaseHospital;
import com.neusoft.appointment.organizations.dao.BaseHospitalMapper;
import com.neusoft.appointment.organizations.service.BaseHospitalService;
import com.neusoft.appointment.organizations.service.BaseHospitalTo;
import com.neusoft.appointment.organizations.service.BaseHospitalEto;
import com.neusoft.appointment.organizations.service.BaseHospitalNto;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import org.springframework.transaction.annotation.Transactional;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.baomidou.mybatisplus.core.metadata.IPage;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 院区(BaseHospital表)服务实现类
 *
 * @author yufeng
 * @since 2021-07-27 09:43:09
 */
@Service("baseHospitalService")
@Transactional(rollbackFor = Throwable.class)
public class BaseHospitalServiceImpl extends BaseServiceImpl<BaseHospitalMapper, BaseHospital> implements BaseHospitalService {

    @Resource
    private BaseHospitalMapper baseHospitalMapper;

    /**
     * 通过ID查询单条数据
     *
     * @param code 主键
     * @return 实例对象
     */
    @Override
    @Transactional(rollbackFor = Throwable.class, readOnly = true)
    @Cacheable(value = "selectBaseHospitalById", key = "#code", unless="#result == null")
    public BaseHospitalTo selectById(String code) {
        return (BaseHospitalTo) BaseAssemblerUtils.populate(getById(code), new BaseHospitalTo());
    }

    /**
     * 分页查询
     *
     * @param page         分页
     * @param queryWrapper 查询条件
     * @return 对象列表
     */
    @Override
    @Transactional(rollbackFor = Throwable.class, readOnly = true)
    public IPage<BaseHospital> selectPage(Page page, QueryWrapper queryWrapper) {
        return page(page, queryWrapper);
    }

    /**
     * 新增数据
     *
     * @param baseHospitalNto 实例对象
     * @return 实例对象
     */
    @Override
    @Transactional(rollbackFor = Throwable.class, readOnly = false)
    public BaseHospitalTo insert(BaseHospitalNto baseHospitalNto) {
        BaseHospital baseHospital = BaseAssemblerUtils.populate(baseHospitalNto, BaseHospital.class);
        save(baseHospital);
        return BaseAssemblerUtils.populate(baseHospital, BaseHospitalTo.class);
    }

    /**
     * 批量新增
     *
     * @param baseHospitalNtos 实例对象的集合
     * @return 生效的条数
     */
    @Override
    @Transactional(rollbackFor = Throwable.class, readOnly = false)
    public boolean batchInsert(List<BaseHospitalNto> baseHospitalNtos) {
        List<BaseHospital> baseHospital = BaseAssemblerUtils.populateList(baseHospitalNtos, BaseHospital.class);
        return saveBatch(baseHospital, baseHospital.size());
    }

    /**
     * 修改数据
     *
     * @param baseHospitalEto 实例对象
     * @return 实例对象
     */
    @Override
    @Transactional(rollbackFor = Throwable.class, readOnly = false)
    @CacheEvict(value = "selectBaseHospitalById", key = "#baseHospitalEto.code")
    public boolean update(BaseHospitalEto baseHospitalEto) {
        BaseHospital baseHospitalEntity = getById(baseHospitalEto);
        Assert.notNull(baseHospitalEntity, "根据标识，没有找到指定实体！");

        BaseHospital baseHospital = BaseAssemblerUtils.populate(baseHospitalEto, BaseHospital.class);
        return updateById(baseHospital);
    }

    /**
     * 通过主键删除数据
     *
     * @param code 主键
     * @return 是否成功
     */
    @Override
    @Transactional(rollbackFor = Throwable.class, readOnly = false)
    @CacheEvict(value = "selectBaseHospitalById", key = "#code")
    public boolean deleteById(String code) {
        BaseHospital baseHospitalEntity = getById(code);
        Assert.notNull(baseHospitalEntity, "根据标识，没有找到指定实体！");
        return removeById(code);
    }

    @Override
    @Transactional(rollbackFor = Throwable.class, readOnly = false)
    @CacheEvict(value = "selectBaseHospitalById", key = "#code")
    public int updateEnabledByCode(Boolean enabled, String code) {
        return baseHospitalMapper.updateEnabledByCode(enabled, code);
    }
}