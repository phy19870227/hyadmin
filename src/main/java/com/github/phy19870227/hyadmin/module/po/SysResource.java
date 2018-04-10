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
public class SysResource implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 流水号
     */
    @TableId(value = "record_flow", type = IdType.UUID)
    private String recordFlow;
    /**
     * 资源名称
     */
    private String resourceName;
    /**
     * 资源路径
     */
    private String resourcePath;
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

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public String getResourcePath() {
        return resourcePath;
    }

    public void setResourcePath(String resourcePath) {
        this.resourcePath = resourcePath;
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
        return "SysResource{" +
        ", recordFlow=" + recordFlow +
        ", resourceName=" + resourceName +
        ", resourcePath=" + resourcePath +
        ", recordStatus=" + recordStatus +
        ", delFlag=" + delFlag +
        ", createDatetime=" + createDatetime +
        ", createrFlow=" + createrFlow +
        ", modifyDatetime=" + modifyDatetime +
        ", modifierFlow=" + modifierFlow +
        "}";
    }
}
