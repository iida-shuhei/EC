package com.example.domain;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

public class Order {

	/* ID */
	private Integer id;
	/* UserId */
	private Integer userId;
	/* 状態 */
	private Integer status;
	/* 合計金額 */
	private Integer totalPrice;
	/* 注文日 */
	private Date orderDate;
	/* 宛先氏名 */
	private String destinationName;
	/* 宛先Eメール */
	private String destinationEmail;
	/* 宛先郵便番号 */
	private String destinationZipcode;
	/* 宛先住所 */
	private String destinationAddress;
	/* 宛先TEL */
	private String destinationTel;
	/* 配達時間 */
	private Timestamp deliveryTime;
	/* 支払方法 */
	private Integer paymentMethod;
	/* ユーザ */
	private User user;
	/* 注文したアイテム */
	private List<OrderItem> orderItemList;

	@Override
	public String toString() {
		return "Order [id=" + id + ", userId=" + userId + ", status=" + status + ", totalPrice=" + totalPrice
				+ ", orderDate=" + orderDate + ", destinationName=" + destinationName + ", destinationEmail="
				+ destinationEmail + ", destinationZipcode=" + destinationZipcode + ", destinationAddress="
				+ destinationAddress + ", destinationTel=" + destinationTel + ", deliveryTime=" + deliveryTime
				+ ", paymentMethod=" + paymentMethod + ", user=" + user + ", orderItemList=" + orderItemList + "]";
	}

	public int getTax() {
		int tax = 0;
		for (OrderItem orderItem : orderItemList) {
			tax += (orderItem.getSubTotal() * 0.1);
		}
		return tax;
	}

	public int getCalcTotalPrice() {
		int CalcTotalPrice = 0;
		for (OrderItem orderItem : orderItemList) {
			CalcTotalPrice += (orderItem.getSubTotal() + getTax());
		}
		return CalcTotalPrice;
	}
	
	public int getTotalItems() {
		int TotalItems = 0;
		for (OrderItem orderItem : orderItemList) {
			TotalItems += (orderItem.getQuantity());
		}
		return TotalItems;
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the userId
	 */
	public Integer getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	/**
	 * @return the status
	 */
	public Integer getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}

	/**
	 * @return the totalPrice
	 */
	public Integer getTotalPrice() {
		return totalPrice;
	}

	/**
	 * @param totalPrice the totalPrice to set
	 */
	public void setTotalPrice(Integer totalPrice) {
		this.totalPrice = totalPrice;
	}

	/**
	 * @return the orderDate
	 */
	public Date getOrderDate() {
		return orderDate;
	}

	/**
	 * @param date the orderDate to set
	 */
	public void setOrderDate(java.util.Date date) {
		this.orderDate = date;
	}

	/**
	 * @return the destinationName
	 */
	public String getDestinationName() {
		return destinationName;
	}

	/**
	 * @param destinationName the destinationName to set
	 */
	public void setDestinationName(String destinationName) {
		this.destinationName = destinationName;
	}

	/**
	 * @return the destinationEmail
	 */
	public String getDestinationEmail() {
		return destinationEmail;
	}

	/**
	 * @param destinationEmail the destinationEmail to set
	 */
	public void setDestinationEmail(String destinationEmail) {
		this.destinationEmail = destinationEmail;
	}

	/**
	 * @return the destinationZipcode
	 */
	public String getDestinationZipcode() {
		return destinationZipcode;
	}

	/**
	 * @param destinationZipcode the destinationZipcode to set
	 */
	public void setDestinationZipcode(String destinationZipcode) {
		this.destinationZipcode = destinationZipcode;
	}

	/**
	 * @return the destinationAddress
	 */
	public String getDestinationAddress() {
		return destinationAddress;
	}

	/**
	 * @param destinationAddress the destinationAddress to set
	 */
	public void setDestinationAddress(String destinationAddress) {
		this.destinationAddress = destinationAddress;
	}

	/**
	 * @return the destinationTel
	 */
	public String getDestinationTel() {
		return destinationTel;
	}

	/**
	 * @param destinationTel the destinationTel to set
	 */
	public void setDestinationTel(String destinationTel) {
		this.destinationTel = destinationTel;
	}

	/**
	 * @return the deliveryTime
	 */
	public Timestamp getDeliveryTime() {
		return deliveryTime;
	}

	/**
	 * @param deliveryTime the deliveryTime to set
	 */
	public void setDeliveryTime(Timestamp deliveryTime) {
		this.deliveryTime = deliveryTime;
	}

	/**
	 * @return the paymentMethod
	 */
	public Integer getPaymentMethod() {
		return paymentMethod;
	}

	/**
	 * @param paymentMethod the paymentMethod to set
	 */
	public void setPaymentMethod(Integer paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	/**
	 * @return the user
	 */
	public User getUser() {
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}

	/**
	 * @return the orderItemList
	 */
	public List<OrderItem> getOrderItemList() {
		return orderItemList;
	}

	/**
	 * @param orderItemList the orderItemList to set
	 */
	public void setOrderItemList(List<OrderItem> orderItemList) {
		this.orderItemList = orderItemList;
	}

}
