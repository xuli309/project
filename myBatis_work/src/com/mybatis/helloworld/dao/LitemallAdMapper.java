package com.mybatis.helloworld.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import com.mybatis.helloworld.bean.LitemallAd;

public interface LitemallAdMapper {

	//根据id查询
	public  LitemallAd getLitemAdById(Integer id); 
	
	//添加
	public void addLitemallAd(LitemallAd litemallAd);
	
	//修改
	public void updateLitemallAd(LitemallAd litemallAd);
	
	//删除
	public Integer deleteLitemallAd(Integer id);
	
	//根据id和name查询
	public  LitemallAd findLitemAd(
			@Param("id")Integer id,
			@Param("name")String name); 
	
	//用map查
	public LitemallAd findLitemAdByMap(Map<String, Object> map); 
	
	
	//查询列表
	public List<LitemallAd> findLitemallAdList();
	
	//根据id查询单条数据，返回map
	public Map<String,Object> getLitemallAdByIdReturnMap(Integer id);
	
	//查询多条数据返回一个Map
	@MapKey("id") // 指定使用对象的哪个属性来充当map的key
	public Map<Integer,LitemallAd>  getAllLitemallsReturnMap();

	
}
