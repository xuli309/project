package com.mybatis.helloworld.test;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.mybatis.helloworld.bean.LitemallAd;
import com.mybatis.helloworld.bean.LitemallGoods;
import com.mybatis.helloworld.dao.LitemallAdMapperResultMap;
import com.mybatis.helloworld.dao.LitemallGoodsMapperResultMap;

public class MyBatisTestResultMap {


	public SqlSessionFactory getSqlSessionFactory() throws IOException{
		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		return sqlSessionFactory;
	}
	
	
	@Test
	public void testSelectLitemall() throws Exception{
		
		SqlSessionFactory ssf= getSqlSessionFactory();
		
		SqlSession session = ssf.openSession();// ssf.openSession(true) 自动提交
		try{
			//获取Mapper接口的代理实现类对象
			LitemallAdMapperResultMap mapper = session.getMapper(LitemallAdMapperResultMap.class);
			
			LitemallAd litemallAd = mapper.getLitemAdById(12);
			System.out.println(litemallAd);
			
//			LitemallAd litemallAd = mapper.getLitemAdAndGoods(12);
//			System.out.println(litemallAd);
//			System.out.println(litemallAd.getLitemallGoods());
		}finally{
			session.close();
		}
	}
	
	
	@Test
	public void testSelectLitemallAdAndGoods() throws Exception{
		
		SqlSessionFactory ssf= getSqlSessionFactory();
		
		SqlSession session = ssf.openSession();
		try{
			//获取Mapper接口的代理实现类对象
			LitemallAdMapperResultMap mapper = session.getMapper(LitemallAdMapperResultMap.class);
			
			LitemallAd litemallAd = mapper.getLitemAdByIdStep(12);
			System.out.println(litemallAd.getName());
			System.out.println("--------------------");
			System.out.println(litemallAd);
			System.out.println(litemallAd.getLitemallGoods());
		}finally{
			session.close();
		}
	}
	
	@Test
	public void testSelectLitemallCollection() throws Exception{
		
		SqlSessionFactory ssf= getSqlSessionFactory();
		
		SqlSession session = ssf.openSession();
		try{
			//获取Mapper接口的代理实现类对象
			LitemallGoodsMapperResultMap mapper = session.getMapper(LitemallGoodsMapperResultMap.class);
			
			LitemallGoods goods = mapper.getGoodsAndAd(1064007);
			System.out.println(goods);
			
		}finally{
			session.close();
		}
	}
	
	@Test
	public void testSelectLitemallCollectionStep() throws Exception{
		
		SqlSessionFactory ssf= getSqlSessionFactory();
		
		SqlSession session = ssf.openSession();
		try{
			//获取Mapper接口的代理实现类对象
			LitemallGoodsMapperResultMap mapper = session.getMapper(LitemallGoodsMapperResultMap.class);
			
			LitemallGoods goods = mapper.getGoodsAndAdStep(12);
			System.out.println(goods);
			System.out.println("====================");
			System.out.println(goods.getGoodsList());
			
			
		}finally{
			session.close();
		}
	}

}
