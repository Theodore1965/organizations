package com.neusoft.appointment.organizations.service;

import java.util.Date;
import java.io.Serializable;
import com.neusoft.mybatis.expand.expression.SimpleExpression;
import com.neusoft.mybatis.expand.expression.BaseQto;
import io.swagger.annotations.ApiModelProperty;
import com.neusoft.mybatis.expand.expression.typeexpression.*;
import java.util.Date;

/**
 * 院区(BaseHospital)查询类
 *
 * @author yufeng
 * @since 2021-07-27 13:12:32
 */
public class BaseHospitalQto extends BaseQto implements Serializable {
    private static final long serialVersionUID = -51053573622886966L;
    @ApiModelProperty("编码")
    private SimpleExpression<String> code = new StringSimpleExpression("code", SimpleExpression.eq);
    @ApiModelProperty("名称")
    private SimpleExpression<String> name = new StringSimpleExpression("name", SimpleExpression.eq);
    @ApiModelProperty("拼音码")
    private SimpleExpression<String> spellCode = new StringSimpleExpression("spellCode", SimpleExpression.eq);
    @ApiModelProperty("五笔码")
    private SimpleExpression<String> wbCode = new StringSimpleExpression("wbCode", SimpleExpression.eq);
    @ApiModelProperty("启用")
    private SimpleExpression<Boolean> enabled = new BooleanSimpleExpression("enabled", SimpleExpression.eq);
    @ApiModelProperty("组织机构代码")
    private SimpleExpression<String> organizationCode = new StringSimpleExpression("organizationCode", SimpleExpression.eq);
    @ApiModelProperty("操作人")
    private SimpleExpression<String> operatorCode = new StringSimpleExpression("operatorCode", SimpleExpression.eq);
    @ApiModelProperty("操作人姓名")
    private SimpleExpression<String> operatorName = new StringSimpleExpression("operatorName", SimpleExpression.eq);
    @ApiModelProperty("修改时间")
    private SimpleExpression<Date> updateTime = new DateSimpleExpression("updateTime", SimpleExpression.eq);
    @ApiModelProperty("创建时间")
    private SimpleExpression<Date> createTime = new DateSimpleExpression("createTime", SimpleExpression.eq);

        
    public SimpleExpression<String> getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code.setValue(code);
    }
        
    public SimpleExpression<String> getName() {
        return name;
    }

    public void setName(String name) {
        this.name.setValue(name);
    }
        
    public SimpleExpression<String> getSpellCode() {
        return spellCode;
    }

    public void setSpellCode(String spellCode) {
        this.spellCode.setValue(spellCode);
    }
        
    public SimpleExpression<String> getWbCode() {
        return wbCode;
    }

    public void setWbCode(String wbCode) {
        this.wbCode.setValue(wbCode);
    }
        
    public SimpleExpression<Boolean> getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled.setValue(enabled);
    }
        
    public SimpleExpression<String> getOrganizationCode() {
        return organizationCode;
    }

    public void setOrganizationCode(String organizationCode) {
        this.organizationCode.setValue(organizationCode);
    }
        
    public SimpleExpression<String> getOperatorCode() {
        return operatorCode;
    }

    public void setOperatorCode(String operatorCode) {
        this.operatorCode.setValue(operatorCode);
    }
        
    public SimpleExpression<String> getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName.setValue(operatorName);
    }
        
    public SimpleExpression<Date> getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime.setValue(updateTime);
    }
        
    public SimpleExpression<Date> getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime.setValue(createTime);
    }

}