/**
 * Copyright (C) 2015 北京学信科技有限公司
 *
 * @className com.xuexin.xcloud.dictionary.entity.DicPhase
 * @version v1.0.0 
 * @author zhangjingsi
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2017-06-21      zhangjingsi      v1.0.0      create
 *
 */
package com.xuexin.xcloud.dictionary.entity;

import java.io.Serializable;
import java.util.Date;



/** 
 * 测评-题库-学段实体
 * 
 * @author zhangjingsi
 * @date 2017-06-21 13:26:25
 */
public class DicPhase implements Serializable {

    private Integer phaseID;//学段ID
    private String phaseName;//学段名称
    private Integer sort;//排序号
    private String creator;//创建人
    private Date createDate;//创建时间
    private String modifier;//修改人
    private Date modifyDate;//修改时间
    private Integer isEffective;//是否有效(1、有效，0、无效)

	public void setPhaseID(Integer phaseID) {
		this.phaseID = phaseID;
	}
	public Integer getPhaseID() {
		return this.phaseID;
	}
	public void setPhaseName(String phaseName) {
		this.phaseName = phaseName;
	}
	public String getPhaseName() {
		return this.phaseName;
	}
	public void setSort(Integer sort) {
		this.sort = sort;
	}
	public Integer getSort() {
		return this.sort;
	}
	public void setCreator(String creator) {
		this.creator = creator;
	}
	public String getCreator() {
		return this.creator;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Date getCreateDate() {
		return this.createDate;
	}
	public void setModifier(String modifier) {
		this.modifier = modifier;
	}
	public String getModifier() {
		return this.modifier;
	}
	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}
	public Date getModifyDate() {
		return this.modifyDate;
	}
	public void setIsEffective(Integer isEffective) {
		this.isEffective = isEffective;
	}
	public Integer getIsEffective() {
		return this.isEffective;
	}
}

