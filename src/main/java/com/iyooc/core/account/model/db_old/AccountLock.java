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
 * <b>权益码锁定表.</b>
 * <b>Description:</b> 
 *    下订单时，权益锁定表
 * <b>Author:</b> tanhu@iyooc.cn
 * <b>Date:</b> 2017年9月7日下午14:18:38
 * <b>Copyright:</b> Copyright ©1998-2016 iyooc.cn Technology Co., Ltd. All rights reserved.
 * <b>Changelog:</b>
 *   ----------------------------------------------------------------------------
 *   Ver   Date                    Author                           Detail
 *   ----------------------------------------------------------------------------
 *   1.0   2017年9月7日下午14:18:38   tanhu@iyooc.cn                   new file.
 * </pre>
 */
@Entity
@Table(name = "T_ACCOUNT_LOCK")
public class AccountLock extends Base {

	private static final long serialVersionUID = 1L;

	/** 标识表的自增序列，没有业务作用 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	/** 会员编号 **/
	@Column(name = "USER_ID", length = 32, nullable = false)
	private String userId;

	/** 订单编号，来自其他平台 **/
	@Column(name = "ORDER_ID", length = 32, nullable = false)
	private String orderId;

	/** 锁定编号，用于支付系统 **/
	@Column(name = "LOCK_ID", length = 32, nullable = false)
	private String lockId;

	/** 商品编号，产品编号或者优惠券编号 **/
	@Column(name = "MERCHANDISE_ID", length = 32, nullable = false)
	private String merchandiseId;

	/** 商品类型，产品类型或者优惠券类型 **/
	@Column(name = "MERCHANDISE_TYPE", length = 64, nullable = false)
	private String merchandiseType;

	/** 使用数量 **/
	@Column(name = "MERCHANDISE_NUM", length = 6, nullable = false)
	private Integer merchandiseNum;

	/** 添加来源，如：活动赠送，系统赠送，签到赠送，冲正，退款，等，详见开发文档。 */
	@Column(name = "SOURCE_IN", length = 4, nullable = true)
	private String sourceIn;

	/** 消费来源，如：线下兑换，线上兑换，赠送他人，冲正，退款，等，详见开发文档 */
	@Column(name = "SOURCE_OUT", length = 4, nullable = true)
	private String sourceOut;

	/** 权益码信息，多个权益码之间用英文逗号隔开 **/
	@Column(name = "RIGHT_CODES", length = 160000, nullable = true)
	private String rightCodes;

	/** 创建时间，YYYYMMDDHHMMSS **/
	@Column(name = "CREATE_TIME", length = 16, nullable = false)
	private Long createTime;

	/** 备用字段1 */
	@Column(name = "REMARK1", length = 64, nullable = true)
	private String remark1;

	/** 备用字段2 */
	@Column(name = "REMARK2", length = 128, nullable = true)
	private String remark2;

	/** 备用字段3 */
	@Column(name = "REMARK3", length = 256, nullable = true)
	private String remark3;

	public String getMerchandiseType() {
		return merchandiseType;
	}

	public void setMerchandiseType(String merchandiseType) {
		this.merchandiseType = merchandiseType;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getSourceIn() {
		return sourceIn;
	}

	public void setSourceIn(String sourceIn) {
		this.sourceIn = sourceIn;
	}

	public String getSourceOut() {
		return sourceOut;
	}

	public void setSourceOut(String sourceOut) {
		this.sourceOut = sourceOut;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getLockId() {
		return lockId;
	}

	public void setLockId(String lockId) {
		this.lockId = lockId;
	}

	public String getMerchandiseId() {
		return merchandiseId;
	}

	public void setMerchandiseId(String merchandiseId) {
		this.merchandiseId = merchandiseId;
	}

	public Integer getMerchandiseNum() {
		return merchandiseNum;
	}

	public void setMerchandiseNum(Integer merchandiseNum) {
		this.merchandiseNum = merchandiseNum;
	}

	public String getRightCodes() {
		return rightCodes;
	}

	public void setRightCodes(String rightCodes) {
		this.rightCodes = rightCodes;
	}

	public Long getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Long createTime) {
		this.createTime = createTime;
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
