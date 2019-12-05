package com.mybatis.helloworld.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.mybatis.helloworld.bean.LitemallAd;

public interface LitemallAdMapperDynamicSQL {

	//查询
	public List<LitemallAd> getLitemAdByConditionIfWhere(LitemallAd litemallAd); 

	public List<LitemallAd> getLitemAdByConditionTrim(LitemallAd litemallAd); 
	
	//更新
	public void updateLitemAdConditionSet(LitemallAd litemallAd); 
	
	public List<LitemallAd> getLitemAdByConditionChoose(LitemallAd litemallAd); 
	
	public List<LitemallAd> getLitemAdByIds(@Param("ids")List<Integer> ids); 
	
	//批量操作：修改 删除 增加
	public void addAds(@Param("ads")List<LitemallAd> litemallAds);
	public void deleteAds(@Param("ids")List<Integer> ids);
	
	public void updateAds(@Param("ads")List<LitemallAd> litemallAds);
}
