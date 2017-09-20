package com.iyooc.core.account.model.db_old;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.iyooc.core.account.model.base.Base;


/**
 * <pre>
 * <b>商品账户表.</b>
 * <b>Description:</b> 
 *    
 * <b>Author:</b> zhoujianjun@iyooc.cn
 * <b>Date:</b> 2016年7月2日下午12:18:38
 * <b>Copyright:</b> Copyright ©1998-2016 iyooc.cn Technology Co., Ltd. All rights reserved.
 * <b>Changelog:</b>
 *   ----------------------------------------------------------------------------
 *   Ver   Date                    Author                           Detail
 *   ----------------------------------------------------------------------------
 *   1.0   2016年7月2日下午12:18:38   zhoujianjun@iyooc.cn            new file.
 * </pre>
 */
@Entity
@Table(name = "T_ACCOUNT_MERCHANDISE")
public class AccountMerchandise extends Base {

	private static final long serialVersionUID = 1L;

	/** 标识表的自增序列，没有业务作用 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	/** 会员业务编号，用于其他平台传输 **/
	@Column(name = "USER_ID", length = 32, nullable = false)
	private String userId;

	/** 商品编号，产品编号或者优惠券编号 **/
	@Column(name = "MERCHANDISE_ID", length = 32, nullable = false)
	private String merchandiseId;

	/** 商品类型，产品类型或者优惠券类型 **/
	@Column(name = "MERCHANDISE_TYPE", length = 64, nullable = false)
	private String merchandiseType;

	/** 可用数量 **/
	@Column(name = "NUMBER", length = 16, nullable = false)
	private Long number;

	/** 面值 */
	@Column(name = "FACE_PRICE", length = 16, nullable = true)
	private Long facePrice;

	/** 创建时间，YYYYMMDDHHMMSS **/
	@Column(name = "CREATE_TIME", length = 16, nullable = false)
	private Long createTime;

	/** 更新时间，YYYYMMDDHHMMSS **/
	@Column(name = "UPDATE_TIME", length = 16, nullable = false)
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

	public String getMerchandiseId() {
		return merchandiseId;
	}

	public void setMerchandiseId(String merchandiseId) {
		this.merchandiseId = merchandiseId;
	}

	public String getMerchandiseType() {
		return merchandiseType;
	}

	public void setMerchandiseType(String merchandiseType) {
		this.merchandiseType = merchandiseType;
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

	public Long getFacePrice() {
		return facePrice;
	}

	public void setFacePrice(Long facePrice) {
		this.facePrice = facePrice;
	}
}