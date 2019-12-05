package com.mybatis.helloworld.bean;

import java.util.Date;

public class LitemallAd {
	private Integer id;
	private String name;
	private String link;
	private String url;
	private Integer position;
	private String content;
	private Date startTime;
	private Date endTime;
	private int enabled;
	private Date addTime;
	private Date updateTime;
	private Integer deleted;
	private LitemallGoods litemallGoods;
	public LitemallGoods getLitemallGoods() {
		return litemallGoods;
	}
	public void setLitemallGoods(LitemallGoods litemallGoods) {
		this.litemallGoods = litemallGoods;
	}
	/**
	 * @param id
	 * @param name
	 * @param link
	 * @param url
	 * @param position
	 * @param content
	 * @param startTime
	 * @param endTime
	 * @param enabled
	 * @param addTime
	 * @param updateTime
	 * @param deleted
	 */
	public LitemallAd(Integer id, String name, String link, String url, Integer position, String content,
			Date startTime, Date endTime, int enabled, Date addTime, Date updateTime, Integer deleted) {
		super();
		this.id = id;
		this.name = name;
		this.link = link;
		this.url = url;
		this.position = position;
		this.content = content;
		this.startTime = startTime;
		this.endTime = endTime;
		this.enabled = enabled;
		this.addTime = addTime;
		this.updateTime = updateTime;
		this.deleted = deleted;
	}
	public LitemallAd(){}
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
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Integer getPosition() {
		return position;
	}
	public void setPosition(Integer position) {
		this.position = position;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getStartTime() {
		return startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public Date getEndTime() {
		return endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	public int getEnabled() {
		return enabled;
	}
	public void setEnabled(int enabled) {
		this.enabled = enabled;
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
		return "ItemAd [id=" + id + ", name=" + name + ", link=" + link + ", url=" + url + ", position=" + position
				+ ", content=" + content + ", startTime=" + startTime + ", endTime=" + endTime + ", enabled=" + enabled
				+ ", addTime=" + addTime + ", updateTime=" + updateTime + ", deleted=" + deleted + "]";
	}
}
