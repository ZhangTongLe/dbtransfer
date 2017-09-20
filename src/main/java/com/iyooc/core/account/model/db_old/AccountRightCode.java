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
 * <b>权益码.</b>
 * <b>Description:</b> 
 *    
 * <b>Author:</b> tanhu@iyooc.cn
 * <b>Date:</b> 2017年9月7日下午15:52:53
 * <b>Copyright:</b> Copyright ©1998-2016 iyooc.cn Technology Co., Ltd. All rights reserved.
 * <b>Changelog:</b>
 *   ----------------------------------------------------------------------------
 *   Ver   Date                    Author                           Detail
 *   ----------------------------------------------------------------------------
 *   1.0   2017年9月7日下午15:52:53   tanhu@iyooc.cn                   new file.
 * </pre>
 */
@Entity
@Table(name = "T_ACCOUNT_RIGHT_CODE")
public class AccountRightCode extends Base {

	private static final long serialVersionUID = 1L;

	/** 标识表的自增序列，没有业务作用 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	/** 会员业务编号，用于其他平台传输 */
	@Column(name = "USER_ID", length = 32, nullable = false)
	private String userId;

	/** 订单业务编号，用于其他平台传输 */
	@Column(name = "ORDER_ID", length = 32, nullable = false)
	private String orderId;

	/** 商品编号，产品编号或者优惠券编号 **/
	@Column(name = "MERCHANDISE_ID", length = 32, nullable = false)
	private String merchandiseId;

	/** 商品类型，产品类型或者优惠券类型 **/
	@Column(name = "MERCHANDISE_TYPE", length = 64, nullable = false)
	private String merchandiseType;

	/** 添加来源，如：活动赠送，系统赠送，签到赠送，冲正，退款，等，详见开发文档。 */
	@Column(name = "SOURCE_IN", length = 4, nullable = true)
	private String sourceIn;

	/** 消费来源，如：线下兑换，线上兑换，赠送他人，冲正，退款，等，详见开发文档 */
	@Column(name = "SOURCE_OUT", length = 4, nullable = true)
	private String sourceOut;

	/** 售价 */
	@Column(name = "SALE_PRICE", length = 16, nullable = false)
	private Long salePrice;

	/** 权益编码（唯一） */
	@Column(name = "RIGHT_CODE", length = 32, nullable = false)
	private String rightCode;

	/** 创建时间，YYYYMMDDHHMMSS */
	@Column(name = "CREATE_TIME", length = 16, nullable = false)
	private Long createTime;

	/** 更新时间，YYYYMMDDHHMMSS */
	@Column(name = "UPDATE_TIME", length = 16, nullable = false)
	private Long updateTime;

	/** 过期时间，YYYYMMDDHHMMSS */
	@Column(name = "EXPIRE_TIME", length = 16, nullable = false)
	private Long expireTime;

	/** 数据状态（01未使用，02消费，03锁定，04退款，05过期，06冲正加，07冲正减） */
	@Column(name = "STATUS", length = 2, nullable = false)
	private String status;

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

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
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

	public Long getSalePrice() {
		return salePrice;
	}

	public void setSalePrice(Long salePrice) {
		this.salePrice = salePrice;
	}

	public String getRightCode() {
		return rightCode;
	}

	public void setRightCode(String rightCode) {
		this.rightCode = rightCode;
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

	public Long getExpireTime() {
		return expireTime;
	}

	public void setExpireTime(Long expireTime) {
		this.expireTime = expireTime;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
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
