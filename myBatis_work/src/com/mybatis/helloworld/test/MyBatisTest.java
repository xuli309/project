package com.mybatis.helloworld.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.mybatis.helloworld.bean.LitemallAd;
import com.mybatis.helloworld.dao.LitemallAdMapper;

public class MyBatisTest {

	@Test
	public void test() throws IOException {

		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		System.out.println(sqlSessionFactory);
		
		SqlSession session = sqlSessionFactory.openSession();
		
		System.out.println(session);
		try {
			
			LitemallAd itemallAdd =  session.selectOne("com.mybatis.helloworld.dao.LitemallAdDao.selectLitemallAd", 1);
			System.out.println(itemallAdd);
		} finally {
			session.close();
		}
	}
	
	@Test
	public void testHelloMapper() throws IOException {
		
		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession session = sqlSessionFactory.openSession();
		try{
			LitemallAdMapper dao = session.getMapper(LitemallAdMapper.class);
			LitemallAd litemallAd =  dao.getLitemAdById(1);
			System.out.println(litemallAd);
			
		}finally{
			session.close();
		}
		
	}
	
	public SqlSessionFactory getSqlSessionFactory() throws IOException{
		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		return sqlSessionFactory;
	}
	
	@Test
	public void testAdd() throws Exception{
		SqlSessionFactory ssf= getSqlSessionFactory();
		
		SqlSession session = ssf.openSession();// ssf.openSession(true) 自动提交
		
		try{
			//获取Mapper接口的代理实现类对象
			LitemallAdMapper mapper = session.getMapper(LitemallAdMapper.class);
			
			//查询
//			LitemallAd litemallAd = mapper.getLitemAdById(1);
//			System.out.println(litemallAd);
			
			//添加
			LitemallAd litemallAd = new LitemallAd(null, "合作  食品", "", "http://yanxuan.nosdn.127.net/8e50c65fda145e6dd1bf4fb7ee0fcecc.jpg", 1,
					"合作 食品", null, null, 1, new Date(), new Date(), 0);
			mapper.addLitemallAd(litemallAd);
			System.out.println(litemallAd.getId());
			/*
			 * JDBC操作获取新插入数据的主键值：
			Connection con = null;
			PreparedStatement ps = con.prepareStatement("sql", PreparedStatement.RETURN_GENERATED_KEYS);
			ps.executeUpdate();
			ps.getGeneratedKeys();//获取返回的key
			 */	
			
			//修改
//			LitemallAd litemallAd = new LitemallAd(5, "hezuo shiping", "", "http://yanxuan.nosdn.127.net/8e50c65fda145e6dd1bf4fb7ee0fcecc.jpg", 1,
//					"合作 食品", null, null, 1, new Date(), new Date(), 0);
//			mapper.updateLitemallAd(litemallAd);
			
			//删除
//			Integer result = mapper.deleteLitemallAd(9);
//			System.out.println(result);
			
			
			//提交操作
			session.commit();
			
			LitemallAd litemallAd2 = mapper.getLitemAdById(12);
			System.out.println(litemallAd2);
			
		}finally{
			session.close();
		}
	}
	
	
	@Test
	public void testSelectLitemall() throws Exception{
		
		SqlSessionFactory ssf= getSqlSessionFactory();
		
		SqlSession session = ssf.openSession();// ssf.openSession(true) 自动提交
		try{
			//获取Mapper接口的代理实现类对象
			LitemallAdMapper mapper = session.getMapper(LitemallAdMapper.class);
			
//			LitemallAd litemallAd = mapper.findLitemAd(12 ,"合作  食品");
//			System.out.println(litemallAd);
			
//			Map<String,Object> map = new HashMap<String,Object>();
//			map.put("id", 12);
//			map.put("name","合作食品");
//			LitemallAd litemallAd = mapper.findLitemAdByMap(map);
//			System.out.println(litemallAd);
			
//			List<LitemallAd> list = mapper.findLitemallAdList();
//			System.out.println(list);
			
//			Map<String,Object> map = mapper.getLitemallAdByIdReturnMap(12);
//			System.out.println(map);
			
			Map<Integer,LitemallAd> map = mapper.getAllLitemallsReturnMap();
			System.out.println(map);
			
		}finally{
			session.close();
		}
	}

}
