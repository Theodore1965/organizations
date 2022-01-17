package com.neusoft.appointment.organizations.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.neusoft.mybatis.expand.mybatis.BaseEntity;

import java.util.Date;
import java.io.Serializable;

/**
 * 院区(BaseHospital)实体类
 *
 * @author yufeng
 * @since 2021-07-26 10:11:59
 */
@TableName(value = "BASE_HOSPITAL")
public class BaseHospital extends BaseEntity implements Serializable {
    private static final long serialVersionUID = -87600885954039299L;
    /**
    * 名称
    */
    private String name;
    /**
    * 拼音码
    */
    private String spellCode;
    /**
    * 五笔码
    */
    private String wbCode;
    /**
    * 启用
    */
    private Boolean enabled;
    /**
    * 组织机构代码
    */
    private String organizationCode;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
        
    public String getSpellCode() {
        return spellCode;
    }

    public void setSpellCode(String spellCode) {
        this.spellCode = spellCode;
    }
        
    public String getWbCode() {
        return wbCode;
    }

    public void setWbCode(String wbCode) {
        this.wbCode = wbCode;
    }
        
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }
        
    public String getOrganizationCode() {
        return organizationCode;
    }

    public void setOrganizationCode(String organizationCode) {
        this.organizationCode = organizationCode;
    }
}