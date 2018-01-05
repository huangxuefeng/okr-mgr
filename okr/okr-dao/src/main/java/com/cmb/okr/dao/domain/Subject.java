package com.cmb.okr.dao.domain;

import java.util.Date;

import com.cmb.okr.frame.db.BaseEntity;

/**
 * 该类是映射到表的实体类，负责与表进行一一对应。
 * 
 * @author: pan
 * @date: 2018-01-05 09:06:50
 * @since 1.0.0
 */
public class Subject extends BaseEntity {
	private static final long serialVersionUID = 1L;
	/**
	 * 课题名称
	 */
	private String name;

	/**
	 * 课题发起时间
	 */
	private Date startupDate;

	/**
	 * 课题状态
	 */
	private String status;

	/**
	 * 课题描述
	 */
	private String descp;

	/**
	 * 课题ICON
	 */
	private String icon;

	/**
	 * 课题类型
	 */
	private String okrType;

	/**
	 * 迭代版本
	 */
	private String curVersion;

	/**
	 * 课题名称
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 课题名称
	 */
	public String getName() {
		return name;
	}

	/**
	 * 课题发起时间
	 */
	public void setStartupDate(Date startupDate) {
		this.startupDate = startupDate;
	}

	/**
	 * 课题发起时间
	 */
	public Date getStartupDate() {
		return startupDate;
	}

	/**
	 * 课题状态
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * 课题状态
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * 课题描述
	 */
	public void setDescp(String descp) {
		this.descp = descp;
	}

	/**
	 * 课题描述
	 */
	public String getDescp() {
		return descp;
	}

	/**
	 * 课题ICON
	 */
	public void setIcon(String icon) {
		this.icon = icon;
	}

	/**
	 * 课题ICON
	 */
	public String getIcon() {
		return icon;
	}

	/**
	 * 课题类型
	 */
	public void setOkrType(String okrType) {
		this.okrType = okrType;
	}

	/**
	 * 课题类型
	 */
	public String getOkrType() {
		return okrType;
	}

	/**
	 * 迭代版本
	 */
	public void setCurVersion(String curVersion) {
		this.curVersion = curVersion;
	}

	/**
	 * 迭代版本
	 */
	public String getCurVersion() {
		return curVersion;
	}
}