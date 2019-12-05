package com.mybatis.helloworld.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
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
			litemallAd.setName("食品");
			litemallAd.setContent("合作 食品");
			litemallAd.setDeleted(0);
			
			List<LitemallAd> list = mapper.getLitemAdByConditionChoose(litemallAd);
			System.out.println(list);
			
		}finally{
			session.close();
		}
	}
	
	@Test
	public void testForeach() throws Exception{
		SqlSessionFactory ssf= getSqlSessionFactory();
		
		SqlSession session = ssf.openSession();// ssf.openSession(true) 自动提交
		try{
			//获取Mapper接口的代理实现类对象
			LitemallAdMapperDynamicSQL mapper = session.getMapper(LitemallAdMapperDynamicSQL.class);
			List<Integer> ids = new ArrayList<Integer>();
			ids.add(1);
			ids.add(2);
			ids.add(3);
			
			List<LitemallAd> list = mapper.getLitemAdByIds(ids);
			System.out.println(list);
			
		}finally{
			session.close();
		}
	}
	

	@Test
	public void testBatch() throws Exception{
		SqlSessionFactory ssf= getSqlSessionFactory();
		
		SqlSession session = ssf.openSession();
		try{
			
			LitemallAdMapperDynamicSQL mapper = session.getMapper(LitemallAdMapperDynamicSQL.class);
			
			//批量增加
			List<LitemallAd> list = new ArrayList<LitemallAd>();
			LitemallAd litemallAd0 = new LitemallAd(null, "aa", "", "http://yanxuan.nosdn.127.net/8e50c65fda145e6dd1bf4fb7ee0fcecc.jpg", 1,
					"aa", null, null, 1, new Date(), new Date(), 0);
			LitemallAd litemallAd1 = new LitemallAd(null, "bb", "", "http://yanxuan.nosdn.127.net/8e50c65fda145e6dd1bf4fb7ee0fcecc.jpg", 1,
					"bb", null, null, 1, new Date(), new Date(), 0);
			LitemallAd litemallAd2 = new LitemallAd(null, "cc", "", "http://yanxuan.nosdn.127.net/8e50c65fda145e6dd1bf4fb7ee0fcecc.jpg", 1,
					"cc", null, null, 1, new Date(), new Date(), 0);
			list.add(litemallAd0);
			list.add(litemallAd1);
			list.add(litemallAd2);
			
			mapper.addAds(list);
			session.commit();
		}finally{
			session.close();
		}
	}
	
	
	@Test
	public void testBatchDelete() throws Exception{
		SqlSessionFactory ssf= getSqlSessionFactory();
		
		SqlSession session = ssf.openSession();
		try{
			//批量删除
			LitemallAdMapperDynamicSQL mapper = session.getMapper(LitemallAdMapperDynamicSQL.class);
			List<Integer> ids = new ArrayList<Integer>();
			ids.add(16);
			ids.add(17);
			ids.add(18);
			
			mapper.deleteAds(ids);
			session.commit();
			
		}finally{
			session.close();
		}
	}
	
	
	@Test
	public void testBatchUpdate() throws Exception{
		SqlSessionFactory ssf= getSqlSessionFactory();
		
		SqlSession session = ssf.openSession();
		try{
			
			LitemallAdMapperDynamicSQL mapper = session.getMapper(LitemallAdMapperDynamicSQL.class);
			
			//批量修改
			List<LitemallAd> list = new ArrayList<LitemallAd>();
			LitemallAd litemallAd0 = new LitemallAd();
			litemallAd0.setId(12);
			litemallAd0.setName("合作合作");
			litemallAd0.setContent("合作合作");
			
			LitemallAd litemallAd1 = new LitemallAd();
			litemallAd1.setId(15);
			litemallAd1.setName("合作食品");
			litemallAd1.setContent("合作食品");
			
			list.add(litemallAd0);
			list.add(litemallAd1);
			
			mapper.updateAds(list);
			session.commit();
		}finally{
			session.close();
		}
	}
	
}
