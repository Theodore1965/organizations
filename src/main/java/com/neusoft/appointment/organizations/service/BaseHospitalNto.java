package com.neusoft.appointment.organizations.service;

import java.util.Date;
import java.io.Serializable;

import com.neusoft.mybatis.expand.expression.SimpleExpression;
import com.neusoft.mybatis.expand.expression.BaseQto;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * 院区(BaseHospital)添加类
 *
 * @author yufeng
 * @since 2021-07-27 13:12:31
 */
public class BaseHospitalNto implements Serializable {
    private static final long serialVersionUID = -76532063550798452L;
    @NotBlank(message = "名称不能为空！")
    @ApiModelProperty("名称")
    private String name;
    @ApiModelProperty("拼音码")
    private String spellCode;
    @ApiModelProperty("五笔码")
    private String wbCode;
    @NotNull(message = "启用不能为空！")
    @ApiModelProperty("启用")
    private Boolean enabled;
    @ApiModelProperty("组织机构代码")
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