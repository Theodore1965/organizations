package com.neusoft.appointment.organizations.service;

import java.util.Date;
import java.io.Serializable;

/**
 * 院区(BaseHospital)返回类
 *
 * @author yufeng
 * @since 2021-07-27 13:12:32
 */
public class BaseHospitalTo implements Serializable {
    private static final long serialVersionUID = -85700040908332384L;
    /**
    * 编码
    */    
    private String code;
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
    /**
    * 操作人
    */    
    private String operatorCode;
    /**
    * 操作人姓名
    */    
    private String operatorName;
    /**
    * 修改时间
    */    
    private Date updateTime;
    /**
    * 创建时间
    */    
    private Date createTime;

        
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
        
    public String getOperatorCode() {
        return operatorCode;
    }

    public void setOperatorCode(String operatorCode) {
        this.operatorCode = operatorCode;
    }
        
    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }
        
    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
        
    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}