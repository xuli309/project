package com.mybatis.helloworld.dao;

import java.util.List;

import com.mybatis.helloworld.bean.LitemallAd;

public interface LitemallAdMapperResultMap {

	//根据id查询
	public  LitemallAd getLitemAdById(Integer id); 

	//联合查询广告内容
	public LitemallAd getLitemAdAndGoods(Integer id);
	
	//根据id查询分步骤
	public LitemallAd getLitemAdByIdStep(Integer id); 
	
	//根据商品gid查询
	public List<LitemallAd> getLitemAdByGid(Integer gid); 
	
}
