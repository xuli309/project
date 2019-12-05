package com.mybatis.helloworld.bean;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class LitemallGoods {
	private Integer id;
	private String name;
	private String goodsSn;
	private Integer categoryId;
	private Integer brandId;
	private String gallery;
	private String keywords;
	private String brief;
	private Integer isOnSale;
	private Integer sortOrder;
	private String picUrl;
	private String shareUrl;
	private Integer isNew;
	private Integer isHot;
	private String unit;
	private BigDecimal counterPrice;
	private BigDecimal retailPrice;
	private Date addTime;
	private Date updateTime;
	private Integer deleted;
	private List<LitemallGoods> goodsList;
	public List<LitemallGoods> getGoodsList() {
		return goodsList;
	}
	public void setGoodsList(List<LitemallGoods> goodsList) {
		this.goodsList = goodsList;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGoodsSn() {
		return goodsSn;
	}
	public void setGoodsSn(String goodsSn) {
		this.goodsSn = goodsSn;
	}
	public Integer getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}
	public Integer getBrandId() {
		return brandId;
	}
	public void setBrandId(Integer brandId) {
		this.brandId = brandId;
	}
	public String getGallery() {
		return gallery;
	}
	public void setGallery(String gallery) {
		this.gallery = gallery;
	}
	public String getKeywords() {
		return keywords;
	}
	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}
	public String getBrief() {
		return brief;
	}
	public void setBrief(String brief) {
		this.brief = brief;
	}
	public Integer getIsOnSale() {
		return isOnSale;
	}
	public void setIsOnSale(Integer isOnSale) {
		this.isOnSale = isOnSale;
	}
	public Integer getSortOrder() {
		return sortOrder;
	}
	public void setSortOrder(Integer sortOrder) {
		this.sortOrder = sortOrder;
	}
	public String getPicUrl() {
		return picUrl;
	}
	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}
	public String getShareUrl() {
		return shareUrl;
	}
	public void setShareUrl(String shareUrl) {
		this.shareUrl = shareUrl;
	}
	public Integer getIsNew() {
		return isNew;
	}
	public void setIsNew(Integer isNew) {
		this.isNew = isNew;
	}
	public Integer getIsHot() {
		return isHot;
	}
	public void setIsHot(Integer isHot) {
		this.isHot = isHot;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public BigDecimal getCounterPrice() {
		return counterPrice;
	}
	public void setCounterPrice(BigDecimal counterPrice) {
		this.counterPrice = counterPrice;
	}
	public BigDecimal getRetailPrice() {
		return retailPrice;
	}
	public void setRetailPrice(BigDecimal retailPrice) {
		this.retailPrice = retailPrice;
	}
	public Date getAddTime() {
		return addTime;
	}
	public void setAddTime(Date addTime) {
		this.addTime = addTime;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	public Integer getDeleted() {
		return deleted;
	}
	public void setDeleted(Integer deleted) {
		this.deleted = deleted;
	}
	@Override
	public String toString() {
		return "LitemallGoods [id=" + id + ", name=" + name + ", goodsSn=" + goodsSn + ", categoryId=" + categoryId
				+ ", brandId=" + brandId + ", gallery=" + gallery + ", keywords=" + keywords + ", brief=" + brief
				+ ", isOnSale=" + isOnSale + ", sortOrder=" + sortOrder + ", picUrl=" + picUrl + ", shareUrl="
				+ shareUrl + ", isNew=" + isNew + ", isHot=" + isHot + ", unit=" + unit + ", counterPrice="
				+ counterPrice + ", retailPrice=" + retailPrice + ", addTime=" + addTime + ", updateTime=" + updateTime
				+ ", deleted=" + deleted + "]";
	}

	
}
