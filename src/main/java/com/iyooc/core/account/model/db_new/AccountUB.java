package com.iyooc.core.account.model.db_new;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.iyooc.core.account.model.base.Base;


/**
 * <pre>
 * <b>UB.</b>
 * <b>Description:</b> 
 *    
 * <b>Author:</b> zhoujianjun@iyooc.cn
 * <b>Date:</b> 2016年7月2日下午12:09:38
 * <b>Copyright:</b> Copyright ©1998-2016 iyooc.cn Technology Co., Ltd. All rights reserved.
 * <b>Changelog:</b>
 *   ----------------------------------------------------------------------------
 *   Ver   Date                    Author                           Detail
 *   ----------------------------------------------------------------------------
 *   1.0   2016年7月2日下午12:09:38   zhoujianjun@iyooc.cn            new file.
 * </pre>
 */
@Entity
@Table(name = "T_ACCOUNT_UB")
public class AccountUB extends Base {

	private static final long serialVersionUID = 1L;

	/** 标识表的自增序列，没有业务作用 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	/** 会员业务编号，用于其他平台传输 */
	@Column(name = "USER_ID", length = 32, nullable = false)
	private String userId;

	/** 剩余UB */
	@Column(name = "NUMBER", length = 16, nullable = false)
	private Long number;

	/** 创建时间，YYYYMMDDHHMMSS */
	@Column(name = "CREATE_TIME", length = 16, nullable = false)
	private Long createTime;

	/** 更新时间，YYYYMMDDHHMMSS */
	@Column(name = "UPDATE_TIME", length = 16, nullable = true)
	private Long updateTime;

	/** 备用字段1 */
	@Column(name = "REMARK1", length = 64, nullable = true)
	private String remark1;

	/** 备用字段2 */
	@Column(name = "REMARK2", length = 128, nullable = true)
	private String remark2;

	/** 备用字段3 */
	@Column(name = "REMARK3", length = 256, nullable = true)
	private String remark3;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Long getNumber() {
		return number;
	}

	public void setNumber(Long number) {
		this.number = number;
	}

	public Long getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Long createTime) {
		this.createTime = createTime;
	}

	public Long getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Long updateTime) {
		this.updateTime = updateTime;
	}

	public String getRemark1() {
		return remark1;
	}

	public void setRemark1(String remark1) {
		this.remark1 = remark1;
	}

	public String getRemark2() {
		return remark2;
	}

	public void setRemark2(String remark2) {
		this.remark2 = remark2;
	}

	public String getRemark3() {
		return remark3;
	}

	public void setRemark3(String remark3) {
		this.remark3 = remark3;
	}

}
