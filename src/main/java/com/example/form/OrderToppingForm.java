package com.example.form;

import com.example.domain.Topping;

/**
 * トッピングを追加する際に使用するフォーム.
 * 
 * @author iidashuhei
 *
 */
public class OrderToppingForm {

	/* ID */
	private String id;
	/* ToppingID */
	private String toppingId;
	/* OrderItemID */
	private String orderItemId;
	/* トッピング */
	private Topping topping;

	@Override
	public String toString() {
		return "OrderToppingForm [id=" + id + ", toppingId=" + toppingId + ", orderItemId=" + orderItemId + ", topping="
				+ topping + "]";
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the toppingId
	 */
	public String getToppingId() {
		return toppingId;
	}

	/**
	 * @param toppingId the toppingId to set
	 */
	public void setToppingId(String toppingId) {
		this.toppingId = toppingId;
	}

	/**
	 * @return the orderItemId
	 */
	public String getOrderItemId() {
		return orderItemId;
	}

	/**
	 * @param orderItemId the orderItemId to set
	 */
	public void setOrderItemId(String orderItemId) {
		this.orderItemId = orderItemId;
	}

	/**
	 * @return the topping
	 */
	public Topping getTopping() {
		return topping;
	}

	/**
	 * @param topping the topping to set
	 */
	public void setTopping(Topping topping) {
		this.topping = topping;
	}

}
