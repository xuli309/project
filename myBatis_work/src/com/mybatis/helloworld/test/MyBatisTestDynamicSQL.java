package com.mybatis.helloworld.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.mybatis.helloworld.bean.LitemallAd;
import com.mybatis.helloworld.dao.LitemallAdMapperDynamicSQL;

public class MyBatisTestDynamicSQL {
	public SqlSessionFactory getSqlSessionFactory() throws IOException{
		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		return sqlSessionFactory;
	}
	
	
	@Test
	public void testIf() throws Exception{
		SqlSessionFactory ssf= getSqlSessionFactory();
		
		SqlSession session = ssf.openSession();// ssf.openSession(true) 自动提交
		try{
			//获取Mapper接口的代理实现类对象
			LitemallAdMapperDynamicSQL mapper = session.getMapper(LitemallAdMapperDynamicSQL.class);
			
			LitemallAd litemallAd = new LitemallAd();
			litemallAd.setId(12);
			litemallAd.setName("合作食品");
			litemallAd.setContent("合作 食品");
			litemallAd.setDeleted(0);
			
			List<LitemallAd> list = mapper.getLitemAdByConditionIfWhere(litemallAd);
			System.out.println(list);
			
		}finally{
			session.close();
		}
	}
	
	@Test
	public void testTrim() throws Exception{
		SqlSessionFactory ssf= getSqlSessionFactory();
		
		SqlSession session = ssf.openSession();// ssf.openSession(true) 自动提交
		try{
			//获取Mapper接口的代理实现类对象
			LitemallAdMapperDynamicSQL mapper = session.getMapper(LitemallAdMapperDynamicSQL.class);
			
			LitemallAd litemallAd = new LitemallAd();
			litemallAd.setId(12);
			litemallAd.setName("合作食品");
			litemallAd.setContent("合作 食品");
			litemallAd.setDeleted(0);
			
			List<LitemallAd> list = mapper.getLitemAdByConditionTrim(litemallAd);
			System.out.println(list);
			
		}finally{
			session.close();
		}
	}
	
	@Test
	public void testSet() throws Exception{
		SqlSessionFactory ssf= getSqlSessionFactory();
		
		SqlSession session = ssf.openSession();// ssf.openSession(true) 自动提交
		try{
			//获取Mapper接口的代理实现类对象
			LitemallAdMapperDynamicSQL mapper = session.getMapper(LitemallAdMapperDynamicSQL.class);
			
			LitemallAd litemallAd = new LitemallAd();
			litemallAd.setId(12);
			litemallAd.setName("食品");
//			litemallAd.setContent("合作食品");
//			litemallAd.setDeleted(0);
			
			mapper.updateLitemAdConditionSet(litemallAd);
			
			session.commit();//提交操作
		}finally{
			session.close();
		}
	}
	
	
	@Test
	public void testChoose() throws Exception{
		SqlSessionFactory ssf= getSqlSessionFactory();
		
		SqlSession session = ssf.openSession();// ssf.openSession(true) 自动提交
		try{
			//获取Mapper接口的代理实现类对象
			LitemallAdMapperDynamicSQL mapper = session.getMapper(LitemallAdMapperDynamicSQL.class);
			
			LitemallAd litemallAd = new LitemallAd();
			litemallAd.setId(12);
			litemallAd.setName("合作");
			litemallAd.setContent("合作 食品");
			litemallAd.setDeleted(0);
			
			List<LitemallAd> list = mapper.getLitemAdByConditionChoose(litemallAd);
			System.out.println(list);
			
		}finally{
			session.close();
		}
	}
	
	
	
}
