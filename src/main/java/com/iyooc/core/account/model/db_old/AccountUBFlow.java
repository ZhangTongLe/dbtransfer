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
 * <b>UB交易流水.</b>
 * <b>Description:</b> 
 *    
 * <b>Author:</b> zhoujianjun@iyooc.cn
 * <b>Date:</b> 2016年7月2日下午12:16:35
 * <b>Copyright:</b> Copyright ©1998-2016 iyooc.cn Technology Co., Ltd. All rights reserved.
 * <b>Changelog:</b>
 *   ----------------------------------------------------------------------------
 *   Ver   Date                    Author                           Detail
 *   ----------------------------------------------------------------------------
 *   1.0   2016年7月2日下午12:16:35   zhoujianjun@iyooc.cn            new file.
 * </pre>
 */
@Entity
@Table(name = "T_ACCOUNT_UB_FLOW")
public class AccountUBFlow extends Base {

	private static final long serialVersionUID = 1L;

	/** 标识表的自增序列，没有业务作用 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	/** 系统流水编号，全局唯一 */
	@Column(name = "FLOW_ID", length = 32, nullable = false)
	private String flowId;

	/** 总流水号，即请求流水号 */
	@Column(name = "SERIAL_NO", length = 64, nullable = false)
	private String serialNo;

	/** 会员业务编号 */
	@Column(name = "USER_ID", length = 32, nullable = false)
	private String userId;

	/** 添加来源，如：活动赠送，系统赠送，签到赠送，冲正，退款，等，详见开发文档。 */
	@Column(name = "SOURCE_IN", length = 4, nullable = true)
	private String sourceIn;

	/** 消费来源，如：线下兑换，线上兑换，赠送他人，冲正，退款，等，详见开发文档 */
	@Column(name = "SOURCE_OUT", length = 4, nullable = true)
	private String sourceOut;

	/** 交易类型，+正交易，-反交易 */
	@Column(name = "TRADE_TYPE", length = 2, nullable = false)
	private String tradeType;

	/** 交易之前值 */
	@Column(name = "BEFORE_VALUE", length = 16, nullable = false)
	private Long beforeValue;

	/** 交易之后值 */
	@Column(name = "AFTER_VALUE", length = 16, nullable = false)
	private Long afterValue;

	/** 本次交易量值 */
	@Column(name = "TRADE_VALUE", length = 16, nullable = false)
	private Long tradeValue;

	/** 创建时间，YYYYMMDDHHMMSS */
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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFlowId() {
		return flowId;
	}

	public void setFlowId(String flowId) {
		this.flowId = flowId;
	}

	public String getSerialNo() {
		return serialNo;
	}

	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
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

	public String getTradeType() {
		return tradeType;
	}

	public void setTradeType(String tradeType) {
		this.tradeType = tradeType;
	}

	public Long getTradeValue() {
		return tradeValue;
	}

	public void setTradeValue(Long tradeValue) {
		this.tradeValue = tradeValue;
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

	/**
	 * 获取 交易之前值
	 * 
	 * @return beforeValue 交易之前值
	 */
	public Long getBeforeValue() {
		return beforeValue;
	}

	/**
	 * 设置 交易之前值
	 * 
	 * @param beforeValue 交易之前值
	 */
	public void setBeforeValue(Long beforeValue) {
		this.beforeValue = beforeValue;
	}

	/**
	 * 获取 交易之后值
	 * 
	 * @return afterValue 交易之后值
	 */
	public Long getAfterValue() {
		return afterValue;
	}

	/**
	 * 设置 交易之后值
	 * 
	 * @param afterValue 交易之后值
	 */
	public void setAfterValue(Long afterValue) {
		this.afterValue = afterValue;
	}
}
