package com.github.phy19870227.hyadmin.module.po;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableLogic;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author buhuayang
 * @since 2018-04-10
 */
public class SysRoleResource implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 流水号
     */
    @TableId(value = "record_flow", type = IdType.UUID)
    private String recordFlow;
    /**
     * 角色流水号
     */
    private String roleFlow;
    /**
     * 资源流水号
     */
    private String resourceFlow;
    /**
     * 记录状态(默认:00)
     */
    private String recordStatus;
    /**
     * 删除标记
     */
    @TableLogic
    private String delFlag;
    /**
     * 创建时间
     */
    private String createDatetime;
    /**
     * 创建者流水号
     */
    private String createrFlow;
    /**
     * 修改时间
     */
    private String modifyDatetime;
    /**
     * 修改者流水号
     */
    private String modifierFlow;


    public String getRecordFlow() {
        return recordFlow;
    }

    public void setRecordFlow(String recordFlow) {
        this.recordFlow = recordFlow;
    }

    public String getRoleFlow() {
        return roleFlow;
    }

    public void setRoleFlow(String roleFlow) {
        this.roleFlow = roleFlow;
    }

    public String getResourceFlow() {
        return resourceFlow;
    }

    public void setResourceFlow(String resourceFlow) {
        this.resourceFlow = resourceFlow;
    }

    public String getRecordStatus() {
        return recordStatus;
    }

    public void setRecordStatus(String recordStatus) {
        this.recordStatus = recordStatus;
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }

    public String getCreateDatetime() {
        return createDatetime;
    }

    public void setCreateDatetime(String createDatetime) {
        this.createDatetime = createDatetime;
    }

    public String getCreaterFlow() {
        return createrFlow;
    }

    public void setCreaterFlow(String createrFlow) {
        this.createrFlow = createrFlow;
    }

    public String getModifyDatetime() {
        return modifyDatetime;
    }

    public void setModifyDatetime(String modifyDatetime) {
        this.modifyDatetime = modifyDatetime;
    }

    public String getModifierFlow() {
        return modifierFlow;
    }

    public void setModifierFlow(String modifierFlow) {
        this.modifierFlow = modifierFlow;
    }

    @Override
    public String toString() {
        return "SysRoleResource{" +
        ", recordFlow=" + recordFlow +
        ", roleFlow=" + roleFlow +
        ", resourceFlow=" + resourceFlow +
        ", recordStatus=" + recordStatus +
        ", delFlag=" + delFlag +
        ", createDatetime=" + createDatetime +
        ", createrFlow=" + createrFlow +
        ", modifyDatetime=" + modifyDatetime +
        ", modifierFlow=" + modifierFlow +
        "}";
    }
}
