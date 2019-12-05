package com.mybatis.helloworld.dao;

import com.mybatis.helloworld.bean.LitemallGoods;

public interface LitemallGoodsMapperResultMap {

	//根据id查询
	public LitemallGoods getLitemGoodsById(Integer id); 

	//查询商品广告
	public LitemallGoods getGoodsAndAd(Integer id);
	
	
	public LitemallGoods getGoodsAndAdStep(Integer id);
}
