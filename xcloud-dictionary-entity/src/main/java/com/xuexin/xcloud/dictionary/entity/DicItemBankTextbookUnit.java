/**
 * Copyright (C) 2015 北京学信科技有限公司
 *
 * @className com.xuexin.xcloud.dictionary.entity.DicItemBankTextbookUnit
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
 * 教辅机构实体
 * 
 * @author zhangjingsi
 * @date 2017-06-21 13:26:24
 */
public class DicItemBankTextbookUnit implements Serializable {

	private Long unitID;//机构ID
	private String unitName;//机构名称
    private String creator;//创建人
    private Date createDate;//创建时间
    private String modifier;//修改人
    private Date modifyDate;//修改时间
    private Integer isEffective;//是否有效（1、有效，0、无效）

	public void setUnitID(Long unitID) {
		this.unitID = unitID;
	}

	public Long getUnitID() {
		return this.unitID;
	}
	public void setUnitName(String unitName) {
		this.unitName = unitName;
	}
	public String getUnitName() {
		return this.unitName;
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

