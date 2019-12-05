package com.mybatis.helloworld.dao;

import java.util.List;

import com.mybatis.helloworld.bean.LitemallAd;

public interface LitemallAdMapperDynamicSQL {

	//查询
	public List<LitemallAd> getLitemAdByConditionIfWhere(LitemallAd litemallAd); 

	public List<LitemallAd> getLitemAdByConditionTrim(LitemallAd litemallAd); 
	
	//更新
	public void updateLitemAdConditionSet(LitemallAd litemallAd); 
	
	public List<LitemallAd> getLitemAdByConditionChoose(LitemallAd litemallAd); 
}
