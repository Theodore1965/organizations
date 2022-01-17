package com.neusoft.appointment.organizations.service;

import java.util.Date;
import java.io.Serializable;
import com.neusoft.mybatis.expand.expression.SimpleExpression;
import com.neusoft.mybatis.expand.expression.BaseQto;
import io.swagger.annotations.ApiModelProperty;

/**
 * 院区(BaseHospital)修改类
 *
 * @author yufeng
 * @since 2021-07-27 13:12:32
 */
public class BaseHospitalEto implements Serializable {
    private static final long serialVersionUID = 272086954560991866L;
    @ApiModelProperty("编码")
    private String code;
    @ApiModelProperty("名称")
    private String name;
    @ApiModelProperty("拼音码")
    private String spellCode;
    @ApiModelProperty("五笔码")
    private String wbCode;
    @ApiModelProperty("启用")
    private Boolean enabled;
    @ApiModelProperty("组织机构代码")
    private String organizationCode;
    @ApiModelProperty("操作人")
    private String operatorCode;
    @ApiModelProperty("操作人姓名")
    private String operatorName;
    @ApiModelProperty("修改时间")

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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}