
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
@Table(name = "T_ACCOUNT_MERCHANDISE_SHOP")
public class AccountMerchandiseShop extends Base {

	private static final long serialVersionUID = 1L;

	/** 标识表的自增序列，没有业务作用 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	/** 商品编号，产品编号或者优惠券编号 **/
	@Column(name = "MERCHANDISE_ID", length = 32, nullable = false)
	private String merchandiseId;

	/** 使用数量 **/
	@Column(name = "SHOP_ID", length = 32, nullable = false)
	private String shopId;

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

	public String getMerchandiseId() {
		return merchandiseId;
	}

	public void setMerchandiseId(String merchandiseId) {
		this.merchandiseId = merchandiseId;
	}

	public String getShopId() {
		return shopId;
	}

	public void setShopId(String shopId) {
		this.shopId = shopId;
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
